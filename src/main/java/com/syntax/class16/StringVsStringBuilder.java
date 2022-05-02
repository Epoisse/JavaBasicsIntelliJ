package com.syntax.class16;

public class StringVsStringBuilder {
    public static void main(String[] args) {
        String s="Asghar Is Great";
        System.out.println(s.replace(" ", ""));
        System.out.println(s);

        // changes the original variable
        StringBuilder stringBuilder=new StringBuilder("Asghar Is Great");

        System.out.println(stringBuilder.reverse());
        System.out.println(stringBuilder);
    }
}
