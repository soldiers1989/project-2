package com.ccclubs.phoenix.api;

import com.alibaba.dubbo.config.annotation.Reference;
import com.ccclubs.frm.spring.annotation.ApiSecurity;
import com.ccclubs.frm.spring.constant.ApiEnum;
import com.ccclubs.frm.spring.entity.ApiMessage;
import com.ccclubs.frm.spring.entity.DateTimeUtil;
import com.ccclubs.phoenix.inf.CarCanHistoryInf;
import com.ccclubs.phoenix.inf.CarGbHistoryInf;
import com.ccclubs.phoenix.inf.CarHistoryDeleteInf;
import com.ccclubs.phoenix.inf.CarStateHistoryInf;
import com.ccclubs.phoenix.input.*;
import com.ccclubs.phoenix.orm.model.CarState;
import com.ccclubs.phoenix.orm.model.Pace;
import com.ccclubs.phoenix.output.*;
import com.ccclubs.vehicle.inf.base.TransformForBizInf;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("history")
public class CarHistoryApi {

    private static final Logger logger= LoggerFactory.getLogger(CarHistoryApi.class);
    private static final long ONE_MOUTH=2592000000L;
    private static final long ONE_WEEK=604800000L;

    @Reference(version = "1.0.0")
    private CarStateHistoryInf carStateHistoryInf;

    @Reference(version = "1.0.0")
    private CarCanHistoryInf carCanHistoryInf;

    @Reference(version = "1.0.0")
    private CarGbHistoryInf carGbHistoryService;

    @Reference(version = "1.0.0")
    private TransformForBizInf transformForBizService;

    @Reference(version = "1.0.0")
    private CarHistoryDeleteInf carHistoryDeleteInf;


    @ApiSecurity
    @RequestMapping(value = "/states-query",method = RequestMethod.POST)
    public ApiMessage<CarStateHistoryOutput> queryCarStateList(@RequestBody CarStateHistoryParam param) {
        logger.info("we get a request form states:"+param.toString());

        if (this.paramTimeCheck(param.getStart_time(),param.getEnd_time())){
            logger.info("we find a states request. 查询间隔过长。");
            return new ApiMessage<>(100003, ApiEnum.REQUEST_PARAMS_VALID_FAILED.msg()+"查询间隔过长");
        }
        param.setCs_number(transformForBizService.getCsNumberByCsVin(param.getCsVin()));
        if (null==param.getCs_number()||param.getCs_number().isEmpty()){
            logger.info("we find a PARAMS_VALID_FAILED at states.");
            return new ApiMessage<>(100003, ApiEnum.REQUEST_PARAMS_VALID_FAILED.msg());
        }
        logger.debug("we receive a state get request."+param.toString());
        if (!paramCheck(param.getCs_number(),
                param.getStart_time(),
                param.getEnd_time(),
                param.getPage_no(),
                param.getPage_size()))
        {
            return new ApiMessage<>(100003, ApiEnum.REQUEST_PARAMS_VALID_FAILED.msg());
        }
        CarStateHistoryOutput carStateHistoryOutput= carStateHistoryInf.queryCarStateListByOutput(param);
        return new ApiMessage<>(carStateHistoryOutput);
    }

    @ApiSecurity
    @RequestMapping(value = "/getVehicleStatesByLimit",method = RequestMethod.POST)
    public ApiMessage<StateHistoryOutput> queryCarStateListByLimit(@RequestBody StateHistoryParam param) {
        logger.info("we get a request form states:"+param.toString());

        if (!StringUtils.isEmpty(param.getVin())){
            param.setTeNumber(transformForBizService.getCsNumberByCsVin(param.getVin()));
        }
        if (StringUtils.isEmpty(param.getTeNumber())
                ||StringUtils.isEmpty(param.getTimePoint())
                ){
            logger.info("we find a PARAMS_VALID_FAILED at states.");
            return new ApiMessage<>(100003, ApiEnum.REQUEST_PARAMS_VALID_FAILED.msg());
        }
        logger.debug("we receive a state get request."+param.toString());
        StateHistoryOutput stateHistoryOutput= carStateHistoryInf.queryCarStateListWithLimit(param);
        return new ApiMessage<>(stateHistoryOutput);
    }

    @ApiSecurity
    @RequestMapping(value = "/delete-obdmiles",method = RequestMethod.POST)
    public ApiMessage<HistoryNoQueryOutput> deleteCarStateList(@RequestBody List<HistoryDeleteParam> paramList){
        logger.info("we get a request form delete states:"+paramList.toString());
        HistoryNoQueryOutput historyNoQueryOutput= carHistoryDeleteInf.deleteCarStateHistory(paramList);
        return new ApiMessage<>(historyNoQueryOutput);
    }

    @ApiSecurity
    @RequestMapping(value = "/update-obdmiles",method = RequestMethod.POST)
    public ApiMessage<HistoryNoQueryOutput> updateCarStateList(@RequestBody List<CarStateHistoryUpdateParam> paramList){
        logger.info("we get a request form update states obdmiles:"+paramList.toString());
        HistoryNoQueryOutput historyNoQueryOutput= carStateHistoryInf.updateCarStateObdMiles(paramList);
        return new ApiMessage<>(historyNoQueryOutput);
    }


