package com.ccclubs.quota.orm.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;

public class TbUpgrade implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_upgrade.tbu_id
     *
     * @mbg.generated
     */
    private Integer tbuId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_upgrade.tbu_machine
     *
     * @mbg.generated
     */
    private Integer tbuMachine;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_upgrade.tbu_number
     *
     * @mbg.generated
     */
    private String tbuNumber;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_upgrade.tbu_sim_no
     *
     * @mbg.generated
     */
    private String tbuSimNo;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_upgrade.tbu_te_type
     *
     * @mbg.generated
     */
    private Integer tbuTeType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_upgrade.tbu_protocol
     *
     * @mbg.generated
     */
    private Integer tbuProtocol;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_upgrade.tbu_file
     *
     * @mbg.generated
     */
    private String tbuFile;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_upgrade.tbu_remarks
     *
     * @mbg.generated
     */
    private String tbuRemarks;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_upgrade.tbu_editor
     *
     * @mbg.generated
     */
    private Integer tbuEditor;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_upgrade.tbu_update_time
     *
     * @mbg.generated
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone="GMT+8")
    private Date tbuUpdateTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_upgrade.tbu_add_time
     *
     * @mbg.generated
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone="GMT+8")
    private Date tbuAddTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_upgrade.tbu_status
     *
     * @mbg.generated
     */
    private Integer tbuStatus;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tb_upgrade
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_upgrade.tbu_id
     *
     * @return the value of tb_upgrade.tbu_id
     *
     * @mbg.generated
     */
    public Integer getTbuId() {
        return tbuId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_upgrade.tbu_id
     *
     * @param tbuId the value for tb_upgrade.tbu_id
     *
     * @mbg.generated
     */
    public void setTbuId(Integer tbuId) {
        this.tbuId = tbuId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_upgrade.tbu_machine
     *
     * @return the value of tb_upgrade.tbu_machine
     *
     * @mbg.generated
     */
    public Integer getTbuMachine() {
        return tbuMachine;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_upgrade.tbu_machine
     *
     * @param tbuMachine the value for tb_upgrade.tbu_machine
     *
     * @mbg.generated
     */
    public void setTbuMachine(Integer tbuMachine) {
        this.tbuMachine = tbuMachine;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_upgrade.tbu_number
     *
     * @return the value of tb_upgrade.tbu_number
     *
     * @mbg.generated
     */
    public String getTbuNumber() {
        return tbuNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_upgrade.tbu_number
     *
     * @param tbuNumber the value for tb_upgrade.tbu_number
     *
     * @mbg.generated
     */
    public void setTbuNumber(String tbuNumber) {
        this.tbuNumber = tbuNumber == null ? null : tbuNumber.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_upgrade.tbu_sim_no
     *
     * @return the value of tb_upgrade.tbu_sim_no
     *
     * @mbg.generated
     */
    public String getTbuSimNo() {
        return tbuSimNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_upgrade.tbu_sim_no
     *
     * @param tbuSimNo the value for tb_upgrade.tbu_sim_no
     *
     * @mbg.generated
     */
    public void setTbuSimNo(String tbuSimNo) {
        this.tbuSimNo = tbuSimNo == null ? null : tbuSimNo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_upgrade.tbu_te_type
     *
     * @return the value of tb_upgrade.tbu_te_type
     *
     * @mbg.generated
     */
    public Integer getTbuTeType() {
        return tbuTeType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_upgrade.tbu_te_type
     *
     * @param tbuTeType the value for tb_upgrade.tbu_te_type
     *
     * @mbg.generated
     */
    public void setTbuTeType(Integer tbuTeType) {
        this.tbuTeType = tbuTeType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_upgrade.tbu_protocol
     *
     * @return the value of tb_upgrade.tbu_protocol
     *
     * @mbg.generated
     */
    public Integer getTbuProtocol() {
        return tbuProtocol;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_upgrade.tbu_protocol
     *
     * @param tbuProtocol the value for tb_upgrade.tbu_protocol
     *
     * @mbg.generated
     */
    public void setTbuProtocol(Integer tbuProtocol) {
        this.tbuProtocol = tbuProtocol;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_upgrade.tbu_file
     *
     * @return the value of tb_upgrade.tbu_file
     *
     * @mbg.generated
     */
    public String getTbuFile() {
        return tbuFile;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_upgrade.tbu_file
     *
     * @param tbuFile the value for tb_upgrade.tbu_file
     *
     * @mbg.generated
     */
    public void setTbuFile(String tbuFile) {
        this.tbuFile = tbuFile == null ? null : tbuFile.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_upgrade.tbu_remarks
     *
     * @return the value of tb_upgrade.tbu_remarks
     *
     * @mbg.generated
     */
    public String getTbuRemarks() {
        return tbuRemarks;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_upgrade.tbu_remarks
     *
     * @param tbuRemarks the value for tb_upgrade.tbu_remarks
     *
     * @mbg.generated
     */
    public void setTbuRemarks(String tbuRemarks) {
        this.tbuRemarks = tbuRemarks == null ? null : tbuRemarks.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_upgrade.tbu_editor
     *
     * @return the value of tb_upgrade.tbu_editor
     *
     * @mbg.generated
     */
    public Integer getTbuEditor() {
        return tbuEditor;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_upgrade.tbu_editor
     *
     * @param tbuEditor the value for tb_upgrade.tbu_editor
     *
     * @mbg.generated
     */
    public void setTbuEditor(Integer tbuEditor) {
        this.tbuEditor = tbuEditor;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_upgrade.tbu_update_time
     *
     * @return the value of tb_upgrade.tbu_update_time
     *
     * @mbg.generated
     */
    public Date getTbuUpdateTime() {
        return tbuUpdateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_upgrade.tbu_update_time
     *
     * @param tbuUpdateTime the value for tb_upgrade.tbu_update_time
     *
     * @mbg.generated
     */
    public void setTbuUpdateTime(Date tbuUpdateTime) {
        this.tbuUpdateTime = tbuUpdateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_upgrade.tbu_add_time
     *
     * @return the value of tb_upgrade.tbu_add_time
     *
     * @mbg.generated
     */
    public Date getTbuAddTime() {
        return tbuAddTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_upgrade.tbu_add_time
     *
     * @param tbuAddTime the value for tb_upgrade.tbu_add_time
     *
     * @mbg.generated
     */
    public void setTbuAddTime(Date tbuAddTime) {
        this.tbuAddTime = tbuAddTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_upgrade.tbu_status
     *
     * @return the value of tb_upgrade.tbu_status
     *
     * @mbg.generated
     */
    public Integer getTbuStatus() {
        return tbuStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_upgrade.tbu_status
     *
     * @param tbuStatus the value for tb_upgrade.tbu_status
     *
     * @mbg.generated
     */
    public void setTbuStatus(Integer tbuStatus) {
        this.tbuStatus = tbuStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_upgrade
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
        TbUpgrade other = (TbUpgrade) that;
        return (this.getTbuId() == null ? other.getTbuId() == null : this.getTbuId().equals(other.getTbuId()))
            && (this.getTbuMachine() == null ? other.getTbuMachine() == null : this.getTbuMachine().equals(other.getTbuMachine()))
            && (this.getTbuNumber() == null ? other.getTbuNumber() == null : this.getTbuNumber().equals(other.getTbuNumber()))
            && (this.getTbuSimNo() == null ? other.getTbuSimNo() == null : this.getTbuSimNo().equals(other.getTbuSimNo()))
            && (this.getTbuTeType() == null ? other.getTbuTeType() == null : this.getTbuTeType().equals(other.getTbuTeType()))
            && (this.getTbuProtocol() == null ? other.getTbuProtocol() == null : this.getTbuProtocol().equals(other.getTbuProtocol()))
            && (this.getTbuFile() == null ? other.getTbuFile() == null : this.getTbuFile().equals(other.getTbuFile()))
            && (this.getTbuRemarks() == null ? other.getTbuRemarks() == null : this.getTbuRemarks().equals(other.getTbuRemarks()))
            && (this.getTbuEditor() == null ? other.getTbuEditor() == null : this.getTbuEditor().equals(other.getTbuEditor()))
            && (this.getTbuUpdateTime() == null ? other.getTbuUpdateTime() == null : this.getTbuUpdateTime().equals(other.getTbuUpdateTime()))
            && (this.getTbuAddTime() == null ? other.getTbuAddTime() == null : this.getTbuAddTime().equals(other.getTbuAddTime()))
            && (this.getTbuStatus() == null ? other.getTbuStatus() == null : this.getTbuStatus().equals(other.getTbuStatus()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_upgrade
     *
     * @mbg.generated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getTbuId() == null) ? 0 : getTbuId().hashCode());
        result = prime * result + ((getTbuMachine() == null) ? 0 : getTbuMachine().hashCode());
        result = prime * result + ((getTbuNumber() == null) ? 0 : getTbuNumber().hashCode());
        result = prime * result + ((getTbuSimNo() == null) ? 0 : getTbuSimNo().hashCode());
        result = prime * result + ((getTbuTeType() == null) ? 0 : getTbuTeType().hashCode());
        result = prime * result + ((getTbuProtocol() == null) ? 0 : getTbuProtocol().hashCode());
        result = prime * result + ((getTbuFile() == null) ? 0 : getTbuFile().hashCode());
        result = prime * result + ((getTbuRemarks() == null) ? 0 : getTbuRemarks().hashCode());
        result = prime * result + ((getTbuEditor() == null) ? 0 : getTbuEditor().hashCode());
        result = prime * result + ((getTbuUpdateTime() == null) ? 0 : getTbuUpdateTime().hashCode());
        result = prime * result + ((getTbuAddTime() == null) ? 0 : getTbuAddTime().hashCode());
        result = prime * result + ((getTbuStatus() == null) ? 0 : getTbuStatus().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_upgrade
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", tbuId=").append(tbuId);
        sb.append(", tbuMachine=").append(tbuMachine);
        sb.append(", tbuNumber=").append(tbuNumber);
        sb.append(", tbuSimNo=").append(tbuSimNo);
        sb.append(", tbuTeType=").append(tbuTeType);
        sb.append(", tbuProtocol=").append(tbuProtocol);
        sb.append(", tbuFile=").append(tbuFile);
        sb.append(", tbuRemarks=").append(tbuRemarks);
        sb.append(", tbuEditor=").append(tbuEditor);
        sb.append(", tbuUpdateTime=").append(tbuUpdateTime);
        sb.append(", tbuAddTime=").append(tbuAddTime);
        sb.append(", tbuStatus=").append(tbuStatus);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}