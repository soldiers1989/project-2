package com.ccclubs.engine.rule.inf.impl;

import com.alibaba.fastjson.JSON;
import com.aliyun.openservices.ons.api.Message;
import com.aliyun.openservices.ons.api.Producer;
import com.ccclubs.common.modify.UpdateTerminalService;
import com.ccclubs.common.query.QueryAppInfoService;
import com.ccclubs.common.query.QueryTerminalService;
import com.ccclubs.engine.core.util.MessageFactory;
import com.ccclubs.engine.core.util.TerminalUtils;
import com.ccclubs.engine.rule.inf.IMqAckService;
import com.ccclubs.engine.rule.inf.IParseGbDataService;
import com.ccclubs.engine.rule.inf.util.LogicHelperJt808;
import com.ccclubs.engine.rule.inf.util.TransformUtils;
import com.ccclubs.frm.logger.VehicleControlLogger;
import com.ccclubs.frm.spring.util.EnvironmentUtils;
import com.ccclubs.helper.MachineMapping;
import com.ccclubs.mongo.modify.UpdateLoggerService;
import com.ccclubs.protocol.dto.gb.GBMessage;
import com.ccclubs.protocol.dto.jt808.*;
import com.ccclubs.protocol.dto.mqtt.MqMessage;
import com.ccclubs.protocol.dto.transform.TerminalNotRegister;
import com.ccclubs.protocol.inf.IMqMessageProcessService;
import com.ccclubs.protocol.inf.IParseDataService;
import com.ccclubs.protocol.util.ConstantUtils;
import com.ccclubs.protocol.util.MqTagProperty;
import com.ccclubs.protocol.util.MqTagUtils;
import com.ccclubs.protocol.util.StringUtils;
import com.ccclubs.pub.orm.model.*;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import static com.ccclubs.engine.core.util.RuleEngineConstant.MACHINEMAPPING_CARNUMBER;
import static com.ccclubs.engine.core.util.RuleEngineConstant.MACHINEMAPPING_SIMNO;

/**
 * 处理网关gateway发送出来的消息
 * 订阅Topic：ser
 * 订阅Tag：GB||JT_0200||JT_0201||JT_0704||JT_0100||JT_0900_01||JT_0900_FD||MQTT_41||MQTT_66||MQTT_42||MQTT_64||MQTT_43||MQTT_44||MQTT_45||MQTT_52||MQTT_53||MQTT_60||MQTT_68||MQTT_69||MQTT_6B||MQTT_6C||JT_01F0||JT_7F04
 * 备注：包括808信息，国标信息，分时租赁信息
 */
public class MqMessageProcessService implements IMqMessageProcessService {

    private static Logger logger = LoggerFactory.getLogger(MqMessageProcessService.class);
    private static final Logger loggerBusiness = VehicleControlLogger.getLogger();

    private IMqAckService mqAckService;
    private IParseDataService parseDataService;
    private IParseGbDataService parseGbDataService;

    @Resource(name = "producer")
    private Producer client;

    @Value("${" + ConstantUtils.MQ_TOPIC + "}")
    String topic;

    @Resource
    MessageFactory messageFactory;

    @Resource
    LogicHelperJt808 logicHelperJt808;

    @Resource
    TerminalUtils terminalUtils;

    @Resource
    QueryAppInfoService queryHostInfoService;

    @Autowired
    EnvironmentUtils environmentUtils;

    @Autowired
    UpdateLoggerService updateLoggerService;

    @Resource
    QueryTerminalService queryTerminalService;

    @Autowired
    UpdateTerminalService updateTerminalService;

