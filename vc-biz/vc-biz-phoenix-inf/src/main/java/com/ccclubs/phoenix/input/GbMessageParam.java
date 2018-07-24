package com.ccclubs.phoenix.input;

import com.ccclubs.phoenix.orm.consts.PhoenixFieldsConsts;
import org.apache.commons.lang.StringUtils;

import java.io.Serializable;

/**
 * Created with IntelliJ IDEA2017.
 *
 * @Author: Alban
 * @Date: 2018/5/15
 * @Time: 15:49
 * @Description: 请填写描述！
 */

public class GbMessageParam extends CommonQuery implements Serializable,BaseParamInf {

    private static final long serialVersionUID = -4454296744605653475L;

    private String vin;

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
        return null;
    }

    @Override
    public void setTeNumber(String teNumber) {
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
            queryFields= StringUtils.join(PhoenixFieldsConsts.GBMESSAGE_ALL_FIELDS,",");
        }
        else if(StringUtils.isEmpty(queryFields)){
            queryFields= StringUtils.join(PhoenixFieldsConsts.GBMESSAGE_DEFAULT_FIELDS,",");
        }
        return queryFields;
    }

    @Override
    public void setQueryFields(String queryFields) {
        this.queryFields = queryFields;
    }
}
