package com.syntax.class33;

public class ExceptionDemo4 {
    public static void main(String[] args) {
        System.out.println("0");
        try {
            System.out.println("1");
            System.out.println(10 / 0);
            System.out.println("2");
        } catch (ArithmeticException e) {
            // System.out.println("3");
            // e.printStackTrace(); //getting stacktrace
            System.out.println(e.getMessage()); //getting the error message
            System.out.println(e.getClass()); //getting the class of the error
        }
        System.out.println("4");
    }
}
