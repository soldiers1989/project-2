package com.ccclubs.pub.orm.model;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table srv_error
 *
 * @mbg.generated do_not_delete_during_merge
 */
public class SrvError implements Serializable {
    /**
     * Database Column Remarks:
     *   编号:
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column srv_error.se_id
     *
     * @mbg.generated
     */
    private Integer seId;

    /**
     * Database Column Remarks:
     *   错误标题:
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column srv_error.se_title
     *
     * @mbg.generated
     */
    private String seTitle;

    /**
     * Database Column Remarks:
     *   错误内容:
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column srv_error.se_content
     *
     * @mbg.generated
     */
    private String seContent;

    /**
     * Database Column Remarks:
     *   标识:
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column srv_error.se_flag
     *
     * @mbg.generated
     */
    private String seFlag;

    /**
     * Database Column Remarks:
     *   修改时间:
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column srv_error.se_update_time
     *
     * @mbg.generated
     */
    private Date seUpdateTime;

    /**
     * Database Column Remarks:
     *   添加时间:
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column srv_error.se_add_time
     *
     * @mbg.generated
     */
    private Date seAddTime;

    /**
     * Database Column Remarks:
     *   状态:1:正常,0:无效;
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column srv_error.se_status
     *
     * @mbg.generated
     */
    private Byte seStatus;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table srv_error
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column srv_error.se_id
     *
     * @return the value of srv_error.se_id
     *
     * @mbg.generated
     */
    public Integer getSeId() {
        return seId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column srv_error.se_id
     *
     * @param seId the value for srv_error.se_id
     *
     * @mbg.generated
     */
    public void setSeId(Integer seId) {
        this.seId = seId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column srv_error.se_title
     *
     * @return the value of srv_error.se_title
     *
     * @mbg.generated
     */
    public String getSeTitle() {
        return seTitle;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column srv_error.se_title
     *
     * @param seTitle the value for srv_error.se_title
     *
     * @mbg.generated
     */
    public void setSeTitle(String seTitle) {
        this.seTitle = seTitle == null ? null : seTitle.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column srv_error.se_content
     *
     * @return the value of srv_error.se_content
     *
     * @mbg.generated
     */
    public String getSeContent() {
        return seContent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column srv_error.se_content
     *
     * @param seContent the value for srv_error.se_content
     *
     * @mbg.generated
     */
    public void setSeContent(String seContent) {
        this.seContent = seContent == null ? null : seContent.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column srv_error.se_flag
     *
     * @return the value of srv_error.se_flag
     *
     * @mbg.generated
     */
    public String getSeFlag() {
        return seFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column srv_error.se_flag
     *
     * @param seFlag the value for srv_error.se_flag
     *
     * @mbg.generated
     */
    public void setSeFlag(String seFlag) {
        this.seFlag = seFlag == null ? null : seFlag.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column srv_error.se_update_time
     *
     * @return the value of srv_error.se_update_time
     *
     * @mbg.generated
     */
    public Date getSeUpdateTime() {
        return seUpdateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column srv_error.se_update_time
     *
     * @param seUpdateTime the value for srv_error.se_update_time
     *
     * @mbg.generated
     */
    public void setSeUpdateTime(Date seUpdateTime) {
        this.seUpdateTime = seUpdateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column srv_error.se_add_time
     *
     * @return the value of srv_error.se_add_time
     *
     * @mbg.generated
     */
    public Date getSeAddTime() {
        return seAddTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column srv_error.se_add_time
     *
     * @param seAddTime the value for srv_error.se_add_time
     *
     * @mbg.generated
     */
    public void setSeAddTime(Date seAddTime) {
        this.seAddTime = seAddTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column srv_error.se_status
     *
     * @return the value of srv_error.se_status
     *
     * @mbg.generated
     */
    public Byte getSeStatus() {
        return seStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column srv_error.se_status
     *
     * @param seStatus the value for srv_error.se_status
     *
     * @mbg.generated
     */
    public void setSeStatus(Byte seStatus) {
        this.seStatus = seStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table srv_error
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
        SrvError other = (SrvError) that;
        return (this.getSeId() == null ? other.getSeId() == null : this.getSeId().equals(other.getSeId()))
            && (this.getSeTitle() == null ? other.getSeTitle() == null : this.getSeTitle().equals(other.getSeTitle()))
            && (this.getSeContent() == null ? other.getSeContent() == null : this.getSeContent().equals(other.getSeContent()))
            && (this.getSeFlag() == null ? other.getSeFlag() == null : this.getSeFlag().equals(other.getSeFlag()))
            && (this.getSeUpdateTime() == null ? other.getSeUpdateTime() == null : this.getSeUpdateTime().equals(other.getSeUpdateTime()))
            && (this.getSeAddTime() == null ? other.getSeAddTime() == null : this.getSeAddTime().equals(other.getSeAddTime()))
            && (this.getSeStatus() == null ? other.getSeStatus() == null : this.getSeStatus().equals(other.getSeStatus()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table srv_error
     *
     * @mbg.generated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSeId() == null) ? 0 : getSeId().hashCode());
        result = prime * result + ((getSeTitle() == null) ? 0 : getSeTitle().hashCode());
        result = prime * result + ((getSeContent() == null) ? 0 : getSeContent().hashCode());
        result = prime * result + ((getSeFlag() == null) ? 0 : getSeFlag().hashCode());
        result = prime * result + ((getSeUpdateTime() == null) ? 0 : getSeUpdateTime().hashCode());
        result = prime * result + ((getSeAddTime() == null) ? 0 : getSeAddTime().hashCode());
        result = prime * result + ((getSeStatus() == null) ? 0 : getSeStatus().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table srv_error
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", seId=").append(seId);
        sb.append(", seTitle=").append(seTitle);
        sb.append(", seContent=").append(seContent);
        sb.append(", seFlag=").append(seFlag);
        sb.append(", seUpdateTime=").append(seUpdateTime);
        sb.append(", seAddTime=").append(seAddTime);
        sb.append(", seStatus=").append(seStatus);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}