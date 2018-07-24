package com.ccclubs.gateway.gb.dto;

import com.alibaba.fastjson.JSONObject;
import com.ccclubs.gateway.gb.inf.IExceptionDtoJsonParse;

import java.util.Objects;

/**
 * @Author: yeanzi
 * @Date: 2018/5/3
 * @Time: 18:32
 * Email:  yeanzhi@ccclubs.com
 * 消息处理异常总dto
 */
public class PackProcessExceptionDTO {

    private String vin;

    private String sourceHex;

    private Integer code;

    private IExceptionDtoJsonParse json;

    public String toJson() {
        JSONObject result = new JSONObject();
        result.put("vin", vin);
        result.put("code", code);
        if (Objects.nonNull(json)) {
            result.put("json", json.toJson());
        }
        result.put("sourceHex", sourceHex);
        return result.toJSONString();
    }

    public Integer getCode() {
        return code;
    }

    public PackProcessExceptionDTO setCode(Integer code) {
        this.code = code;
        return this;
    }

    public IExceptionDtoJsonParse getJson() {
        return json;
    }

    public PackProcessExceptionDTO setJson(IExceptionDtoJsonParse json) {
        this.json = json;
        return this;
    }

    public String getVin() {
        return vin;
    }

    public PackProcessExceptionDTO setVin(String vin) {
        this.vin = vin;
        return this;
    }

    public String getSourceHex() {
        return sourceHex;
    }

    public PackProcessExceptionDTO setSourceHex(String sourceHex) {
        this.sourceHex = sourceHex;
        return this;
    }
}