    /**
     * 通过 TAG 区分是哪种协议
     *
     * @param tag          区分是哪种协议
     * @param upTopic      mqtt主题
     * @param srcByteArray 原始字节数组
     * @param hexString    原始字节十六进制字符串
     */
    @Override
    public void processAliMqMsg(String tag, String upTopic, final byte[] srcByteArray,
                                final String hexString) {
        // 默认tag 为分时租赁协议TAG前缀
        if (StringUtils.empty(tag)) {
            tag = MqTagUtils.PROTOCOL_MQTT;
        }
        // 终端，车辆关联关系
        MachineMapping mapping;
        // 808协议
        if (tag.startsWith(MqTagUtils.PROTOCOL_JT808)) {
            T808Message msgFromTerminal = new T808Message();
            msgFromTerminal.ReadFromBytes(srcByteArray);
            // 消息类型
            int headerType = msgFromTerminal.getHeader().getMessageType();

            mapping = terminalUtils.getMapping(msgFromTerminal.getSimNo(), MACHINEMAPPING_SIMNO);
            if (mapping == null || mapping.getMachine() == null || StringUtils
                    .empty(mapping.getNumber())) {
                loggerBusiness.info(
                        JSON.toJSONString(new TerminalNotRegister(msgFromTerminal.getSimNo(), "808",
                                "808协议，当前在线，但系统中不存在，请排查原因 ", msgFromTerminal.getPacketDescr())));
                return;
            }
            // 处理JT808协议对应的 0x0200,0x0201,0x0704,0x0900 这类消息
            if (headerType == 0x0200 || headerType == 0x0201) {
                JT_0200 jvi;
                if (headerType == 0x0200) {
                    jvi = (JT_0200) msgFromTerminal.getMessageContents();
                } else {
                    JT_0201 jt = (JT_0201) msgFromTerminal.getMessageContents();
                    jvi = jt.getPositionReport();
                }
                if (jvi == null) {
                    return;
                }
                // 组装808实时状态数据并更新cs_state
                logicHelperJt808.saveStatusData(mapping, msgFromTerminal, jvi);
                // 保存808位置历史数据
                logicHelperJt808.saveGeoData(mapping, msgFromTerminal, jvi);
                // 不再转发808数据(分时租赁协议会转发) modify by jhy 2018.5.9
                // transferToMq(mapping, csState);
            } else if (headerType == 0x0704) {
                // 定位补报，需要将补报的定位信息批量入库
                JT_0704 rd = (JT_0704) msgFromTerminal.getMessageContents();
                List<JT_0200> packetList = rd.getPositionReportList();
                // 定位补传数据
                for (JT_0200 jvi : packetList) {
                    logicHelperJt808.saveGeoData(mapping, msgFromTerminal, jvi);
                }
            } else if (headerType == 0x0900) {
                // 终端对平台的上行透传
                JT_0900 ack = (JT_0900) msgFromTerminal.getMessageContents();
                if (ack == null) {
                    return;
                }

                int msgType = ack.getMessageType();
                // 0x01 can透传信息；0xFD can 补传信息
                if (msgType == 0x01 || (msgType & 0xFF) == 0xFD) {
                    byte[] msgContent = ack.getMessageContent();
                    JT_0900_can canData = new JT_0900_can();
                    canData.ReadFromBytes(msgContent);
                    if (msgType == 0x01) {
                        transferToMq(mapping, msgFromTerminal, MqTagProperty.MQ_TERMINAL_CAN);
                        logicHelperJt808.saveCanData(mapping, msgFromTerminal, canData);
                    } else {
                        transferToMq(mapping, msgFromTerminal, MqTagProperty.MQ_TERMINAL_CAN_FD);
                        logicHelperJt808
                                .saveCanData(mapping, msgFromTerminal, canData, ConstantUtils.NOTIFY_FD);
                    }
                }
            } else if (headerType == 0x01F0) {
                JT_01F0 updateData = (JT_01F0) msgFromTerminal.getMessageContents();
                if (updateData != null) {
                    // 写日志
                    updateLoggerService.save(msgFromTerminal.getSimNo(),
                            "FTP升级指令-" + updateData.getResultString(),
                            msgFromTerminal.getPacketDescr(), 0L);
                }
                return;
            } else if (headerType == 0x7F04) {
                // 写日志
                updateLoggerService.save(msgFromTerminal.getSimNo(), "终端CAN过滤表",
                        msgFromTerminal.getPacketDescr(), 0L);

            } else if (headerType == 0x0100) {
                /**
                 * 原终端注册流程
                 */
                JT_0100 registerData = (JT_0100) msgFromTerminal.getMessageContents();

                if (registerData == null) {
                    return;
                }
                String simNo = msgFromTerminal.getSimNo();
                // 查询终端绑定的车机
                CsMachine csMachine = queryTerminalService
                        .queryCsMachineByTeNo(registerData.getTerminalId());
                // 查询终端
                CsTerminal csTerminal = queryTerminalService
                        .queryCsTerminalByCstIdd(registerData.getTerminalId());
                // 更新终端注册信息
                Date now = new Date();
                if (csTerminal != null) {
                    CsTerminal newCsTerminal = new CsTerminal();
                    newCsTerminal.setCstId(csTerminal.getCstId());
                    newCsTerminal.setCstMobile(simNo);
                    newCsTerminal.setCstUpdateTime(now);
                    updateTerminalService.update(newCsTerminal);
                } else {
                    // 写入终端注册信息
                    CsTerminal newCsTerminal = new CsTerminal();
                    newCsTerminal.setCstAddTime(now);
                    newCsTerminal.setCstCity(String.valueOf(registerData.getCityId()));
                    newCsTerminal.setCstColor((short) registerData.getPlateColor());
                    newCsTerminal.setCstIdd(registerData.getTerminalId());
                    newCsTerminal.setCstMade(registerData.getManufactureId());
                    newCsTerminal.setCstModel(registerData.getTerminalModelNo());
                    newCsTerminal.setCstNumber(registerData.getPlateNo());
                    newCsTerminal.setCstStatus((byte) 1);
                    newCsTerminal.setCstProvince(String.valueOf(registerData.getProvinceId()));
                    // 终端未授权
                    //						newCsTerminal.setCstStatus((short) 3);
                    newCsTerminal.setCstMobile(simNo);
                    newCsTerminal.setCstUpdateTime(now);
                    //
                    updateTerminalService.insert(newCsTerminal);
                }

                if (csMachine != null) {
                    // 更新初次激活时间
                    if (csMachine.getCsmCeFirst() == null) {
                        CsMachine updateMachine = new CsMachine();
                        updateMachine.setCsmId(csMachine.getCsmId());
                        updateMachine.setCsmUpdateTime(now);
                        updateMachine.setCsmCeFirst(now);
                        updateTerminalService.update(updateMachine);
                    }
                }
            }
            return;
        }

        // 国标协议
        /*if (tag.startsWith(MqTagUtils.PROTOCOL_GB)) {
            GBMessage gbMessage = new GBMessage();
            gbMessage.ReadFromBytes(srcByteArray);

            if (null == gbMessage.getHeader() || StringUtils
                    .empty(gbMessage.getVin())) {
                return;
            }

            getParseGbDataService().processMessage(gbMessage);
            return;
        }*/

        // MQTT 分时租赁 协议
        if (tag.startsWith(MqTagUtils.PROTOCOL_MQTT)) {
            MqMessage mqMessage = new MqMessage();
            mqMessage.ReadFromBytes(srcByteArray);

            mapping = terminalUtils.getMapping(mqMessage.getCarNumber(), MACHINEMAPPING_CARNUMBER);
            if (mapping == null || mapping.getMachine() == null || StringUtils
                    .empty(mapping.getNumber())) {
                loggerBusiness.info(JSON.toJSONString(
                        new TerminalNotRegister(mqMessage.getCarNumber(), "MQTT",
                                "MQTT协议终端 或 808协议含分时租赁插件终端，当前在线，但系统中不存在，请排查原因 ", mqMessage.getHexString())));
                return;
            }

            if (!StringUtils.empty(mqMessage.getCarNumber())) {
                mqMessage.setUpTopic(upTopic);
                mqMessage.setHexString(hexString);
                // 设置时间有效性，暂时设置为 60*1000 ，主要用于流转
                mqMessage.setTimeStamp(System.currentTimeMillis());

                // 消息入库
                getParseDataService().processMessage(mqMessage);

                // 启动应答服务
                getMqAckService().beginAck(mqMessage);
            }
            return;
        }
    }

