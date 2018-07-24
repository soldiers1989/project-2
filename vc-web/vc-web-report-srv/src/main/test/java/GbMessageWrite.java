

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.ccclubs.sdk.protocol.gb.entity.*;
import com.ccclubs.sdk.protocol.gb.inf.IRealTimeAdditionalItem;
import com.ccclubs.sdk.protocol.gb.util.AccurateOperationUtils;
import com.ccclubs.sdk.protocol.gb.util.Tools;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.io.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class AA{
    String logtime;
    String hex;

    public String getLogtime() {
        return logtime;
    }

    public void setLogtime(String logtime) {
        this.logtime = logtime;
    }

    public String getHex() {
        return hex;
    }

    public void setHex(String hex) {
        this.hex = hex;
    }
}

public class GbMessageWrite {





    public static  List<AA>  getLog() throws IOException {


//
//        Map<String,String> tempMap=new HashMap<>();
//        List<AA> hexStringList=new ArrayList<>();
//        AA aa=null;
//        File file = new File("D:\\distribute.log_2018-06-20.log");// Text文件
//        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file),"gbk"));// 构造一个BufferedReader类来读取文件
//        String str = null;
//        int jkl=0;
//        int lll=0;
//        while ((str = br.readLine()) != null) {// 使用readLine方法，一次读一行
//
//            if(str.contains("接收到的信息正确")){
//                jkl++;
//            }else{
//                lll++;
//            }
//
//            String logTime=str.substring(0,str.lastIndexOf("-")-1);
//
//            String messgae= str.substring(str.lastIndexOf("-"));
//
//            int start = messgae.lastIndexOf(":")+1;
//            if(start==0){
//                continue;
//            }
//            String hex=messgae.substring(start);
//            //
//
//            aa=new AA();
//            aa.setLogtime(logTime);
//            aa.setHex(hex.trim());
//            hexStringList.add(aa);
//        }
//        br.close();















        List<AA> hexStringList=new ArrayList<>();
        AA aa=null;
        File file = new File("D:\\2018-06-20_gb.txt");// Text文件
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file),"gbk"));// 构造一个BufferedReader类来读取文件
        String str = null;
        int jkl=0;
        int lll=0;
        while ((str = br.readLine()) != null) {// 使用readLine方法，一次读一行

            if(!str.contains("上传")) {



//               String logTime=str.substring(0,str.lastIndexOf("-")-1);
//
//               String messgae= str.substring(str.lastIndexOf("-"));
//
//                int start = messgae.lastIndexOf(":")+1;
//                if(start==0){
//                    continue;
//                }
                String hex = str.substring(str.lastIndexOf(")")+1);
                //


                aa = new AA();
//                    aa.setLogtime(logTime);
                aa.setHex(hex.trim());
                hexStringList.add(aa);
            }
        }
        br.close();









        Map<String,Object> tempMapLL=new HashMap<>();
        for(AA  localLog:hexStringList){

            if(tempMapLL.get(localLog.getHex())!=null){
                int i=Integer.parseInt(tempMapLL.get(localLog.getHex()).toString()) +1;

                tempMapLL.put(localLog.getHex(), i );

//                if(Integer.parseInt(tempMapLL.get(localLog.getHex()).toString())>=10){
//                    System.out.println("重复="+localLog.getHex());
//                }

            }else{
                tempMapLL.put(localLog.getHex(),1);
            }
        }

        List<ResultClass> list=new ArrayList<>();
        ResultClass resultClass=null;
        for(String key:tempMapLL.keySet()){
            resultClass=new ResultClass();
//            if(Integer.parseInt(tempMapLL.get(key).toString())==5){
//                System.out.println("key="+key+" ==="+tempMapLL.get(key));
//            }
            resultClass.setHexString(key);
            resultClass.setCommand(tempMapLL.get(key).toString());
            list.add(resultClass);

        }
        String[] headersExit ={
                "日志时间","车架号","报文时间","命令标识","应答标识",
                "车辆状态","充电状态","运行模式","车速","累计里程","总电压","总电流","SOC","DC-DC状态","挡位","绝缘电阻","加速踏板行程值","制动踏板状态",
                "驱动电机个数","驱动电机序号","驱动电机状态","驱动电机控制器温度","驱动电机转速","驱动电机转矩","驱动电机温度","电机控制器输入电压","电机控制器直流母线电流",
                "发动机状态","曲轴转速","燃料消耗率",
                "定位状态","经度","纬度",
                "最高电压电池子系统号","最高电压电池单体代号","电池单体电压最高值","最低电压电池子系统号","最低电压电池单体代号","电池单体电压最低值","最高温度子系统号","最高温度探针单体代号","最高温度值","最低温度子系统号","最低温度探针子系统代号","最低温度值",
                "最高报警等级","通用报警标志","报警类型","可充电储能装置故障总数N1","驱动电机故障总数N2","发动机故障总数N3","其他故障总数N4",
                "可充电储能子系统个数","可充电储能子系统号","可充电储能装置电压","可充电储能装置电流","单体电池总数","本帧起始电池序号","本帧单体电池总数","单体电池电压",
                "可充电储能子系统个数","可充电储能子系统号","可充电储能温度探针个数","温度值","报文"


        };
        WriteToExcel.outToExcel(list,"d://6-20_gbdata.xls",headersExit);
        return hexStringList;


    }

















    public static void main(String[] args) {

        try{
            List<AA> hexStringList=new ArrayList<>();
            AA aa=null;
            File file = new File("D:\\2018-06-20_gb.txt");// Text文件
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file),"gbk"));// 构造一个BufferedReader类来读取文件
            String str = null;
            int jkl=0;
            int lll=0;
            while ((str = br.readLine()) != null) {// 使用readLine方法，一次读一行

                if(!str.contains("上传")) {


                    jkl++;
//               String logTime=str.substring(0,str.lastIndexOf("-")-1);
//
//               String messgae= str.substring(str.lastIndexOf("-"));
//
//                int start = messgae.lastIndexOf(":")+1;
//                if(start==0){
//                    continue;
//                }
                    String hex = str.substring(str.lastIndexOf(")")+1);
                    //


                    aa = new AA();
//                    aa.setLogtime(logTime);
                    aa.setHex(hex.trim());
                    hexStringList.add(aa);
                }
            }
            br.close();
            System.out.println("jdk="+jkl);

