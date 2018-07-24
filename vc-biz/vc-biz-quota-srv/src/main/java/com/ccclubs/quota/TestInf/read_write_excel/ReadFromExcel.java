package com.ccclubs.quota.TestInf.read_write_excel;


import org.apache.commons.io.FilenameUtils;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class ReadFromExcel {

    /**
     * Excel 2003
     */
    private final static String XLS = "xls";
    /**
     * Excel 2007
     */
    private final static String XLSX = "xlsx";
    /**
     * 分隔符
     */
    private final static String SEPARATOR = "|";


    /**
     * 此文件接收excel中的数据，存入ExcelClass类中。返回List<ExcelClass>数据</>
     * @param args
     */
    public static void main(String[] args) {
        String path = "D:\\vinTemp17_98_detail.xls";
        try{
            readFromExcel(path,0);

        }catch (Exception e){
            e.printStackTrace();
        }
    }




    /**
     * 由Excel文件的Sheet导出至List
     *
     * @param sheetNum
     * @return
     */
    public static List<ExcelClass> readFromExcel(String path, int sheetNum) throws IOException {
        //

        File file=new File(path);
        InputStream is=new FileInputStream(file);
        String extensionName=FilenameUtils.getExtension(file.getName());
        //
        Workbook workbook = null;
        //
        if (extensionName.toLowerCase().equals(XLS)) {
            workbook = new HSSFWorkbook(is);
        } else if (extensionName.toLowerCase().equals(XLSX)) {
            workbook = new XSSFWorkbook(is);
        }
        return readFromExcel(workbook);

    }

    /**
     * 由指定的Sheet导出至List
     *
     * @param workbook
     * @return
     * @throws IOException
     */
    private static List<ExcelClass> readFromExcel(Workbook workbook) {

        List<ExcelClass> externalList = new ArrayList<>();
        try {
            // 循环工作表Sheet--从第三行开始计算
            for (int numSheet = 0; numSheet < 1; numSheet++) {
                Sheet sheet = workbook.getSheetAt(numSheet);
                if (sheet == null) {
                    continue;
                }
                int rows = sheet.getPhysicalNumberOfRows();
                int columns = sheet.getRow(0).getPhysicalNumberOfCells();//从第二行开始算
                // 循环行Row
                ExcelClass dataClass = null;
                for (int rowNum = 0; rowNum < rows; rowNum++) {
                    String rowinfo = "";
                    Row row = sheet.getRow(rowNum);
                    if (row != null) {
                        dataClass = new ExcelClass();
                        //遍历列
                        //状态默认值
                        for (int columnNum = 0; columnNum < columns; columnNum++) {
                            Cell cell = row.getCell(columnNum);
                            getExternalData2(dataClass, cell, columnNum);
                        }

                        externalList.add(dataClass);
                    }
                }
                break;
            }
            return externalList;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }



    public static  void getExternalData2(ExcelClass dataClass, Cell cell, int columnNum) {
        if (cell != null) {
            cell.setCellType(Cell.CELL_TYPE_STRING);
            String value = cell.getStringCellValue();
            if (null != value && !"".equals(value)) {
                switch (columnNum) {

                    case 0:
                        dataClass.setVin(value);
                        break;

                    case 1:
                        dataClass.setNumber(value);
                        break;

//                    case 2:
//                        dataClass.setStartTime(value);
//                        break;
//
                    case 2:
                        dataClass.setMobile(value);
                        break;


                }
            }
        }
    }
}
