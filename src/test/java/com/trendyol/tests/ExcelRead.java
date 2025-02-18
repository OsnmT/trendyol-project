package com.trendyol.tests;

import com.trendyol.utilities.ConfigurationReader;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.IOException;

public class ExcelRead {
    @Test
    public void read_from_excel_file() throws IOException {
        String path = ConfigurationReader.getProperty("path");

        // to read from excel we need to load it to FileInputStream
        FileInputStream fileInputStream = new FileInputStream(path);

        //workbook>sheet>row>cell

        // <1> Create a workbook

        XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);

        // <2> We need to get specific sheet from currently opened workbook
        XSSFSheet sheet = workbook.getSheet("Employees");

        //Goto Row 1 and Cell 1: TODO:Print out second row first cell
        System.out.println(sheet.getRow(1).getCell(0));

        //emailElem.sendKeys(worksheet.getRow(1).getCell(1));

        System.out.println("sheet.getLastRowNum() = " + sheet.getLastRowNum());
        
        int usedRow =sheet.getPhysicalNumberOfRows();

        for (int rowNum = 0; rowNum < usedRow; rowNum++) {
            String name = sheet.getRow(rowNum).getCell(0).getStringCellValue();
            if(name.equals("Elif")){
                System.out.println("RowNUM = "+rowNum);
                break;
            }

        }

        for (int rowNum = 0; rowNum < usedRow; rowNum++) {
            String salary = sheet.getRow(rowNum).getCell(3).getStringCellValue();
            System.out.println(salary);

        }


    }



}
