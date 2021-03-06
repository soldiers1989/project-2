package com.ccclubs.quota.orm.model;

import java.io.Serializable;

public class CsIndexExceptList implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cs_index_except_list.index_id
     *
     * @mbg.generated
     */
    private Long indexId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cs_index_except_list.car_list
     *
     * @mbg.generated
     */
    private String carList;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table cs_index_except_list
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cs_index_except_list.index_id
     *
     * @return the value of cs_index_except_list.index_id
     *
     * @mbg.generated
     */
    public Long getIndexId() {
        return indexId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cs_index_except_list.index_id
     *
     * @param indexId the value for cs_index_except_list.index_id
     *
     * @mbg.generated
     */
    public void setIndexId(Long indexId) {
        this.indexId = indexId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cs_index_except_list.car_list
     *
     * @return the value of cs_index_except_list.car_list
     *
     * @mbg.generated
     */
    public String getCarList() {
        return carList;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cs_index_except_list.car_list
     *
     * @param carList the value for cs_index_except_list.car_list
     *
     * @mbg.generated
     */
    public void setCarList(String carList) {
        this.carList = carList == null ? null : carList.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cs_index_except_list
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
        CsIndexExceptList other = (CsIndexExceptList) that;
        return (this.getIndexId() == null ? other.getIndexId() == null : this.getIndexId().equals(other.getIndexId()))
            && (this.getCarList() == null ? other.getCarList() == null : this.getCarList().equals(other.getCarList()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cs_index_except_list
     *
     * @mbg.generated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getIndexId() == null) ? 0 : getIndexId().hashCode());
        result = prime * result + ((getCarList() == null) ? 0 : getCarList().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cs_index_except_list
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", indexId=").append(indexId);
        sb.append(", carList=").append(carList);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}