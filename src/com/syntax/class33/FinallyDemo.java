package com.syntax.class33;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FinallyDemo {
    public static void main(String[] args) {
        FileInputStream fileInputStream =null;
        try {
            String path = "/Users/sebvettal/Desktop/Book3.xlsx";
            fileInputStream = new FileInputStream(path);
            XSSFWorkbook xssfWorkbook = new XSSFWorkbook(fileInputStream);
            Sheet sheet = xssfWorkbook.getSheet("Sheet1"); // or get.SheetAt (0);
        } catch (FileNotFoundException exception) {
            System.out.println("file is not present on provided path ");
        } catch (IOException ioException) {
            System.out.println("something with hard drive went wrong");
        } finally {
            try {
                fileInputStream.close();
            } catch (IOException e) {
                System.out.println("error while closing the file");
            }
        }
        System.out.println("Now you should be able to perform other operation with the file");
    }
}

