package com.trendyol.tests;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExcelWrite {
    String path = "SampleData.xlsx";

    @Test
    public void excel_write() throws IOException {

        FileInputStream fileInputStream = new FileInputStream(path);
        XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);

        //#2 Goto the worksheet
         XSSFSheet sheet = workbook.getSheet("Employees");

        //#3 if the cell was empty, we need to first create it.
          XSSFCell salaryCell = sheet.getRow(0).createCell(3);

        //#4 Type the value using setCellValue method:
        salaryCell.setCellValue("Salary");

        XSSFCell salary1 = sheet.getRow(1).createCell(3);
        salary1.setCellValue("10K");

        XSSFCell salary2 = sheet.getRow(2).createCell(3);
        salary2.setCellValue("20K");
        XSSFCell salary3 = sheet.getRow(3).createCell(3);
        salary3.setCellValue("30K");
        XSSFCell salary4 = sheet.getRow(4).createCell(3);
        salary4.setCellValue("40K");
        //#5 To save changes, we need to open file using outPutStream:

        FileOutputStream outputStream = new FileOutputStream(path);
        ////save/write changes to the workbook
         workbook.write(outputStream);

        //#6 close streams and workbook. good to do.

        outputStream.close();
        workbook.close();
      fileInputStream.close();
    }
}
