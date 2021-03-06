package com.ccclubs.quota.orm.model;

import java.io.Serializable;
import java.math.BigDecimal;

public class VcDistrictMap implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column vc_district_map.css_number
     *
     * @mbg.generated
     */
    private String cssNumber;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column vc_district_map.css_longitude
     *
     * @mbg.generated
     */
    private BigDecimal cssLongitude;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column vc_district_map.css_latitude
     *
     * @mbg.generated
     */
    private BigDecimal cssLatitude;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table vc_district_map
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column vc_district_map.css_number
     *
     * @return the value of vc_district_map.css_number
     *
     * @mbg.generated
     */
    public String getCssNumber() {
        return cssNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column vc_district_map.css_number
     *
     * @param cssNumber the value for vc_district_map.css_number
     *
     * @mbg.generated
     */
    public void setCssNumber(String cssNumber) {
        this.cssNumber = cssNumber == null ? null : cssNumber.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column vc_district_map.css_longitude
     *
     * @return the value of vc_district_map.css_longitude
     *
     * @mbg.generated
     */
    public BigDecimal getCssLongitude() {
        return cssLongitude;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column vc_district_map.css_longitude
     *
     * @param cssLongitude the value for vc_district_map.css_longitude
     *
     * @mbg.generated
     */
    public void setCssLongitude(BigDecimal cssLongitude) {
        this.cssLongitude = cssLongitude;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column vc_district_map.css_latitude
     *
     * @return the value of vc_district_map.css_latitude
     *
     * @mbg.generated
     */
    public BigDecimal getCssLatitude() {
        return cssLatitude;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column vc_district_map.css_latitude
     *
     * @param cssLatitude the value for vc_district_map.css_latitude
     *
     * @mbg.generated
     */
    public void setCssLatitude(BigDecimal cssLatitude) {
        this.cssLatitude = cssLatitude;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vc_district_map
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
        VcDistrictMap other = (VcDistrictMap) that;
        return (this.getCssNumber() == null ? other.getCssNumber() == null : this.getCssNumber().equals(other.getCssNumber()))
            && (this.getCssLongitude() == null ? other.getCssLongitude() == null : this.getCssLongitude().equals(other.getCssLongitude()))
            && (this.getCssLatitude() == null ? other.getCssLatitude() == null : this.getCssLatitude().equals(other.getCssLatitude()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vc_district_map
     *
     * @mbg.generated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCssNumber() == null) ? 0 : getCssNumber().hashCode());
        result = prime * result + ((getCssLongitude() == null) ? 0 : getCssLongitude().hashCode());
        result = prime * result + ((getCssLatitude() == null) ? 0 : getCssLatitude().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vc_district_map
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", cssNumber=").append(cssNumber);
        sb.append(", cssLongitude=").append(cssLongitude);
        sb.append(", cssLatitude=").append(cssLatitude);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}