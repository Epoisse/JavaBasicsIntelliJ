package com.syntax.homework;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

public class Draft3 {
    public static void main(String[] args) {
        int start = 0;
        int end = 0;
        for (int i = 0; i < 30; i++) {
            Random random = new Random();
            int roll = 1 + random.nextInt(6);
            start %= 40;
            end = start + roll;
            end %= 40;

            System.out.print("start=" + start);
            System.out.print(" roll=" + roll);
            System.out.print(" end=" + end);

            start = end;
            System.out.println();
        }
    }
}