    /**
     * 808协议 CAN 数据转发，主要用于各个地方平台补贴申报
     */
    private void transferToMq(MachineMapping mapping, T808Message message, String tag) {
        try {
            CsMachine csMachine = terminalUtils.getMappingMachine(mapping);
            if (mapping.getCar() == null) {
                return;
            }
            CsVehicle csVehicle = terminalUtils.getCsVehicle(mapping.getCar());

            if (csMachine == null || csVehicle == null || StringUtils.empty(csVehicle.getCsvLandmark())) {
                return;
            }

            Message mqMessage = messageFactory
                    .getMessage(csVehicle.getCsvLandmark(), topic, tag, message.getPacketDescr());

            if (mqMessage != null) {
                if (environmentUtils.isProdEnvironment()) {
                    client.send(mqMessage);
                }
            } else {
                logger.error(message.getSimNo() + " 未授权给应用");
            }
        } catch (Exception e) {
            e.printStackTrace();
            logger.error(e.getMessage(), e);
        }
    }

    /**
     * 转发到业务端MQ，已有绑定关系，不具备分时租赁功能的808协议的0200定位数据
     */
    private void transferToMq(MachineMapping mapping, CsState csState) {
        try {
            if (csState == null) {
                return;
            }

            // 终端未绑定到车辆，不转发
            if (mapping == null || mapping.getCar() == null) {
                return;
            }
            // 终端具备分时租赁功能，不转发，目前按照插件版本>0来判断终端具备分时租赁功能
            CsMachine csMachine = terminalUtils.getMappingMachine(mapping);
            if (csMachine == null || (csMachine.getCsmTlV2() != null && csMachine.getCsmTlV2() > 0)) {
                return;
            }

            SrvHost srvHost = queryHostInfoService.queryHostByIdFromCache(csMachine.getCsmAccess());
            if (srvHost == null) {
                return;
            }

            Message mqMessage = messageFactory
                    .getMessage(srvHost.getShTopic().trim(),
                            MqTagProperty.MQ_TERMINAL_STATUS + srvHost.getShId(),
                            JSON.toJSONBytes(TransformUtils
                                    .transform2TerminalStatus(csMachine, mapping.getVin(), csState)));

            if (mqMessage != null) {
                if (environmentUtils.isProdEnvironment()) {
                    client.send(mqMessage);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            logger.error(e.getMessage(), e);
        }
    }

    public Producer getClient() {
        return client;
    }

    public void setClient(Producer client) {
        this.client = client;
    }

    public IMqAckService getMqAckService() {
        return mqAckService;
    }

    public void setMqAckService(IMqAckService mqAckService) {
        this.mqAckService = mqAckService;
    }

    public IParseDataService getParseDataService() {
        return parseDataService;
    }

    public void setParseDataService(IParseDataService parseDataService) {
        this.parseDataService = parseDataService;
    }

    public IParseGbDataService getParseGbDataService() {
        return parseGbDataService;
    }

    public void setParseGbDataService(IParseGbDataService parseGbDataService) {
        this.parseGbDataService = parseGbDataService;
    }
}
