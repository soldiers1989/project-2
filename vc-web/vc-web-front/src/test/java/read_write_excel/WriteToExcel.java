//package read_write_excel;
//
//
//import com.ccclubs.admin.util.ExportExcelTemp;
//import com.ccclubs.common.ExportExcelTemp;
//import com.ccclubs.gps.ResultClass;
//import org.apache.poi.hssf.usermodel.HSSFWorkbook;
//
//import java.io.ByteArrayOutputStream;
//import java.io.FileOutputStream;
//import java.io.OutputStream;
//import java.util.List;
//import java.util.Map;
//
///**
// * Created by Administrator on 2017/9/11 0011.
// */
//
//
//public class WriteToExcel {
//
//    /**
//     * 最后文件生成的保存路径
//     */
//    public static ByteArrayOutputStream outToExcel(Map<String,List<ResultClass>> existDateMap, String result_save_path, String[] header ){
//
//        String[] headersExit =header;
//
//
//
//        //
//        ExportExcelTemp eeu = new ExportExcelTemp();
//        HSSFWorkbook workbook=eeu.getWorkbook();
//        int sheetNumber=eeu.getSheetNumber();
//
//        //输出地址
//        ByteArrayOutputStream outPutByte = new ByteArrayOutputStream();
//        try{
//            //
//            String headers[]=headersExit;
//            for(String weekkey:existDateMap.keySet()){
//                //
//                List<ResultClass> data=existDateMap.get(weekkey);
//                int exist= workbook.getSheetIndex(weekkey);
//                if(exist==0){//存在则删除
//                    workbook.removeSheetAt(workbook.getSheetIndex(weekkey));
//                    sheetNumber--;
//                }
//                eeu.exportExcel(workbook, sheetNumber++, weekkey, headers, data);
//            }
//
//            OutputStream stream = new FileOutputStream(result_save_path);
//            workbook.write(stream);
////			out.close();
//            eeu.close();
//        }catch (Exception e){
//            e.printStackTrace();
//            try{
//                eeu.close();
//            }catch (Exception e1){
//                e1.printStackTrace();
//            }
//        }
//        return   outPutByte;
//    }
//
//
//
//
//
//}
