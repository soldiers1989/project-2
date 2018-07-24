import java.io.Serializable;

public class ResultClass implements Serializable {

    //1
    private  String logTime;
    private  String vin;
    private  String messageTime;


    private  String command ;
    private  String ack;

    private  String vehicleStatus;
    private  String charging;
    private  String runningMode;
    private  String speed;
    private  String mileage;
    private  String voltage;
    private  String current;
    private  String soc;
    private  String dcDcStatus;
    private  String gear;
    private  String insulationResistance;
    private  String acceleratedPedalStrokeValue;
    private  String brakePedalState;

    //2
    private  String driveMotorNumber;
    private  String driveMotorSerial;
    private  String driveMotorStatus;



    private  String driveMotorControllerTemperature;
    private  String driveMotorSpeed;
    private  String driveMotorTorque;
    private  String driveMotorTemperature;
    private  String motorInputVoltage;
    private  String motorControllerDCBusCurrent;

    //4
    private  String engineStatus;
    private  String crankshaftSpeed;
    private  String fuelConsumptionRateRate;

    //5
    private  String positionStatus;
    private  String longitude;
    private  String latitude;

    //6
    private  String highestVoltageBatterySubsystemNumber;
    private  String highestVoltageBatterySingleModuleCode;
    private  String batterySingleVoltageHighestValue;
    private  String lowestVoltageBatterySubsystemNumber;
    private  String lowestVoltageBatterySingleModuleCode;
    private  String batterySingleVoltageLowestValue;
    private  String highestTemperatureSubsystemNumber;

    private  String highestTemperatureProbeMonomerSingleCode;
    private  String highestTemperatureValue;
    private  String lowestTemperatureSubsystemNumber;
    private  String lowestTemperatureProbeSubsystemCode;
    //最低温度值
    private  String lowestTemperatureValue;


    /**
     * 7
     */

    //最高报警等级
    private  String highestAlarmLevel;
    //通用报警标志
    private  String generalAlarmFlag;

    //报警类型
    private  String alarmFlag;


    //可充电储能装置故障总数
    private  String rechargeableEnergyStorageDeviceTotalNumberOfFailures;

    //驱动电机故障总数
    private  String driveMotorTotalNumberOfFailures;

    //发动机故障总数N3
    private  String engineTotalNumberOfFailures;

    //其他故障总数N4
    private  String otherTotalNumberOfFailures;


    /* *
     *9
     */
    //可充电储能子系统个数
    private  String chargeEnergyStoreSubSystemNumber;

    //可充电储能子系统号
    private  String chargeEnergyStoreSerial;

    //可充电储能装置电压
    private  String chargeEnergyStoreVoltage;

    //可充电储能装置电流
    private  String chargeEnergyStoreCurrent;

    //单体电池总数
    private  String monomerBatteryNumber;

    //本帧起始电池序号
    private  String frameStartBatterySerial;

    //本帧单体电池总数
    private  String frameStartBatteryNumber;


    //单体电池电压
    private  String monomerBatteryVoltageList;

    /**
     * 9
     */

    //可充电储能子系统个数
    private  String rechargeableEnergyStorageSubsystemsTotalNumber;

    //可充电储能子系统号
    private  String rechargeableEnergyStorageSubsystemNumber;


    //可充电储能温度探针个数
    private  String rechargeableEnergyStorageTemperatureProbesTotalNumber;

    //温度值
    private  String temperatureProbesList;


    private  String hexString;


    public String getLogTime() {
        return logTime;
    }

    public void setLogTime(String logTime) {
        this.logTime = logTime;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public String getMessageTime() {
        return messageTime;
    }

    public void setMessageTime(String messageTime) {
        this.messageTime = messageTime;
    }

    public String getAck() {
        return ack;
    }

    public void setAck(String ack) {
        this.ack = ack;
    }

    public String getVehicleStatus() {
        return vehicleStatus;
    }

    public void setVehicleStatus(String vehicleStatus) {
        this.vehicleStatus = vehicleStatus;
    }

    public String getCharging() {
        return charging;
    }

    public void setCharging(String charging) {
        this.charging = charging;
    }

    public String getRunningMode() {
        return runningMode;
    }

    public void setRunningMode(String runningMode) {
        this.runningMode = runningMode;
    }

    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }

    public String getMileage() {
        return mileage;
    }

    public void setMileage(String mileage) {
        this.mileage = mileage;
    }

    public String getVoltage() {
        return voltage;
    }

    public void setVoltage(String voltage) {
        this.voltage = voltage;
    }

    public String getCurrent() {
        return current;
    }