    //驾驶阶段数据查询
    @ApiSecurity
    @RequestMapping(value = "/drivepaces-query",method = RequestMethod.POST)
    public ApiMessage<CarStateHistoryOutput> queryDrivePaces(@RequestBody CarStateHistoryParam param) {
        logger.info("we get a request form drivepaces:"+param.toString());
        if (this.paramTimeCheck(param.getStart_time(),param.getEnd_time())){
            logger.info("we find a states request. 查询间隔过长。");
            return new ApiMessage<>(100003, ApiEnum.REQUEST_PARAMS_VALID_FAILED.msg()+"查询间隔过长");
        }
        param.setCs_number(transformForBizService.getCsNumberByCsVin(param.getCsVin()));
        if (null==param.getCs_number()||param.getCs_number().isEmpty()){
            logger.info("we find a PARAMS_VALID_FAILED at drivepaces.");
            return new ApiMessage<>(100003, ApiEnum.REQUEST_PARAMS_VALID_FAILED.msg());
        }
        if (!paramCheck(param.getCs_number(),
                param.getStart_time(),
                param.getEnd_time(),
                param.getPage_no(),
                param.getPage_size()))
        {
            return new ApiMessage<>(100003, ApiEnum.REQUEST_PARAMS_VALID_FAILED.msg());
        }
        CarStateHistoryOutput carStateHistoryOutput=new CarStateHistoryOutput();
        param.setOrder("asc");
        param.setQuery_fields("PACE");
        param.setPage_no(-1);
        List<CarState> carStateList= carStateHistoryInf.queryCarStateListByOutput(param).getList();
        //Collections.reverse(carStateList);
        List<Pace> paceList = carStateHistoryInf.calDrivePaceList(carStateList);
        carStateHistoryOutput.setPaceList(paceList);
        //carStateHistoryOutput.setTotal(param.getPage_size()*100L);
        return new ApiMessage<>(carStateHistoryOutput);
    }


    //车辆GB数据查询
    @RequestMapping(value = "/gbs",method = RequestMethod.GET)
    public ApiMessage<CarGbHistoryOutput> queryCarGbList(CarGbHistoryParam param){
        logger.debug("we receive a gb get request."+param.toString());
        if (this.paramTimeCheck(param.getStart_time(),param.getEnd_time())){
            logger.info("we find a states request. 查询间隔过长。");
            return new ApiMessage<>(100003, ApiEnum.REQUEST_PARAMS_VALID_FAILED.msg()+"查询间隔过长");
        }
        if (!paramCheck(param.getCs_vin(),
                param.getStart_time(),
                param.getEnd_time(),
                param.getPage_no(),
                param.getPage_size()))
        {
            return new ApiMessage<>(100003, ApiEnum.REQUEST_PARAMS_VALID_FAILED.msg());
        }
        CarGbHistoryOutput carGbHistoryOutput= carGbHistoryService.queryCarGbListByOutput(param);
        return new ApiMessage<>(carGbHistoryOutput);
    }


    //状态查询，内部
    @RequestMapping(value = "/states-internal",method = RequestMethod.GET)
    public ApiMessage<CarStateHistoryOutput> queryCarStateListInternal(CarStateHistoryParam param) {
        logger.info("we get a internal request form states:"+param.toString());
        if (this.paramTimeCheck(param.getStart_time(),param.getEnd_time())){
            logger.info("we find a states request. 查询间隔过长。");
            return new ApiMessage<>(100003, ApiEnum.REQUEST_PARAMS_VALID_FAILED.msg()+"查询间隔过长");
        }
        if (null==param.getCs_number()||param.getCs_number().isEmpty()){
            logger.info("we find a PARAMS_VALID_FAILED at states."+param.toString());
            return new ApiMessage<>(100003, ApiEnum.REQUEST_PARAMS_VALID_FAILED.msg());
        }
        logger.debug("we receive a state get request."+param.toString());
        if (!paramCheck(param.getCs_number(),
                param.getStart_time(),
                param.getEnd_time(),
                param.getPage_no(),
                param.getPage_size()))
        {
            return new ApiMessage<>(100003, ApiEnum.REQUEST_PARAMS_VALID_FAILED.msg());
        }
        CarStateHistoryOutput carStateHistoryOutput= carStateHistoryInf.queryCarStateListByOutput(param);
        return new ApiMessage<>(carStateHistoryOutput);
    }


