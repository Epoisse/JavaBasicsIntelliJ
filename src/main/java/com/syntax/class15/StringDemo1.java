package com.syntax.class15;

public class StringDemo1 {
    public static void main(String[] args) {
        String userName="LiLLy";
        String password="Lilly123";

        if ("Lilly".equals(userName)&& "Lilly123".equals(password)) {
            System.out.println("Welcome back");
        } else {
            System.out.println("UserName or password is not correct");
        }
        if ("Lilly".equalsIgnoreCase(userName)&& "Lilly123".equalsIgnoreCase(password)) {
            System.out.println("Welcome back");
        } else {
            System.out.println("UserName or password is not correct");
        }
    }
}
