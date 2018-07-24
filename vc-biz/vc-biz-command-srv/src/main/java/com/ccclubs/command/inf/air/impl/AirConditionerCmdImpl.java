package com.ccclubs.command.inf.air.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.alibaba.fastjson.JSONArray;
import com.ccclubs.command.dto.AirAllInput;
import com.ccclubs.command.dto.AirAllOutput;
import com.ccclubs.command.dto.AirMonoInput;
import com.ccclubs.command.dto.AirMonoOutput;
import com.ccclubs.command.inf.air.AirConditionerCmdInf;
import com.ccclubs.command.process.CommandProcessInf;
import com.ccclubs.command.remote.CsRemoteManager;
import com.ccclubs.command.util.*;
import com.ccclubs.command.version.CommandServiceVersion;
import com.ccclubs.common.validate.AuthValidateHelper;
import com.ccclubs.frm.spring.constant.ApiEnum;
import com.ccclubs.frm.spring.exception.ApiException;
import com.ccclubs.mongo.orm.model.remote.CsRemote;
import com.ccclubs.protocol.util.ProtocolTools;
import com.ccclubs.pub.orm.mapper.CsStructMapper;
import com.ccclubs.pub.orm.model.CsMachine;
import com.ccclubs.pub.orm.model.CsStructWithBLOBs;
import com.ccclubs.pub.orm.model.CsVehicle;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.helpers.MessageFormatter;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * 空调控制指令实现
 *
 * @author jianghaiyang
 * @create 2017-06-30
 **/
@Service(version = CommandServiceVersion.V1)
public class AirConditionerCmdImpl implements AirConditionerCmdInf {

    private static final Logger logger = LoggerFactory.getLogger(AirConditionerCmdImpl.class);

    @Autowired
    private CommandProcessInf process;

    @Autowired
    private CsStructMapper sdao;

    /**
     * 验证
     */
    @Resource
    private ValidateHelper validateHelper;

    /**
     * 指令发送结果
     */
    @Resource
    private ResultHelper resultHelper;

    @Resource
    private CsRemoteManager csRemoteManager;

    /**
     * 上下线查询
     */
    @Resource
    private TerminalOnlineHelper terminalOnlineHelper;

    @Resource
    IdGeneratorHelper idGen;

    /**
     * 身份认证
     */
    @Resource
    AuthValidateHelper authValidateHelper;

    @Override
    public AirMonoOutput airConditionerMonoCtrl(AirMonoInput input) {
        //数据权限校验
        boolean validateResult = authValidateHelper.validateAuth(input.getAppId(), input.getVin(), "");
        if (!validateResult) {
            throw new ApiException(ApiEnum.DATA_ACCESS_CHECK_FAILED);
        }

        // 获取结构ID
        Long structId = CommandConstants.CMD_AIR.longValue();
        if (input.getItem() == 1 && input.getValue() != 0 && input.getValue() != 1) {
            throw new ApiException(ApiEnum.AIR_CTRL_CIRCULAR_ERROR);
        }
        if (input.getItem() == 2 && input.getValue() != 0 && input.getValue() != 1) {
            throw new ApiException(ApiEnum.AIR_CTRL_PTC_ERROR);
        }
        if (input.getItem() == 3 && input.getValue() != 0 && input.getValue() != 1) {
            throw new ApiException(ApiEnum.AIR_CTRL_COMPRESS_ERROR);
        }
        if (input.getItem() == 4 && Arrays.binarySearch(CommandConstants.FAN, input.getValue()) < 0) {
            throw new ApiException(ApiEnum.AIR_CTRL_FAN_ERROR);
        }
        logger.debug("begin process command {} start.", structId);

        // 校验终端与车辆绑定关系是否正常，正常则返回终端车辆信息
        Map vm = validateHelper.isVehicleAndCsMachineBoundRight(input.getVin());
        CsVehicle csVehicle = (CsVehicle) vm.get(CommandConstants.MAP_KEY_CSVEHICLE);
        CsMachine csMachine = (CsMachine) vm.get(CommandConstants.MAP_KEY_CSMACHINE);

        // 0.检查终端是否在线
        terminalOnlineHelper.isOnline(csMachine, input.getVin());

        // 1.查询指令结构体定义
        CsStructWithBLOBs csStruct = sdao.selectByPrimaryKey(structId);
        String cssReq = csStruct.getCssRequest();
        List<Map> requests = JSONArray.parseArray(cssReq, java.util.Map.class);
        List<Map> values = JSONArray.parseArray(MessageFormatter.
                format("[{\"type\":\"{}\",\"ctrl\":\"{}\"}]", input.getItem(), input.getValue())
                .getMessage(), java.util.Map.class);
        Object[] array = ProtocolTools.getArray(requests, values);

        // 2.保存记录 cs_remote
        long csrId = idGen.getNextId();
        CsRemote csRemote = CsRemoteUtil.construct(csVehicle, csMachine, structId, array, input.getAppId(), csrId);
        csRemoteManager.asyncSave(csRemote);

        // 3.发送指令
        logger.debug("command send start.");
        process.dealRemoteCommand(csRemote, array);

        // 4.确认结果
        AirMonoOutput output = new AirMonoOutput();
        output = resultHelper.confirmResult(csRemote, input.getResultType(), output, csMachine);

        return output;
    }

