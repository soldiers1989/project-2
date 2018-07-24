package com.ccclubs.gateway.gb.handler.decode;

import com.ccclubs.frm.spring.gateway.ConnOnlineStatusEvent;
import com.ccclubs.frm.spring.gateway.ExpMessageDTO;
import com.ccclubs.gateway.gb.beans.KafkaTask;
import com.ccclubs.gateway.gb.constant.CommandType;
import com.ccclubs.gateway.gb.constant.KafkaSendTopicType;
import com.ccclubs.gateway.gb.constant.PackProcessExceptionCode;
import com.ccclubs.gateway.gb.handler.process.CCClubChannelInboundHandler;
import com.ccclubs.gateway.gb.message.GBPackage;
import com.ccclubs.gateway.gb.message.track.PacProcessTrack;
import com.ccclubs.gateway.gb.reflect.ClientCache;
import com.ccclubs.gateway.gb.reflect.GBConnection;
import com.ccclubs.gateway.gb.config.KafkaProperties;
import com.ccclubs.gateway.gb.service.KafkaService;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.socket.SocketChannel;
import io.netty.util.ReferenceCountUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.core.KafkaTemplate;

import java.util.Objects;

/**
 * @Author: yeanzi
 * @Date: 2018/4/27
 * @Time: 9:46
 * Email:  yeanzhi@ccclubs.com
 * 连接数据统计处理器
 *      该类不可与其他渠道共享
 */
public class ConnStatisticsHandler extends CCClubChannelInboundHandler<GBPackage> {
    private static final Logger LOG = LoggerFactory.getLogger(ConnStatisticsHandler.class);

    private KafkaService kafkaService;

    private GBConnection conn;

    public ConnStatisticsHandler(KafkaService kafkaService) {
        this.kafkaService = kafkaService;
    }

    @Override
    protected boolean channelRead0(ChannelHandlerContext ctx, GBPackage pac, PacProcessTrack pacProcessTrack) throws Exception {
        SocketChannel channel = (SocketChannel)ctx.channel();
        if (pac.isErrorPac()) {

            ExpMessageDTO expMessageDTO = pacProcessTrack.getExpMessageDTO();
            expMessageDTO.setMsgTime(System.currentTimeMillis());
            // 依据不同的校验异常类型，写入不同的错误码
            switch (pac.getPacErrorType()) {
                case PAC_VALID_ERROR:
                    expMessageDTO.setCode(PackProcessExceptionCode.INVALID_FAIL.getCode());
                    break;
                case PAC_LENGTH_ERROR:
                    expMessageDTO
                            .setCode(PackProcessExceptionCode.LACK_LENGTH_FAIL.getCode());
                    break;
                    default:
                        break;
            }



            // 发送至kafka
            kafkaService.send(new KafkaTask(KafkaSendTopicType.ERROR,
                    pacProcessTrack.getVin(),
                    expMessageDTO.toJson()));

            countErrorPac(channel);
            // 错误包不进行下发
            ReferenceCountUtil.release(pac.getSourceBuff());
            return false;
        } else {
            // 因为错误包的数据不准确，所以不在错误包之前初始化连接
            GBConnection conn = getConn(pac.getHeader().getUniqueNo(), channel);
            // 统计总包数
            conn.increPackageNum();
            // 实时数据包则需要统计位置包数量
            if (pac.getHeader().getCommandMark().equals(CommandType.REALTIME_DATA)) {
                conn.increPositionPackageNum();// 位置包（实时信息包）数
            }

//            /**
//             * 测试动态添加/删除Handler
//             *      当收到包数超过500个少于1000，添加通道数据报告handler，之后每50个包之后报告一次通道数据
//             *      当数据包超过1万，删除报告handler
//             */
//            // -----------------------------------------------------
//            int allPacCount = conn.getPackageNum();
//            if (allPacCount > 500 && allPacCount < 1000) {
//                if (ctx.pipeline().get("singleChannelDatailHandler") == null) {
//                    LOG.info(">>> 添加singleChannelDatailHandler <<<");
//                    ctx.pipeline().addAfter("connStatisticsHandler", "singleChannelDatailHandler", new SingleChannelDetailHandler());
//                }
//            }
//
//            // 当收到包大于1万（模拟业务高峰），删除通道数据报告handler，以求效率
//            if (conn.getPackageNum() > 10000) {
//                if (ctx.pipeline().get("singleChannelDatailHandler") != null) {
//                    LOG.info(">>> 删除singleChannelDatailHandler >>>");
//                    ctx.pipeline().remove("singleChannelDatailHandler");
//                }
//            }
            // -----------------------------------------------------

            // 事件下发
            return true;
        }
    }

    /**
     * 统计异常包数量
     * @param channel
     */
    private void countErrorPac(SocketChannel channel) {
        GBConnection conn = ClientCache.getByChannelId(channel.id());
        if (Objects.nonNull(conn)) {
            conn.increErrorPacketNum();
        }
        // 如果channel不存在，不需要统计数据
    }

    /**
     * 获取当前渠道对应的连接
     *      如果连接不存在则初始化一个新连接
     * @param vin
     * @param channel
     * @return
     */
    public GBConnection getConn(String vin, SocketChannel channel) {
        if (Objects.isNull(conn)) {
            conn = ClientCache.checkConnection(vin, channel);

            if (!Objects.isNull(conn)) {
                ConnOnlineStatusEvent connOnlineStatusEvent = new ConnOnlineStatusEvent();
                connOnlineStatusEvent.setVin(vin)
                        .setOnline(true)
                        .setTimestamp(System.currentTimeMillis())
                        .setClientIp(channel.remoteAddress().getHostString())
                        .setServerIp(channel.localAddress().getHostString());

                // 发送至kafka
                kafkaService.send(new KafkaTask(KafkaSendTopicType.CONN, vin, connOnlineStatusEvent.toJson()));
            }
        }
        return conn;
    }
}
