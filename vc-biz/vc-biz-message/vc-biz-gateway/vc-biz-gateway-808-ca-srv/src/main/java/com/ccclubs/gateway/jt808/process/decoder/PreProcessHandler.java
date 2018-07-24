package com.ccclubs.gateway.jt808.process.decoder;

import com.alibaba.fastjson.JSONObject;
import com.ccclubs.gateway.common.constant.KafkaSendTopicType;
import com.ccclubs.gateway.common.dto.KafkaTask;
import com.ccclubs.gateway.common.service.KafkaService;
import com.ccclubs.gateway.jt808.service.TerOverseeService;
import com.ccclubs.gateway.jt808.util.PacUtil;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufUtil;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Author: yeanzi
 * @Date: 2018/5/16
 * @Time: 10:11
 * Email:  yeanzhi@ccclubs.com
 * 前置处理处理器
 */
@Component
@ChannelHandler.Sharable
public class PreProcessHandler extends ChannelInboundHandlerAdapter {
    private static final Logger LOG = LoggerFactory.getLogger(PreProcessHandler.class);

    /*电话号码最少字节位*/
    private static final int PAC_HEAD_PHONE_MIN = 11;

    @Autowired
    private KafkaService kafkaService;
    @Autowired
    private TerOverseeService terOverseeService;

    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {
        super.channelActive(ctx);
    }

    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
        if (!(msg instanceof ByteBuf)) {
            ctx.fireChannelRead(msg);
            return;
        }
        ByteBuf sourceBuf = (ByteBuf) msg;
        if (sourceBuf.readableBytes() < PAC_HEAD_PHONE_MIN) {
            super.channelRead(ctx, msg);
            return;
        }
        // 获取包中的mobile码
        String mobile = PacUtil.getMobileFromByteBuf(sourceBuf);
        // 原始报文(包括粘包的整包数据)
        String sourceHex = ByteBufUtil.hexDump(sourceBuf);

        long allStartTime = System.nanoTime();
        // 开始处理
        super.channelRead(ctx, msg);
        long allEndTime = System.nanoTime();

        // 记录监控车辆的数据
        if (StringUtils.isNotEmpty(mobile)) {
            if (terOverseeService.getAll().contains(mobile)) {
                JSONObject json = new JSONObject();
                json.put("createTime", System.currentTimeMillis());
                json.put("sourceHex", sourceHex);
                json.put("usedTime", allEndTime - allStartTime);
                kafkaService.send(new KafkaTask(KafkaSendTopicType.OVERSEE,
                        mobile,
                        json.toJSONString()));
            }
        }
        if (LOG.isDebugEnabled()) {
            LOG.debug("终端[{}]的报文[{}]处理时间为：{}", mobile, sourceHex, allEndTime - allStartTime);
        }
    }
}
