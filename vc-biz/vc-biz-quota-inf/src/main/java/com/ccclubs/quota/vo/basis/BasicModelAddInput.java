package com.ccclubs.quota.vo.basis;

import java.io.Serializable;
import java.math.BigDecimal;

public class BasicModelAddInput implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1963921928219501663L;
	/**
	 *
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column cs_model.csm_id
	 *
	 * @mbg.generated
	 */
	private Integer csmId;

	/**
	 *
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column cs_model.csm_name
	 *
	 * @mbg.generated
	 */
	private String csmName;

	/**
	 *
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column cs_model.csm_flag
	 *
	 * @mbg.generated
	 */
	private String csmFlag;

	/**
	 *
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column cs_model.csm_type
	 *
	 * @mbg.generated
	 */
	private Integer csmType;

	/**
	 *
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column cs_model.csm_file
	 *
	 * @mbg.generated
	 */
	private Integer csmFile;

	/**
	 *
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column cs_model.csm_catagory
	 *
	 * @mbg.generated
	 */
	private Integer csmCatagory;

	/**
	 *
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column cs_model.csm_tank_capacity
	 *
	 * @mbg.generated
	 */
	private BigDecimal csmTankCapacity;

	/**
	 *
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column cs_model.csm_battery_capacity
	 *
	 * @mbg.generated
	 */
	private BigDecimal csmBatteryCapacity;

	/**
	 *
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column cs_model.csm_status
	 *
	 * @mbg.generated
	 */
	private Integer csmStatus;

	public Integer getCsmId() {
		return csmId;
	}

	public void setCsmId(Integer csmId) {
		this.csmId = csmId;
	}

	public String getCsmName() {
		return csmName;
	}

	public void setCsmName(String csmName) {
		this.csmName = csmName;
	}

	public String getCsmFlag() {
		return csmFlag;
	}

	public void setCsmFlag(String csmFlag) {
		this.csmFlag = csmFlag;
	}

	public Integer getCsmType() {
		return csmType;
	}

	public void setCsmType(Integer csmType) {
		this.csmType = csmType;
	}

	public Integer getCsmFile() {
		return csmFile;
	}

	public void setCsmFile(Integer csmFile) {
		this.csmFile = csmFile;
	}

	public Integer getCsmCatagory() {
		return csmCatagory;
	}

	public void setCsmCatagory(Integer csmCatagory) {
		this.csmCatagory = csmCatagory;
	}

	public BigDecimal getCsmTankCapacity() {
		return csmTankCapacity;
	}

	public void setCsmTankCapacity(BigDecimal csmTankCapacity) {
		this.csmTankCapacity = csmTankCapacity;
	}

	public BigDecimal getCsmBatteryCapacity() {
		return csmBatteryCapacity;
	}

	public void setCsmBatteryCapacity(BigDecimal csmBatteryCapacity) {
		this.csmBatteryCapacity = csmBatteryCapacity;
	}

	public Integer getCsmStatus() {
		return csmStatus;
	}

	public void setCsmStatus(Integer csmStatus) {
		this.csmStatus = csmStatus;
	}

}
