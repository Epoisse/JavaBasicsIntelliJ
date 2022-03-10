package com.syntax.reviewclass7;

public class Practice2 {
    String getRecord() {
        String department ="QA";
        String empName="Violet";
        String details = "Worker"+empName+"belongs to "+department;
        return details;
    }

    public static void main(String[] args) {
        Practice2 practice2=new Practice2();
        practice2.getRecord();
    }
}
