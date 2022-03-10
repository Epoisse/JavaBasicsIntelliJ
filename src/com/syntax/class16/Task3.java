package com.syntax.class16;

public class Task3 {
    public static void main(String[] args) {
        String a="Is it Saturday? Is it raining? Do we have a Java Class today?";
        String [] splitted=a.split("[?]");
        System.out.println(splitted.length);
        for (int i=0; i<splitted.length; i++) {
            System.out.println(splitted[i]);
        }
    }
}