    @Override
    public AirAllOutput airConditionerAllCtrl(AirAllInput input) {
        //数据权限校验
        boolean validateResult = authValidateHelper.validateAuth(input.getAppId(), input.getVin(), "");
        if (!validateResult) {
            throw new ApiException(ApiEnum.DATA_ACCESS_CHECK_FAILED);
        }
        Long structId = CommandConstants.CMD_AIR.longValue();
        logger.debug("begin process command {} start.", structId);
        // 校验终端与车辆绑定关系是否正常，正常则返回终端车辆信息
        Map vm = validateHelper.isVehicleAndCsMachineBoundRight(input.getVin());
        CsVehicle csVehicle = (CsVehicle) vm.get(CommandConstants.MAP_KEY_CSVEHICLE);
        CsMachine csMachine = (CsMachine) vm.get(CommandConstants.MAP_KEY_CSMACHINE);

        // 0.检查终端是否在线
        terminalOnlineHelper.isOnline(csMachine, input.getVin());

        // 1.查询指令结构体定义
        CsStructWithBLOBs csStruct = sdao.selectByPrimaryKey(Long.parseLong(structId.toString()));
        String cssReq = csStruct.getCssRequest();
        List<Map> requests = JSONArray.parseArray(cssReq, java.util.Map.class);
        List<Map> values = JSONArray.parseArray(MessageFormatter.
                        format("[{\"type\":\"{}\",\"ctrl\":\"{}\"}]", 5, getAllValue(input)).getMessage(),
                java.util.Map.class);
        Object[] array = ProtocolTools.getArray(requests, values);

        // 2.保存记录 cs_remote
        long csrId = idGen.getNextId();
        CsRemote csRemote = CsRemoteUtil.construct(csVehicle, csMachine, structId, array, input.getAppId(), csrId);
        csRemoteManager.asyncSave(csRemote);

        // 3.发送指令
        logger.debug("command send start.");
        process.dealRemoteCommand(csRemote, array);

        // 4.确认结果
        AirAllOutput output = new AirAllOutput();
        output = resultHelper.confirmResult(csRemote, input.getResultType(), output, csMachine);

        return output;
    }

    /**
     * 根据Evnet远程操作协议计算 全部控制情况下的操作值（8位二进制）
     */
    public int getAllValue(AirAllInput input) {
        int sum = input.getCircular() + (input.getPtc() << 1) + (input.getCompress() << 2);
        int value = (input.getFan() << 3) | sum;
        return value;
    }

}
