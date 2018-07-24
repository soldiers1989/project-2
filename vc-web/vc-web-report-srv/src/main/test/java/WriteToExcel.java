import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class WriteToExcel {




    public static Map<String,List<ResultClass>> getExistDateMap(List<ResultClass> resultClassList){

        Map<String,List<ResultClass>> existDateMap=new HashMap<>();
        //
        int totalSize=resultClassList.size();
        int size=65535;
        //
        int count=totalSize/size;
        int i=0;
        int j=0;
        List<ResultClass> llData=new ArrayList<>();
        for(ResultClass ss:resultClassList){
            i++;
            llData.add(ss);
            if(i==65535){
                i=0;
                existDateMap.put("ds"+j++,llData);
                llData=new ArrayList<>();
            }
        }
        if(llData.size()>0){
            existDateMap.put("ds"+j++,llData);
        }
        return existDateMap;
    }



    /**
     * 最后文件生成的保存路径
     */
    public static ByteArrayOutputStream outToExcel(List<ResultClass> listData, String result_save_path, String[] header ){

        //获取需要导入到excel中的数据
        Map<String,List<ResultClass>> existDateMap= getExistDateMap(listData);
        //
        String[] headersExit =header;
        //
        ExportExcelTemp eeu = new ExportExcelTemp();
        HSSFWorkbook workbook=eeu.getWorkbook();
        int sheetNumber=eeu.getSheetNumber();

        //输出地址
        ByteArrayOutputStream outPutByte = new ByteArrayOutputStream();
        try{
            //
            String headers[]=headersExit;
            for(String weekkey:existDateMap.keySet()){
                //
                List<ResultClass> data=existDateMap.get(weekkey);
                int exist= workbook.getSheetIndex(weekkey);
                if(exist==0){//存在则删除
                    workbook.removeSheetAt(workbook.getSheetIndex(weekkey));
                    sheetNumber--;
                }
                eeu.exportExcel(workbook, sheetNumber++, weekkey, headers, data);
            }

            OutputStream stream = new FileOutputStream(result_save_path);
            workbook.write(stream);
            eeu.close();
        }catch (Exception e){
            e.printStackTrace();
            try{
                eeu.close();
            }catch (Exception e1){
                e1.printStackTrace();
            }
        }
        return   outPutByte;
    }






}
