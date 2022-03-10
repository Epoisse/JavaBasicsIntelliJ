package com.syntax.class15;

import java.util.Locale;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter father's and mother's names");
        String fatherName = input.nextLine();
        String motherName = input.nextLine();
        String firstPart;
        String secondPart;

        String babyGender;
        do {
            System.out.println("Please enter the baby's gender (Boy or Girl)");
            babyGender = input.nextLine();
        }
        while (!babyGender.equalsIgnoreCase("boy") && !babyGender.equalsIgnoreCase("girl"));
        {

            if (babyGender.equalsIgnoreCase("boy")) {
                firstPart=fatherName.toUpperCase(Locale.ROOT).substring(0,fatherName.length()/2);
                secondPart=motherName.toUpperCase(Locale.ROOT).substring(motherName.length()/2);
                System.out.println("Suggested name is " + firstPart+secondPart);
            } else if (babyGender.equalsIgnoreCase("girl")) {
                firstPart=motherName.substring(0, motherName.length()/2);
                secondPart=fatherName.substring(fatherName.length()/2);
                System.out.println("Suggested name is " + firstPart+secondPart);
            } else {
                System.out.println("error");
            }
        }
    }
}