//         getLog();
            //




            Map<String,Object> tempMapLL=new HashMap<>();
            for(AA  localLog:hexStringList){

                if(tempMapLL.get(localLog.getHex())!=null){
                    int i=Integer.parseInt(tempMapLL.get(localLog.getHex()).toString()) +1;

                    tempMapLL.put(localLog.getHex(), i );

                    if(Integer.parseInt(tempMapLL.get(localLog.getHex()).toString())>=5){
                        System.out.println("重复="+localLog.getHex());
                    }
                }else{
                    tempMapLL.put(localLog.getHex(),1);
                }
            }














            /**
             *  报文解析
             */

            /**
            /**
             * 中间类
             */
            List<ResultClass> resultClassList=new ArrayList<>();
            ResultClass resultClass=null;
            //
            GBMessage gbMessage =null;
            for(AA temp: hexStringList){
                gbMessage = new GBMessage();
//                gbMessage.ReadFromBytes(Tools.HexString2Bytes(temp.getHex().trim()));
//               JSONObject json=JSON.parseObject(gbMessage.toString()) ;
//
               resultClass=new ResultClass();
//                resultClass.setLogTime(temp.getLogtime());
//                resultClass.setVin(gbMessage.getVin());
//                //
//                resultClass.setCommand(json.getString("命令标识"));
//                resultClass.setAck(json.getString("应答标志"));

                resultClass.setHexString(temp.getHex());


//                switch(gbMessage.getMessageType()) {
//                    //"车辆登入"
//                    case 1:
//                        resultClassList.add(resultClass);
//                        continue;
//
//                        // "车辆登出"
//                    case 4:
//                        resultClassList.add(resultClass);
//                        continue;
//                }
//
//                /**
//                 * 整车数据
//                 */
//                GB_02 gb_02;
//                try{
//                     gb_02=(GB_02)gbMessage.getMessageContents();
//                    resultClass.setMessageTime(gb_02.getTime());
//                }catch (Exception e){
//                    System.out.println("err="+temp.getHex());
//                    e.printStackTrace();
//                    continue;
//                }
//
//                for (IRealTimeAdditionalItem iRealTimeAdditionalItem:gb_02.getAdditionals()){
//                   int additionId= iRealTimeAdditionalItem.getAdditionalId();
//                    getALLData( additionId,resultClass,gb_02,iRealTimeAdditionalItem);
//                }


                resultClassList.add(resultClass);
            }

            Map<String,List<ResultClass> > mapData=new HashMap<>();
            String[] headersExit ={
           "日志时间","车架号","报文时间","命令标识","应答标识",
                    "车辆状态","充电状态","运行模式","车速","累计里程","总电压","总电流","SOC","DC-DC状态","挡位","绝缘电阻","加速踏板行程值","制动踏板状态",
                    "驱动电机个数","驱动电机序号","驱动电机状态","驱动电机控制器温度","驱动电机转速","驱动电机转矩","驱动电机温度","电机控制器输入电压","电机控制器直流母线电流",
                    "发动机状态","曲轴转速","燃料消耗率",
                    "定位状态","经度","纬度",
                    "最高电压电池子系统号","最高电压电池单体代号","电池单体电压最高值","最低电压电池子系统号","最低电压电池单体代号","电池单体电压最低值","最高温度子系统号","最高温度探针单体代号","最高温度值","最低温度子系统号","最低温度探针子系统代号","最低温度值",
                    "最高报警等级","通用报警标志","报警类型","可充电储能装置故障总数N1","驱动电机故障总数N2","发动机故障总数N3","其他故障总数N4",
                    "可充电储能子系统个数","可充电储能子系统号","可充电储能装置电压","可充电储能装置电流","单体电池总数","本帧起始电池序号","本帧单体电池总数","单体电池电压",
                    "可充电储能子系统个数","可充电储能子系统号","可充电储能温度探针个数","温度值","报文"
            };


