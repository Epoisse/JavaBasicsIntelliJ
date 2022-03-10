package com.syntax.class16;

public class StringDemo2 {
    public static void main(String[] args) {
        String str="Batch 12 is good";
        System.out.println(str.replace("good", "Great"));
        System.out.println(str.replace("o", "0"));
        System.out.println(str.replace(" ","_"));
        System.out.println(str.replace("12", "13"));
        System.out.println("------------------------------------");


        // replace range
        String str1="12345!@#$$%%^&*sdfhaliuAWFGGAGFR";
        System.out.println(str1.replaceAll("[0-9]","#"));
        System.out.println(str1.replaceAll("[a-z]","#"));
        System.out.println(str1.replaceAll("[A-Z]","#"));
        System.out.println(str1.replaceAll("[!-/]","#"));
        System.out.println(str1.replaceAll("[-DEL]","#"));
    }
}
