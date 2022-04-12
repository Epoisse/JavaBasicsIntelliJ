package com.syntax.homework;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

public class Draft3 {
    public static void main(String[] args) throws IOException {
        String path = "/Users/sebvettal/Desktop/SWJiraFeb-Sep22.xlsx";
        FileInputStream fis = new FileInputStream(path);
        XSSFWorkbook xssfWorkbook = new XSSFWorkbook(fis);
        Sheet sheet = xssfWorkbook.getSheetAt(0);

        List<Map<String, String>> excelData = new ArrayList<>();
        Row headerRow = sheet.getRow(1);
        for (int i = 2; i < sheet.getPhysicalNumberOfRows(); i++) {
            Row row = sheet.getRow(i);
            LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
            for (int j = 0; j < 2; j++) {
                Cell headerCell = headerRow.getCell(j);
                Cell bodyCell = row.getCell(j);
                linkedHashMap.put(headerCell.toString(), bodyCell.toString());
            }
            excelData.add(linkedHashMap);
        }

        System.out.println(excelData.size());
        System.out.println(excelData.get(0));
        Map<String, String> hashMap = excelData.get(0);
        Set<String> keys = hashMap.keySet();
        Collection<String> values = hashMap.values();
        for (String key :
                keys) {
            System.out.println(key);
        }
        for (String value : values) {
            System.out.println(value);
        }


    }
}