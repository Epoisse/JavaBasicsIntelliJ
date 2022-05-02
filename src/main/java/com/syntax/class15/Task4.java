package com.syntax.class15;

public class Task4 {
    public static void main(String[] args) {
        String day = "Sunday";
        String revers = new StringBuilder(day).reverse().toString();
        System.out.println(revers);

        for (int i = day.length() - 1; i >= 0; i--) {
            System.out.print(day.charAt(i));
        }
    }
}