//            WriteToExcel.outToExcel(resultClassList,"d://data.xls",headersExit);

        }catch (Exception e){
                e.printStackTrace();
        }

    }

    public static void  getALLData(int additionId, ResultClass resultClass, GB_02 gb_02,IRealTimeAdditionalItem iRealTimeAdditionalItem){

        switch (additionId){

            case 1:
                GB_02_01 gb_02_01=(GB_02_01)gb_02.getRealTimeAdditionalItem(additionId);
                //
                resultClass.setVehicleStatus(gb_02_01.getVehicleStatusString());
                resultClass.setCharging(gb_02_01.getChargingString());
                resultClass.setRunningMode(gb_02_01.getRunningModeString());
                resultClass.setSpeed(gb_02_01.getSpeedString());
                resultClass.setMileage(gb_02_01.getMileageString());
                resultClass.setVoltage(gb_02_01.getVoltageString());
                resultClass.setCurrent(gb_02_01.getCurrentString());
                resultClass.setSoc(gb_02_01.getSocString());
                resultClass.setDcDcStatus(gb_02_01.getDcDcStatusString());
                resultClass.setGear(gb_02_01.getGearString());
                resultClass.setInsulationResistance(gb_02_01.getInsulationResistance() + "KΩ");
                resultClass.setAcceleratedPedalStrokeValue(gb_02_01.getAcceleratedPedalStrokeValueString());
                resultClass.setBrakePedalState(gb_02_01.getBrakePedalStateString());
                break;
            case 2:
                GB_02_02 gb_02_02=(GB_02_02)gb_02.getRealTimeAdditionalItem(additionId);
                //
                resultClass.setDriveMotorNumber(gb_02_02.getDriveMotorNumber()+"");

                //GB_02_02_Item

                GB_02_02_Item gb_02_02_item =(GB_02_02_Item)gb_02_02.getAssemblyList().get(0);


                resultClass.setDriveMotorSerial(gb_02_02_item.getDriveMotorSerial()+"");
                resultClass.setDriveMotorStatus(gb_02_02_item.getDriveMotorStatusString());
                resultClass.setDriveMotorControllerTemperature(gb_02_02_item.getDriveMotorControllerTemperatureString());
                resultClass.setDriveMotorSpeed(gb_02_02_item.getDriveMotorSpeedString());
                resultClass.setDriveMotorTorque(gb_02_02_item.getDriveMotorTorqueString());
                resultClass.setDriveMotorTemperature(gb_02_02_item.getDriveMotorTemperatureString());
                resultClass.setMotorInputVoltage(gb_02_02_item.getMotorInputVoltageString());
                resultClass.setMotorControllerDCBusCurrent(gb_02_02_item.getMotorControllerDCBusCurrentString());
                break;

            case 3:
                GB_02_03 gb_02_03=(GB_02_03)gb_02.getRealTimeAdditionalItem(additionId);
                //

                break;






            case 4:
                GB_02_04 gb_02_04=(GB_02_04)gb_02.getRealTimeAdditionalItem(additionId);
                //
                resultClass.setEngineStatus(gb_02_04.getEngineStatusString());
                resultClass.setCrankshaftSpeed(gb_02_04.getCrankshaftSpeedString());
                resultClass.setFuelConsumptionRateRate(gb_02_04.getFuelConsumptionRateString());
                break;

            case 5:
                GB_02_05 gb_02_05=(GB_02_05)gb_02.getRealTimeAdditionalItem(additionId);
                //
                resultClass.setPositionStatus(gb_02_05.getPositionStatusString());

                BigDecimal bigDecimalLong = AccurateOperationUtils.mul((double)gb_02_05.getLongitude(), 1.0E-6D);
                bigDecimalLong = bigDecimalLong.setScale(6, 4);
                resultClass.setLongitude(bigDecimalLong.toString());
                //
                BigDecimal bigDecimalLat = AccurateOperationUtils.mul((double)gb_02_05.getLatitude(), 1.0E-6D);
                bigDecimalLat = bigDecimalLat.setScale(6, 4);
                resultClass.setLatitude(bigDecimalLat.toString());
                break;


            case 6:
                GB_02_06 gb_02_06=(GB_02_06)gb_02.getRealTimeAdditionalItem(additionId);
                //
                resultClass.setHighestVoltageBatterySubsystemNumber(gb_02_06.getHighestVoltageBatterySubsystemNumber()+"");
                resultClass.setHighestVoltageBatterySingleModuleCode(gb_02_06.getHighestVoltageBatterySingleModuleCode()+"");
                resultClass.setBatterySingleVoltageHighestValue(gb_02_06.getBatterySingleVoltageHighestValueString());
                resultClass.setBatterySingleVoltageLowestValue(gb_02_06.getBatterySingleVoltageLowestValueString());
                resultClass.setLowestVoltageBatterySubsystemNumber(gb_02_06.getLowestVoltageBatterySubsystemNumber()+"");
                resultClass.setLowestVoltageBatterySingleModuleCode(gb_02_06.getLowestVoltageBatterySingleModuleCode()+"");
                resultClass.setHighestTemperatureSubsystemNumber(gb_02_06.getHighestTemperatureSubsystemNumber()+"");
                resultClass.setHighestTemperatureProbeMonomerSingleCode(gb_02_06.getHighestTemperatureProbeMonomerSingleCode()+"");
                resultClass.setHighestTemperatureValue(gb_02_06.getHighestTemperatureValueString());
                resultClass.setLowestTemperatureSubsystemNumber(gb_02_06.getLowestTemperatureSubsystemNumber()+"");
                resultClass.setLowestTemperatureProbeSubsystemCode(gb_02_06.getLowestTemperatureProbeSubsystemCode()+"");
                resultClass.setLowestTemperatureValue(gb_02_06.getLowestTemperatureValueString());
                break;

            case 7:
                GB_02_07 gb_02_07=(GB_02_07)gb_02.getRealTimeAdditionalItem(additionId);
                //
                resultClass.setHighestAlarmLevel(gb_02_07.getHighestAlarmLevelString());
                resultClass.setGeneralAlarmFlag(gb_02_07.getGeneralAlarmFlagString());
//                resultClass.setAlarmFlag(gb_02_07.getal);
                resultClass.setRechargeableEnergyStorageDeviceTotalNumberOfFailures(gb_02_07.getTotalNumberString(gb_02_07.getRechargeableEnergyStorageDeviceTotalNumberOfFailures()));
                resultClass.setDriveMotorTotalNumberOfFailures(gb_02_07.getTotalNumberString(gb_02_07.getDriveMotorTotalNumberOfFailures()));
                resultClass.setEngineTotalNumberOfFailures(gb_02_07.getTotalNumberString(gb_02_07.getEngineTotalNumberOfFailures()));
                resultClass.setOtherTotalNumberOfFailures(gb_02_07.getTotalNumberString(gb_02_07.getOtherTotalNumberOfFailures()));
                break;









            case 8:
                GB_02_08 gb_02_08=(GB_02_08)gb_02.getRealTimeAdditionalItem(additionId);
                //
                resultClass.setChargeEnergyStoreSubSystemNumber(gb_02_08.getDataString(gb_02_08.getChargeEnergyStoreSubSystemNumber()));
                GB_02_08_Item  gb_02_08_item=(GB_02_08_Item)gb_02_08.getChargeEnergyStoreSubSystemVoltageList().get(0);

                resultClass.setChargeEnergyStoreSerial(gb_02_08_item.getChargeEnergyStoreSerial()+"");
                resultClass.setChargeEnergyStoreVoltage( gb_02_08_item.getChargeEnergyStoreVoltageString());
                resultClass.setChargeEnergyStoreCurrent(gb_02_08_item.getChargeEnergyStoreCurrentString());
                resultClass.setMonomerBatteryNumber(gb_02_08_item.getMonomerBatteryNumberString());
                resultClass.setFrameStartBatterySerial(gb_02_08_item.getFrameStartBatterySerial()+"");

                resultClass.setFrameStartBatteryNumber(gb_02_08_item.getFrameStartBatteryNumber()+"");
                //this.getFrameStartBatterySerial()
                resultClass.setMonomerBatteryVoltageList(gb_02_08_item.getMonomerBatteryVoltageListString());

                break;


            case 9:
                GB_02_09 gb_02_09=(GB_02_09)gb_02.getRealTimeAdditionalItem(additionId);
                //

                resultClass.setRechargeableEnergyStorageSubsystemsTotalNumber(gb_02_09.getDataString(gb_02_09.getRechargeableEnergyStorageSubsystemsTotalNumber()));
                //
                GB_02_09_Item gb_02_09_item=(GB_02_09_Item)gb_02_09.getAssemblyList().get(0);
                //
                resultClass.setRechargeableEnergyStorageSubsystemNumber(gb_02_09_item.getRechargeableEnergyStorageSubsystemNumber()+"");
                resultClass.setRechargeableEnergyStorageTemperatureProbesTotalNumber(gb_02_09_item.getRechargeableEnergyStorageTemperatureProbesTotalNumberString());
                resultClass.setTemperatureProbesList(gb_02_09_item.getTemperatureProbesListString());
                break;



        }





    }

}
