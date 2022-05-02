package com.syntax.class33;

public class Math {
    void add(int a, int b) {
        System.out.println(a + b);
    }

    void divide(int a, int b) {
//        if (b != 0) {
//            System.out.println(a / b);
//        } else {
//            System.out.println("You are trying to divide number by zero which is not possible");
//        }
        try {
            System.out.println(a / b);
        } catch (ArithmeticException are) {
            System.out.println("You are trying to divide number by zero which is not possible");
        } catch (NullPointerException npe) {
            System.out.println("Pls initialize obj to avoid this exception");
        }
    }
}
