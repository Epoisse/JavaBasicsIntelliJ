package com.syntax.class33;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionDemo3 {
    public static void main(String[] args) {
        System.out.println("0");
        try {
            System.out.println(10 / 0);
            System.out.println("1");
            //throw  new RuntimeException();

        } catch (ArithmeticException are) {
            System.out.println("2");
            System.out.println(10/0);
        } catch (Exception e) {
            System.out.println("Something went wrong"); // catch all types of exceptions
        } finally {
            System.out.println("6"); // always executed even though there is no any error
        }
        System.out.println("7");
    }
}
