package com.ccclubs.vehicle.inf.base;

import com.ccclubs.vehicle.dto.VehicleBaseInput;
import com.ccclubs.vehicle.dto.VehicleBaseOutput;

/**
 * 车辆基础数据查询接口
 *
 * @author jianghaiyang
 * @create 2017-06-28
 **/
public interface QueryVehicleBaseInf {

    // 获取车辆出厂日期及车辆的颜色
    VehicleBaseOutput getProdDateAndCarColor(VehicleBaseInput input);
}