    public void setCurrent(String current) {
        this.current = current;
    }

    public String getSoc() {
        return soc;
    }

    public void setSoc(String soc) {
        this.soc = soc;
    }

    public String getDcDcStatus() {
        return dcDcStatus;
    }

    public void setDcDcStatus(String dcDcStatus) {
        this.dcDcStatus = dcDcStatus;
    }

    public String getGear() {
        return gear;
    }

    public void setGear(String gear) {
        this.gear = gear;
    }

    public String getInsulationResistance() {
        return insulationResistance;
    }

    public void setInsulationResistance(String insulationResistance) {
        this.insulationResistance = insulationResistance;
    }

    public String getAcceleratedPedalStrokeValue() {
        return acceleratedPedalStrokeValue;
    }

    public void setAcceleratedPedalStrokeValue(String acceleratedPedalStrokeValue) {
        this.acceleratedPedalStrokeValue = acceleratedPedalStrokeValue;
    }

    public String getBrakePedalState() {
        return brakePedalState;
    }

    public void setBrakePedalState(String brakePedalState) {
        this.brakePedalState = brakePedalState;
    }

    public String getDriveMotorNumber() {
        return driveMotorNumber;
    }

    public void setDriveMotorNumber(String driveMotorNumber) {
        this.driveMotorNumber = driveMotorNumber;
    }

    public String getDriveMotorSerial() {
        return driveMotorSerial;
    }

    public void setDriveMotorSerial(String driveMotorSerial) {
        this.driveMotorSerial = driveMotorSerial;
    }

    public String getDriveMotorStatus() {
        return driveMotorStatus;
    }

    public void setDriveMotorStatus(String driveMotorStatus) {
        this.driveMotorStatus = driveMotorStatus;
    }

    public String getDriveMotorControllerTemperature() {
        return driveMotorControllerTemperature;
    }

    public void setDriveMotorControllerTemperature(String driveMotorControllerTemperature) {
        this.driveMotorControllerTemperature = driveMotorControllerTemperature;
    }

    public String getDriveMotorSpeed() {
        return driveMotorSpeed;
    }

    public void setDriveMotorSpeed(String driveMotorSpeed) {
        this.driveMotorSpeed = driveMotorSpeed;
    }

    public String getDriveMotorTorque() {
        return driveMotorTorque;
    }

    public void setDriveMotorTorque(String driveMotorTorque) {
        this.driveMotorTorque = driveMotorTorque;
    }

    public String getDriveMotorTemperature() {
        return driveMotorTemperature;
    }

    public void setDriveMotorTemperature(String driveMotorTemperature) {
        this.driveMotorTemperature = driveMotorTemperature;
    }

    public String getMotorInputVoltage() {
        return motorInputVoltage;
    }

    public void setMotorInputVoltage(String motorInputVoltage) {
        this.motorInputVoltage = motorInputVoltage;
    }

    public String getMotorControllerDCBusCurrent() {
        return motorControllerDCBusCurrent;
    }

    public void setMotorControllerDCBusCurrent(String motorControllerDCBusCurrent) {
        this.motorControllerDCBusCurrent = motorControllerDCBusCurrent;
    }

    public String getEngineStatus() {
        return engineStatus;
    }

    public void setEngineStatus(String engineStatus) {
        this.engineStatus = engineStatus;
    }

    public String getCrankshaftSpeed() {
        return crankshaftSpeed;
    }

    public void setCrankshaftSpeed(String crankshaftSpeed) {
        this.crankshaftSpeed = crankshaftSpeed;
    }

    public String getFuelConsumptionRateRate() {
        return fuelConsumptionRateRate;
    }

    public void setFuelConsumptionRateRate(String fuelConsumptionRateRate) {
        this.fuelConsumptionRateRate = fuelConsumptionRateRate;
    }

    public String getPositionStatus() {
        return positionStatus;
    }

