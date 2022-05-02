package com.syntax.class32;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ExcelDemo6 {
    public static void main(String[] args) throws IOException {
        String path = "/Users/sebvettal/Desktop/Book3.xlsx";
        FileInputStream fileInputStream = new FileInputStream(path);
        XSSFWorkbook xssfWorkbook = new XSSFWorkbook(fileInputStream);

        Sheet sheet = xssfWorkbook.getSheet("Sheet1");
        //A list of maps to store the data from excel each map will store the data from each row
        List<Map<String, String>> excelData = new ArrayList<>();
        //getting the header from the excel file so that we can use the data from this header row as keys for the maps
        // like firstName lastname etc
        Row headerRow = sheet.getRow(0);
        //we write a loop to get all the rows from this sheet except the first row because it contains the headers
        for (int i = 1; i < sheet.getPhysicalNumberOfRows(); i++) {
            //getting all the rows starting from row number 2 skipping the first one because it contains headers
            Row row = sheet.getRow(i);
            //for each row we create a new map so that we don't override the data for all the rows
            LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
            //once we have got the row to get the keys and the row to get the values for the data
            for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
                linkedHashMap.put(headerRow.getCell(j).toString(), row.getCell(j).toString());
            }
            //once we are done storing all the data from a row inside a map we put
            // that map inside the list that we created
            excelData.add(linkedHashMap);
        }
        System.out.println(excelData);
    }
}