    //驾驶阶段数据查询(内部使用)
    @RequestMapping(value = "/drivepaces-internal",method = RequestMethod.GET)
    public ApiMessage<CarStateHistoryOutput> queryDrivePacesInternal(CarStateHistoryParam param) {
        logger.info("we get a Internal request form drivepaces:"+param.toString());
        if (this.paramTimeCheck(param.getStart_time(),param.getEnd_time())){
            logger.info("we find a states request. 查询间隔过长。");
            return new ApiMessage<>(100003, ApiEnum.REQUEST_PARAMS_VALID_FAILED.msg()+"查询间隔过长");
        }
        if (null==param.getCs_number()||param.getCs_number().isEmpty()){
            logger.info("we find a PARAMS_VALID_FAILED at drivepaces.");
            return new ApiMessage<>(100003, ApiEnum.REQUEST_PARAMS_VALID_FAILED.msg());
        }
        if (!paramCheck(param.getCs_number(),
                param.getStart_time(),
                param.getEnd_time(),
                param.getPage_no(),
                param.getPage_size()))
        {
            return new ApiMessage<>(100003, ApiEnum.REQUEST_PARAMS_VALID_FAILED.msg());
        }
        CarStateHistoryOutput carStateHistoryOutput=new CarStateHistoryOutput();
        param.setOrder("asc");
        param.setQuery_fields("PACE");
        param.setPage_no(-1);
        List<CarState> carStateList= carStateHistoryInf.queryCarStateListByOutput(param).getList();
        //Collections.reverse(carStateList);
        List<Pace> paceList = carStateHistoryInf.calDrivePaceList(carStateList);
        carStateHistoryOutput.setPaceList(paceList);
        //carStateHistoryOutput.setTotal(param.getPage_size()*100L);
        return new ApiMessage<>(carStateHistoryOutput);
    }


    //车辆CAN数据查询
    @RequestMapping(value = "/cans",method = RequestMethod.GET)
    public ApiMessage<CarCanHistoryOutput> queryCarCanList(CarCanHistoryParam param){
        logger.debug("we receive a can get request."+param.toString());
        if (this.paramTimeCheck(param.getStart_time(),param.getEnd_time())){
            logger.info("we find a states request. 查询间隔过长。");
            return new ApiMessage<>(100003, ApiEnum.REQUEST_PARAMS_VALID_FAILED.msg()+"查询间隔过长");
        }
        if (!paramCheck(param.getCs_number(),
                param.getStart_time(),
                param.getEnd_time(),
                param.getPage_no(),
                param.getPage_size()))
        {
            return new ApiMessage<>(100003, ApiEnum.REQUEST_PARAMS_VALID_FAILED.msg());
        }
        CarCanHistoryOutput carCanHistoryOutput= carCanHistoryInf.queryCarCanListByOutput(param);
        return new ApiMessage<>(carCanHistoryOutput);
    }


    //充电阶段数据查询
    @RequestMapping(value = "/chargingpaces",method = RequestMethod.GET)
    public ApiMessage<CarStateHistoryOutput> queryChargingPaces(CarStateHistoryParam param){
        if (this.paramTimeCheck(param.getStart_time(),param.getEnd_time())){
            logger.info("we find a states request. 查询间隔过长。");
            return new ApiMessage<>(100003, ApiEnum.REQUEST_PARAMS_VALID_FAILED.msg()+"查询间隔过长");
        }
        if (!paramCheck(param.getCs_number(),
                param.getStart_time(),
                param.getEnd_time(),
                param.getPage_no(),
                param.getPage_size()))
        {
            return new ApiMessage<>(100003, ApiEnum.REQUEST_PARAMS_VALID_FAILED.msg());
        }
        CarStateHistoryOutput carStateHistoryOutput=new CarStateHistoryOutput();
        param.setOrder("asc");
        param.setQuery_fields("PACE");
        param.setPage_no(-1);

        List<CarState> carStateList= carStateHistoryInf.queryCarStateListByOutput(param).getList();
        //Collections.reverse(carStateList);
        List<Pace> paceList = carStateHistoryInf.calChargingPaceList(carStateList);
        carStateHistoryOutput.setPaceList(paceList);
        //carStateHistoryOutput.setTotal(param.getPage_size()*100);
        return new ApiMessage<>(carStateHistoryOutput);
    }


    private boolean paramCheck(String csNumber,String startTime,String endTime,Integer pageNo,Integer pageSize){
        if (null==csNumber||null==endTime||null==startTime){return false;}
        if (csNumber.isEmpty()||endTime.isEmpty()||startTime.isEmpty()){return false;}
        if (pageNo<-1||pageNo==0){return false;}
        if (pageSize<=0){return false;}
        if (pageSize>5000){return false;}
        try {
            DateTimeUtil.date2UnixFormat(startTime,DateTimeUtil.UNIX_FORMAT);
            DateTimeUtil.date2UnixFormat(endTime,DateTimeUtil.UNIX_FORMAT);
        }catch (Exception e){
            return false;
        }
        return true;
    }

    /**
     * 检查查询的时间，其查询的间隔不能过长。
     * */
    private boolean paramTimeCheck(String startTime,String endTime){
        boolean flag =false;//false为验证通过。
        long startTimeLong=DateTimeUtil.date2UnixFormat(startTime,DateTimeUtil.UNIX_FORMAT);
        long endTimeLong=DateTimeUtil.date2UnixFormat(endTime,DateTimeUtil.UNIX_FORMAT);
        long timeLong=endTimeLong-startTimeLong;
        if(timeLong>ONE_MOUTH){
            flag=true;
        }
        return flag;
    }


}
