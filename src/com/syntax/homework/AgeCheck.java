package com.syntax.homework;

public class AgeCheck {

    public void mlda(int age) throws RuntimeException {

        if (age < 16) {
            throw new RuntimeException("Age is less than 16");
        }
    }

    public static void main(String[] args) {
        AgeCheck ageCheck = new AgeCheck();
        ageCheck.mlda(12);
    }
}