    public void setPositionStatus(String positionStatus) {
        this.positionStatus = positionStatus;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getHighestVoltageBatterySubsystemNumber() {
        return highestVoltageBatterySubsystemNumber;
    }

    public void setHighestVoltageBatterySubsystemNumber(String highestVoltageBatterySubsystemNumber) {
        this.highestVoltageBatterySubsystemNumber = highestVoltageBatterySubsystemNumber;
    }

    public String getHighestVoltageBatterySingleModuleCode() {
        return highestVoltageBatterySingleModuleCode;
    }

    public void setHighestVoltageBatterySingleModuleCode(String highestVoltageBatterySingleModuleCode) {
        this.highestVoltageBatterySingleModuleCode = highestVoltageBatterySingleModuleCode;
    }

    public String getBatterySingleVoltageHighestValue() {
        return batterySingleVoltageHighestValue;
    }

    public void setBatterySingleVoltageHighestValue(String batterySingleVoltageHighestValue) {
        this.batterySingleVoltageHighestValue = batterySingleVoltageHighestValue;
    }

    public String getLowestVoltageBatterySubsystemNumber() {
        return lowestVoltageBatterySubsystemNumber;
    }

    public void setLowestVoltageBatterySubsystemNumber(String lowestVoltageBatterySubsystemNumber) {
        this.lowestVoltageBatterySubsystemNumber = lowestVoltageBatterySubsystemNumber;
    }

    public String getLowestVoltageBatterySingleModuleCode() {
        return lowestVoltageBatterySingleModuleCode;
    }

    public void setLowestVoltageBatterySingleModuleCode(String lowestVoltageBatterySingleModuleCode) {
        this.lowestVoltageBatterySingleModuleCode = lowestVoltageBatterySingleModuleCode;
    }

    public String getBatterySingleVoltageLowestValue() {
        return batterySingleVoltageLowestValue;
    }

    public void setBatterySingleVoltageLowestValue(String batterySingleVoltageLowestValue) {
        this.batterySingleVoltageLowestValue = batterySingleVoltageLowestValue;
    }

    public String getHighestTemperatureSubsystemNumber() {
        return highestTemperatureSubsystemNumber;
    }

    public void setHighestTemperatureSubsystemNumber(String highestTemperatureSubsystemNumber) {
        this.highestTemperatureSubsystemNumber = highestTemperatureSubsystemNumber;
    }

    public String getHighestTemperatureProbeMonomerSingleCode() {
        return highestTemperatureProbeMonomerSingleCode;
    }

    public void setHighestTemperatureProbeMonomerSingleCode(String highestTemperatureProbeMonomerSingleCode) {
        this.highestTemperatureProbeMonomerSingleCode = highestTemperatureProbeMonomerSingleCode;
    }

    public String getHighestTemperatureValue() {
        return highestTemperatureValue;
    }

    public void setHighestTemperatureValue(String highestTemperatureValue) {
        this.highestTemperatureValue = highestTemperatureValue;
    }

    public String getLowestTemperatureSubsystemNumber() {
        return lowestTemperatureSubsystemNumber;
    }

    public void setLowestTemperatureSubsystemNumber(String lowestTemperatureSubsystemNumber) {
        this.lowestTemperatureSubsystemNumber = lowestTemperatureSubsystemNumber;
    }

    public String getLowestTemperatureProbeSubsystemCode() {
        return lowestTemperatureProbeSubsystemCode;
    }

    public void setLowestTemperatureProbeSubsystemCode(String lowestTemperatureProbeSubsystemCode) {
        this.lowestTemperatureProbeSubsystemCode = lowestTemperatureProbeSubsystemCode;
    }

    public String getLowestTemperatureValue() {
        return lowestTemperatureValue;
    }

    public void setLowestTemperatureValue(String lowestTemperatureValue) {
        this.lowestTemperatureValue = lowestTemperatureValue;
    }

    public String getHighestAlarmLevel() {
        return highestAlarmLevel;
    }

    public void setHighestAlarmLevel(String highestAlarmLevel) {
        this.highestAlarmLevel = highestAlarmLevel;
    }

    public String getGeneralAlarmFlag() {
        return generalAlarmFlag;
    }

    public void setGeneralAlarmFlag(String generalAlarmFlag) {
        this.generalAlarmFlag = generalAlarmFlag;
    }

    public String getHexString() {
        return hexString;
    }

    public void setHexString(String hexString) {
        this.hexString = hexString;
    }

    public String getAlarmFlag() {
        return alarmFlag;
    }

    public void setAlarmFlag(String alarmFlag) {
        this.alarmFlag = alarmFlag;
    }

    public String getRechargeableEnergyStorageDeviceTotalNumberOfFailures() {
        return rechargeableEnergyStorageDeviceTotalNumberOfFailures;
    }

    public void setRechargeableEnergyStorageDeviceTotalNumberOfFailures(String rechargeableEnergyStorageDeviceTotalNumberOfFailures) {
        this.rechargeableEnergyStorageDeviceTotalNumberOfFailures = rechargeableEnergyStorageDeviceTotalNumberOfFailures;
    }

    public String getDriveMotorTotalNumberOfFailures() {
        return driveMotorTotalNumberOfFailures;
    }

    public void setDriveMotorTotalNumberOfFailures(String driveMotorTotalNumberOfFailures) {
        this.driveMotorTotalNumberOfFailures = driveMotorTotalNumberOfFailures;
    }

    public String getEngineTotalNumberOfFailures() {
        return engineTotalNumberOfFailures;
    }

    public void setEngineTotalNumberOfFailures(String engineTotalNumberOfFailures) {
        this.engineTotalNumberOfFailures = engineTotalNumberOfFailures;
    }

    public String getOtherTotalNumberOfFailures() {
        return otherTotalNumberOfFailures;
    }

    public void setOtherTotalNumberOfFailures(String otherTotalNumberOfFailures) {
        this.otherTotalNumberOfFailures = otherTotalNumberOfFailures;
    }

    public String getChargeEnergyStoreSubSystemNumber() {
        return chargeEnergyStoreSubSystemNumber;
    }

    public void setChargeEnergyStoreSubSystemNumber(String chargeEnergyStoreSubSystemNumber) {
        this.chargeEnergyStoreSubSystemNumber = chargeEnergyStoreSubSystemNumber;
    }

    public String getChargeEnergyStoreSerial() {
        return chargeEnergyStoreSerial;
    }

    public void setChargeEnergyStoreSerial(String chargeEnergyStoreSerial) {
        this.chargeEnergyStoreSerial = chargeEnergyStoreSerial;
    }

    public String getChargeEnergyStoreVoltage() {
        return chargeEnergyStoreVoltage;
    }

    public void setChargeEnergyStoreVoltage(String chargeEnergyStoreVoltage) {
        this.chargeEnergyStoreVoltage = chargeEnergyStoreVoltage;
    }

    public String getChargeEnergyStoreCurrent() {
        return chargeEnergyStoreCurrent;
    }

    public void setChargeEnergyStoreCurrent(String chargeEnergyStoreCurrent) {
        this.chargeEnergyStoreCurrent = chargeEnergyStoreCurrent;
    }

    public String getMonomerBatteryNumber() {
        return monomerBatteryNumber;
    }

    public void setMonomerBatteryNumber(String monomerBatteryNumber) {
        this.monomerBatteryNumber = monomerBatteryNumber;
    }

    public String getFrameStartBatterySerial() {
        return frameStartBatterySerial;
    }

    public void setFrameStartBatterySerial(String frameStartBatterySerial) {
        this.frameStartBatterySerial = frameStartBatterySerial;
    }

    public String getFrameStartBatteryNumber() {
        return frameStartBatteryNumber;
    }

    public void setFrameStartBatteryNumber(String frameStartBatteryNumber) {
        this.frameStartBatteryNumber = frameStartBatteryNumber;
    }

    public String getMonomerBatteryVoltageList() {
        return monomerBatteryVoltageList;
    }

    public void setMonomerBatteryVoltageList(String monomerBatteryVoltageList) {
        this.monomerBatteryVoltageList = monomerBatteryVoltageList;
    }

    public String getRechargeableEnergyStorageSubsystemsTotalNumber() {
        return rechargeableEnergyStorageSubsystemsTotalNumber;
    }

    public void setRechargeableEnergyStorageSubsystemsTotalNumber(String rechargeableEnergyStorageSubsystemsTotalNumber) {
        this.rechargeableEnergyStorageSubsystemsTotalNumber = rechargeableEnergyStorageSubsystemsTotalNumber;
    }

    public String getRechargeableEnergyStorageSubsystemNumber() {
        return rechargeableEnergyStorageSubsystemNumber;
    }

    public void setRechargeableEnergyStorageSubsystemNumber(String rechargeableEnergyStorageSubsystemNumber) {
        this.rechargeableEnergyStorageSubsystemNumber = rechargeableEnergyStorageSubsystemNumber;
    }

    public String getRechargeableEnergyStorageTemperatureProbesTotalNumber() {
        return rechargeableEnergyStorageTemperatureProbesTotalNumber;
    }

    public void setRechargeableEnergyStorageTemperatureProbesTotalNumber(String rechargeableEnergyStorageTemperatureProbesTotalNumber) {
        this.rechargeableEnergyStorageTemperatureProbesTotalNumber = rechargeableEnergyStorageTemperatureProbesTotalNumber;
    }

    public String getTemperatureProbesList() {
        return temperatureProbesList;
    }

    public void setTemperatureProbesList(String temperatureProbesList) {
        this.temperatureProbesList = temperatureProbesList;
    }

    public String getCommand() {
        return command;
    }

    public void setCommand(String command) {
        this.command = command;
    }
}




