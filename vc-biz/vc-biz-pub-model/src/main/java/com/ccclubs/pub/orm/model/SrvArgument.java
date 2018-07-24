package com.ccclubs.pub.orm.model;

import java.io.Serializable;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table srv_argument
 *
 * @mbg.generated do_not_delete_during_merge
 */
public class SrvArgument implements Serializable {
    /**
     * Database Column Remarks:
     *   编号:
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column srv_argument.sa_id
     *
     * @mbg.generated
     */
    private Long saId;

    /**
     * Database Column Remarks:
     *   参数名称:
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column srv_argument.sa_name
     *
     * @mbg.generated
     */
    private String saName;

    /**
     * Database Column Remarks:
     *   参数标识:
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column srv_argument.sa_flag
     *
     * @mbg.generated
     */
    private String saFlag;

    /**
     * Database Column Remarks:
     *   参数值:
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column srv_argument.sa_value
     *
     * @mbg.generated
     */
    private String saValue;

    /**
     * Database Column Remarks:
     *   参数描述:
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column srv_argument.sa_describe
     *
     * @mbg.generated
     */
    private String saDescribe;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table srv_argument
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column srv_argument.sa_id
     *
     * @return the value of srv_argument.sa_id
     *
     * @mbg.generated
     */
    public Long getSaId() {
        return saId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column srv_argument.sa_id
     *
     * @param saId the value for srv_argument.sa_id
     *
     * @mbg.generated
     */
    public void setSaId(Long saId) {
        this.saId = saId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column srv_argument.sa_name
     *
     * @return the value of srv_argument.sa_name
     *
     * @mbg.generated
     */
    public String getSaName() {
        return saName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column srv_argument.sa_name
     *
     * @param saName the value for srv_argument.sa_name
     *
     * @mbg.generated
     */
    public void setSaName(String saName) {
        this.saName = saName == null ? null : saName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column srv_argument.sa_flag
     *
     * @return the value of srv_argument.sa_flag
     *
     * @mbg.generated
     */
    public String getSaFlag() {
        return saFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column srv_argument.sa_flag
     *
     * @param saFlag the value for srv_argument.sa_flag
     *
     * @mbg.generated
     */
    public void setSaFlag(String saFlag) {
        this.saFlag = saFlag == null ? null : saFlag.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column srv_argument.sa_value
     *
     * @return the value of srv_argument.sa_value
     *
     * @mbg.generated
     */
    public String getSaValue() {
        return saValue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column srv_argument.sa_value
     *
     * @param saValue the value for srv_argument.sa_value
     *
     * @mbg.generated
     */
    public void setSaValue(String saValue) {
        this.saValue = saValue == null ? null : saValue.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column srv_argument.sa_describe
     *
     * @return the value of srv_argument.sa_describe
     *
     * @mbg.generated
     */
    public String getSaDescribe() {
        return saDescribe;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column srv_argument.sa_describe
     *
     * @param saDescribe the value for srv_argument.sa_describe
     *
     * @mbg.generated
     */
    public void setSaDescribe(String saDescribe) {
        this.saDescribe = saDescribe == null ? null : saDescribe.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table srv_argument
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
        SrvArgument other = (SrvArgument) that;
        return (this.getSaId() == null ? other.getSaId() == null : this.getSaId().equals(other.getSaId()))
            && (this.getSaName() == null ? other.getSaName() == null : this.getSaName().equals(other.getSaName()))
            && (this.getSaFlag() == null ? other.getSaFlag() == null : this.getSaFlag().equals(other.getSaFlag()))
            && (this.getSaValue() == null ? other.getSaValue() == null : this.getSaValue().equals(other.getSaValue()))
            && (this.getSaDescribe() == null ? other.getSaDescribe() == null : this.getSaDescribe().equals(other.getSaDescribe()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table srv_argument
     *
     * @mbg.generated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSaId() == null) ? 0 : getSaId().hashCode());
        result = prime * result + ((getSaName() == null) ? 0 : getSaName().hashCode());
        result = prime * result + ((getSaFlag() == null) ? 0 : getSaFlag().hashCode());
        result = prime * result + ((getSaValue() == null) ? 0 : getSaValue().hashCode());
        result = prime * result + ((getSaDescribe() == null) ? 0 : getSaDescribe().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table srv_argument
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", saId=").append(saId);
        sb.append(", saName=").append(saName);
        sb.append(", saFlag=").append(saFlag);
        sb.append(", saValue=").append(saValue);
        sb.append(", saDescribe=").append(saDescribe);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}