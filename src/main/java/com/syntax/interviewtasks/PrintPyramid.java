package com.syntax.interviewtasks;

import java.util.Scanner;

public class PrintPyramid {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(n + " ");
            }
            for (int j = 0; j < i + 1; j++) {
                System.out.print(n + " ");
            }
            System.out.println();
        }
    }
}
/*
* Write logic in the main method to print a pyramid of numbers
* the logic should be generic i.e. it can print the pyrmid for any numbmer
* like 5, 6, 7 etc
* if input is 2 output should be

2

2 2

if input is 3 the output should be

3

3 3

3 3 3

Ask user input for the number for which he wants to make the pyramid using scanner
* */
