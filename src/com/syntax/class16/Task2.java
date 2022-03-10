package com.syntax.class16;

public class Task2 {
    public static void main(String[] args) {
        String s=new String("asdfhluUIHIUPHOi19382759832759739856&*^&(*&%)(&");
        StringBuilder neoString = new StringBuilder(s.replaceAll("[^A-Za-z]",""));
        System.out.println(neoString.length());
    }
}
