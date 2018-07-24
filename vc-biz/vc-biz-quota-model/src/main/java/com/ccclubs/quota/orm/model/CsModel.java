package com.ccclubs.quota.orm.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class CsModel implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cs_model.csm_id
     *
     * @mbg.generated
     */
    private Integer csmId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cs_model.csm_name
     *
     * @mbg.generated
     */
    private String csmName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cs_model.csm_flag
     *
     * @mbg.generated
     */
    private String csmFlag;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cs_model.csm_type
     *
     * @mbg.generated
     */
    private Integer csmType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cs_model.csm_file
     *
     * @mbg.generated
     */
    private Integer csmFile;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cs_model.csm_catagory
     *
     * @mbg.generated
     */
    private Integer csmCatagory;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cs_model.csm_tank_capacity
     *
     * @mbg.generated
     */
    private BigDecimal csmTankCapacity;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cs_model.csm_battery_capacity
     *
     * @mbg.generated
     */
    private BigDecimal csmBatteryCapacity;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cs_model.csm_status
     *
     * @mbg.generated
     */
    private Integer csmStatus;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cs_model.csm_add_time
     *
     * @mbg.generated
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone="GMT+8")
    private Date csmAddTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cs_model.csm_update_time
     *
     * @mbg.generated
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone="GMT+8")
    private Date csmUpdateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table cs_model
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cs_model.csm_id
     *
     * @return the value of cs_model.csm_id
     *
     * @mbg.generated
     */
    public Integer getCsmId() {
        return csmId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cs_model.csm_id
     *
     * @param csmId the value for cs_model.csm_id
     *
     * @mbg.generated
     */
    public void setCsmId(Integer csmId) {
        this.csmId = csmId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cs_model.csm_name
     *
     * @return the value of cs_model.csm_name
     *
     * @mbg.generated
     */
    public String getCsmName() {
        return csmName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cs_model.csm_name
     *
     * @param csmName the value for cs_model.csm_name
     *
     * @mbg.generated
     */
    public void setCsmName(String csmName) {
        this.csmName = csmName == null ? null : csmName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cs_model.csm_flag
     *
     * @return the value of cs_model.csm_flag
     *
     * @mbg.generated
     */
    public String getCsmFlag() {
        return csmFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cs_model.csm_flag
     *
     * @param csmFlag the value for cs_model.csm_flag
     *
     * @mbg.generated
     */
    public void setCsmFlag(String csmFlag) {
        this.csmFlag = csmFlag == null ? null : csmFlag.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cs_model.csm_type
     *
     * @return the value of cs_model.csm_type
     *
     * @mbg.generated
     */
    public Integer getCsmType() {
        return csmType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cs_model.csm_type
     *
     * @param csmType the value for cs_model.csm_type
     *
     * @mbg.generated
     */
    public void setCsmType(Integer csmType) {
        this.csmType = csmType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cs_model.csm_file
     *
     * @return the value of cs_model.csm_file
     *
     * @mbg.generated
     */
    public Integer getCsmFile() {
        return csmFile;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cs_model.csm_file
     *
     * @param csmFile the value for cs_model.csm_file
     *
     * @mbg.generated
     */
    public void setCsmFile(Integer csmFile) {
        this.csmFile = csmFile;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cs_model.csm_catagory
     *
     * @return the value of cs_model.csm_catagory
     *
     * @mbg.generated
     */
    public Integer getCsmCatagory() {
        return csmCatagory;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cs_model.csm_catagory
     *
     * @param csmCatagory the value for cs_model.csm_catagory
     *
     * @mbg.generated
     */
    public void setCsmCatagory(Integer csmCatagory) {
        this.csmCatagory = csmCatagory;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cs_model.csm_tank_capacity
     *
     * @return the value of cs_model.csm_tank_capacity
     *
     * @mbg.generated
     */
    public BigDecimal getCsmTankCapacity() {
        return csmTankCapacity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cs_model.csm_tank_capacity
     *
     * @param csmTankCapacity the value for cs_model.csm_tank_capacity
     *
     * @mbg.generated
     */
    public void setCsmTankCapacity(BigDecimal csmTankCapacity) {
        this.csmTankCapacity = csmTankCapacity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cs_model.csm_battery_capacity
     *
     * @return the value of cs_model.csm_battery_capacity
     *
     * @mbg.generated
     */
    public BigDecimal getCsmBatteryCapacity() {
        return csmBatteryCapacity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cs_model.csm_battery_capacity
     *
     * @param csmBatteryCapacity the value for cs_model.csm_battery_capacity
     *
     * @mbg.generated
     */
    public void setCsmBatteryCapacity(BigDecimal csmBatteryCapacity) {
        this.csmBatteryCapacity = csmBatteryCapacity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cs_model.csm_status
     *
     * @return the value of cs_model.csm_status
     *
     * @mbg.generated
     */
    public Integer getCsmStatus() {
        return csmStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cs_model.csm_status
     *
     * @param csmStatus the value for cs_model.csm_status
     *
     * @mbg.generated
     */
    public void setCsmStatus(Integer csmStatus) {
        this.csmStatus = csmStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cs_model.csm_add_time
     *
     * @return the value of cs_model.csm_add_time
     *
     * @mbg.generated
     */
    public Date getCsmAddTime() {
        return csmAddTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cs_model.csm_add_time
     *
     * @param csmAddTime the value for cs_model.csm_add_time
     *
     * @mbg.generated
     */
    public void setCsmAddTime(Date csmAddTime) {
        this.csmAddTime = csmAddTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cs_model.csm_update_time
     *
     * @return the value of cs_model.csm_update_time
     *
     * @mbg.generated
     */
    public Date getCsmUpdateTime() {
        return csmUpdateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cs_model.csm_update_time
     *
     * @param csmUpdateTime the value for cs_model.csm_update_time
     *
     * @mbg.generated
     */
    public void setCsmUpdateTime(Date csmUpdateTime) {
        this.csmUpdateTime = csmUpdateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cs_model
     *
     * @mbg.generated
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        CsModel other = (CsModel) that;
        return (this.getCsmId() == null ? other.getCsmId() == null : this.getCsmId().equals(other.getCsmId()))
            && (this.getCsmName() == null ? other.getCsmName() == null : this.getCsmName().equals(other.getCsmName()))
            && (this.getCsmFlag() == null ? other.getCsmFlag() == null : this.getCsmFlag().equals(other.getCsmFlag()))
            && (this.getCsmType() == null ? other.getCsmType() == null : this.getCsmType().equals(other.getCsmType()))
            && (this.getCsmFile() == null ? other.getCsmFile() == null : this.getCsmFile().equals(other.getCsmFile()))
            && (this.getCsmCatagory() == null ? other.getCsmCatagory() == null : this.getCsmCatagory().equals(other.getCsmCatagory()))
            && (this.getCsmTankCapacity() == null ? other.getCsmTankCapacity() == null : this.getCsmTankCapacity().equals(other.getCsmTankCapacity()))
            && (this.getCsmBatteryCapacity() == null ? other.getCsmBatteryCapacity() == null : this.getCsmBatteryCapacity().equals(other.getCsmBatteryCapacity()))
            && (this.getCsmStatus() == null ? other.getCsmStatus() == null : this.getCsmStatus().equals(other.getCsmStatus()))
            && (this.getCsmAddTime() == null ? other.getCsmAddTime() == null : this.getCsmAddTime().equals(other.getCsmAddTime()))
            && (this.getCsmUpdateTime() == null ? other.getCsmUpdateTime() == null : this.getCsmUpdateTime().equals(other.getCsmUpdateTime()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cs_model
     *
     * @mbg.generated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCsmId() == null) ? 0 : getCsmId().hashCode());
        result = prime * result + ((getCsmName() == null) ? 0 : getCsmName().hashCode());
        result = prime * result + ((getCsmFlag() == null) ? 0 : getCsmFlag().hashCode());
        result = prime * result + ((getCsmType() == null) ? 0 : getCsmType().hashCode());
        result = prime * result + ((getCsmFile() == null) ? 0 : getCsmFile().hashCode());
        result = prime * result + ((getCsmCatagory() == null) ? 0 : getCsmCatagory().hashCode());
        result = prime * result + ((getCsmTankCapacity() == null) ? 0 : getCsmTankCapacity().hashCode());
        result = prime * result + ((getCsmBatteryCapacity() == null) ? 0 : getCsmBatteryCapacity().hashCode());
        result = prime * result + ((getCsmStatus() == null) ? 0 : getCsmStatus().hashCode());
        result = prime * result + ((getCsmAddTime() == null) ? 0 : getCsmAddTime().hashCode());
        result = prime * result + ((getCsmUpdateTime() == null) ? 0 : getCsmUpdateTime().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cs_model
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", csmId=").append(csmId);
        sb.append(", csmName=").append(csmName);
        sb.append(", csmFlag=").append(csmFlag);
        sb.append(", csmType=").append(csmType);
        sb.append(", csmFile=").append(csmFile);
        sb.append(", csmCatagory=").append(csmCatagory);
        sb.append(", csmTankCapacity=").append(csmTankCapacity);
        sb.append(", csmBatteryCapacity=").append(csmBatteryCapacity);
        sb.append(", csmStatus=").append(csmStatus);
        sb.append(", csmAddTime=").append(csmAddTime);
        sb.append(", csmUpdateTime=").append(csmUpdateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}