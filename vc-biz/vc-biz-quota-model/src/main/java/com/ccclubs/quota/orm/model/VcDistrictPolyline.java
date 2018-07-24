package com.ccclubs.quota.orm.model;

import java.io.Serializable;
import java.math.BigDecimal;

public class VcDistrictPolyline implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column vc_district_polyline.polyline_id
     *
     * @mbg.generated
     */
    private String polylineId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column vc_district_polyline.district_id
     *
     * @mbg.generated
     */
    private String districtId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column vc_district_polyline.polyline_longitude
     *
     * @mbg.generated
     */
    private BigDecimal polylineLongitude;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column vc_district_polyline.polyline_latitude
     *
     * @mbg.generated
     */
    private BigDecimal polylineLatitude;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column vc_district_polyline.gps84_longitude
     *
     * @mbg.generated
     */
    private BigDecimal gps84Longitude;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column vc_district_polyline.gps84_latitude
     *
     * @mbg.generated
     */
    private BigDecimal gps84Latitude;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column vc_district_polyline.polyline_zone
     *
     * @mbg.generated
     */
    private Integer polylineZone;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table vc_district_polyline
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column vc_district_polyline.polyline_id
     *
     * @return the value of vc_district_polyline.polyline_id
     *
     * @mbg.generated
     */
    public String getPolylineId() {
        return polylineId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column vc_district_polyline.polyline_id
     *
     * @param polylineId the value for vc_district_polyline.polyline_id
     *
     * @mbg.generated
     */
    public void setPolylineId(String polylineId) {
        this.polylineId = polylineId == null ? null : polylineId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column vc_district_polyline.district_id
     *
     * @return the value of vc_district_polyline.district_id
     *
     * @mbg.generated
     */
    public String getDistrictId() {
        return districtId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column vc_district_polyline.district_id
     *
     * @param districtId the value for vc_district_polyline.district_id
     *
     * @mbg.generated
     */
    public void setDistrictId(String districtId) {
        this.districtId = districtId == null ? null : districtId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column vc_district_polyline.polyline_longitude
     *
     * @return the value of vc_district_polyline.polyline_longitude
     *
     * @mbg.generated
     */
    public BigDecimal getPolylineLongitude() {
        return polylineLongitude;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column vc_district_polyline.polyline_longitude
     *
     * @param polylineLongitude the value for vc_district_polyline.polyline_longitude
     *
     * @mbg.generated
     */
    public void setPolylineLongitude(BigDecimal polylineLongitude) {
        this.polylineLongitude = polylineLongitude;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column vc_district_polyline.polyline_latitude
     *
     * @return the value of vc_district_polyline.polyline_latitude
     *
     * @mbg.generated
     */
    public BigDecimal getPolylineLatitude() {
        return polylineLatitude;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column vc_district_polyline.polyline_latitude
     *
     * @param polylineLatitude the value for vc_district_polyline.polyline_latitude
     *
     * @mbg.generated
     */
    public void setPolylineLatitude(BigDecimal polylineLatitude) {
        this.polylineLatitude = polylineLatitude;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column vc_district_polyline.gps84_longitude
     *
     * @return the value of vc_district_polyline.gps84_longitude
     *
     * @mbg.generated
     */
    public BigDecimal getGps84Longitude() {
        return gps84Longitude;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column vc_district_polyline.gps84_longitude
     *
     * @param gps84Longitude the value for vc_district_polyline.gps84_longitude
     *
     * @mbg.generated
     */
    public void setGps84Longitude(BigDecimal gps84Longitude) {
        this.gps84Longitude = gps84Longitude;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column vc_district_polyline.gps84_latitude
     *
     * @return the value of vc_district_polyline.gps84_latitude
     *
     * @mbg.generated
     */
    public BigDecimal getGps84Latitude() {
        return gps84Latitude;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column vc_district_polyline.gps84_latitude
     *
     * @param gps84Latitude the value for vc_district_polyline.gps84_latitude
     *
     * @mbg.generated
     */
    public void setGps84Latitude(BigDecimal gps84Latitude) {
        this.gps84Latitude = gps84Latitude;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column vc_district_polyline.polyline_zone
     *
     * @return the value of vc_district_polyline.polyline_zone
     *
     * @mbg.generated
     */
    public Integer getPolylineZone() {
        return polylineZone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column vc_district_polyline.polyline_zone
     *
     * @param polylineZone the value for vc_district_polyline.polyline_zone
     *
     * @mbg.generated
     */
    public void setPolylineZone(Integer polylineZone) {
        this.polylineZone = polylineZone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vc_district_polyline
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
        VcDistrictPolyline other = (VcDistrictPolyline) that;
        return (this.getPolylineId() == null ? other.getPolylineId() == null : this.getPolylineId().equals(other.getPolylineId()))
            && (this.getDistrictId() == null ? other.getDistrictId() == null : this.getDistrictId().equals(other.getDistrictId()))
            && (this.getPolylineLongitude() == null ? other.getPolylineLongitude() == null : this.getPolylineLongitude().equals(other.getPolylineLongitude()))
            && (this.getPolylineLatitude() == null ? other.getPolylineLatitude() == null : this.getPolylineLatitude().equals(other.getPolylineLatitude()))
            && (this.getGps84Longitude() == null ? other.getGps84Longitude() == null : this.getGps84Longitude().equals(other.getGps84Longitude()))
            && (this.getGps84Latitude() == null ? other.getGps84Latitude() == null : this.getGps84Latitude().equals(other.getGps84Latitude()))
            && (this.getPolylineZone() == null ? other.getPolylineZone() == null : this.getPolylineZone().equals(other.getPolylineZone()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vc_district_polyline
     *
     * @mbg.generated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getPolylineId() == null) ? 0 : getPolylineId().hashCode());
        result = prime * result + ((getDistrictId() == null) ? 0 : getDistrictId().hashCode());
        result = prime * result + ((getPolylineLongitude() == null) ? 0 : getPolylineLongitude().hashCode());
        result = prime * result + ((getPolylineLatitude() == null) ? 0 : getPolylineLatitude().hashCode());
        result = prime * result + ((getGps84Longitude() == null) ? 0 : getGps84Longitude().hashCode());
        result = prime * result + ((getGps84Latitude() == null) ? 0 : getGps84Latitude().hashCode());
        result = prime * result + ((getPolylineZone() == null) ? 0 : getPolylineZone().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vc_district_polyline
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", polylineId=").append(polylineId);
        sb.append(", districtId=").append(districtId);
        sb.append(", polylineLongitude=").append(polylineLongitude);
        sb.append(", polylineLatitude=").append(polylineLatitude);
        sb.append(", gps84Longitude=").append(gps84Longitude);
        sb.append(", gps84Latitude=").append(gps84Latitude);
        sb.append(", polylineZone=").append(polylineZone);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}