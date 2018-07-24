package com.ccclubs.protocol.inf;

public interface ICarStatus {
	/**
	 * 获得车牌号
	 * 
	 * @return
	 */
	public String getCarNum();

	/**
	 * 获得当前时间
	 * 
	 * @return
	 */
	public int getTime();

	/**
	 * 获得当前订单号
	 * 
	 * @return
	 */
	public long getOrderId();

	public void setOrderId(long order);

	/**
	 * 获得当前车辆状态
	 * 
	 * @return
	 */
	public int getCarStatus();

	/**
	 * 获得当前车辆油里程
	 * 
	 * @return
	 */
	public int getCarFuel();

	/**
	 * 获得当前车辆电里程
	 * 
	 * @return
	 */
	public int getCarElectric();

	public void saveData(ICarStatus carStatus, final String msgHexString);

}
