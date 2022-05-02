package com.syntax.class15;

public class Task3 {
    public static void main(String[] args) {
        String userName = "olololo";

        if (!userName.isEmpty()) {
            if (userName.length() % 2 != 0 && userName.length() >= 3) {
                System.out.println(userName.charAt(userName.length() / 2));
            } else {
                System.out.println("invalid value 2");
            }
        } else {
            System.out.println("invalid value 2");
        }
    }
}