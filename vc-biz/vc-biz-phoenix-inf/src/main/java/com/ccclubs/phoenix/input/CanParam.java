package com.ccclubs.phoenix.input;

import com.ccclubs.phoenix.orm.consts.PhoenixFieldsConsts;
import org.apache.commons.lang.StringUtils;

import java.io.Serializable;

/**
 * Created with IntelliJ IDEA2017.
 *
 * @Author: Alban
 * @Date: 2018/5/15
 * @Time: 15:48
 * @Description: 请填写描述！
 */

public class CanParam extends CommonQuery implements Serializable,BaseParamInf {

    private static final long serialVersionUID = 1523254466062601494L;

    private String vin;

    private String teNumber;

    private String startTime;

    private String endTime;

    private String queryFields="";

    @Override
    public String getVin() {
        return vin;
    }

    @Override
    public void setVin(String vin) {
        this.vin = vin;
    }

    @Override
    public String getTeNumber() {
        return teNumber;
    }

    @Override
    public void setTeNumber(String teNumber) {
        this.teNumber = teNumber;
    }

    @Override
    public String getStartTime() {
        return startTime;
    }

    @Override
    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    @Override
    public String getEndTime() {
        return endTime;
    }

    @Override
    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    @Override
    public String getQueryFields() {
        queryFields= StringUtils.deleteWhitespace(queryFields);
        if("*".equals(queryFields)){
            queryFields= StringUtils.join(PhoenixFieldsConsts.CAN_ALL_FIELDS,",");
        }
        else if(StringUtils.isEmpty(queryFields)){
            queryFields= StringUtils.join(PhoenixFieldsConsts.CAN_DEFAULT_FIELDS,",");
        }
        return queryFields;
    }

    @Override
    public void setQueryFields(String queryFields) {
        this.queryFields = queryFields;
    }

}
