package com.syntax.class15;

public class StringDemo2 {
    public static void main(String[] args) {
        String name = "How to know index of char from String w";
        System.out.println(name.lastIndexOf("w"));
        System.out.println(name.indexOf("know"));
        System.out.println(name.indexOf("w"));
        System.out.println(name.indexOf("w", 2+1));
        System.out.println(name.indexOf("w", name.indexOf("w")+1)); // the same as line 8
    }
}
