package com.syntax.class16;

public class StringDemo1 {
    public static void main(String[] args) {
        String str="Dana #23487927402740 Tarik";
        System.out.println(str.charAt(0));
        System.out.println(str.charAt(3));
        System.out.println(str.length());
        System.out.println(str.charAt(str.length()-1));
        System.out.println("-----------------------------------");
        System.out.println(str.indexOf('A')); // returns -1 because of case sensetive
        System.out.println(str.indexOf('a')); // by default returns first letter in String
        System.out.println(str.lastIndexOf('a'));
        System.out.println("-----------------------------------");
        System.out.println(str.indexOf("#"));
        System.out.println(str.substring(str.indexOf("#")+1));
        System.out.println(str.substring(str.indexOf("#")+1,str.indexOf("#")+1+14));

    }
}
