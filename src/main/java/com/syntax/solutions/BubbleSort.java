package com.syntax.solutions;


import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {

        int[] numbers = new int[]{7, 2, 6, 1, 4, 7, 4, 5, 4, 7, 7, 3, 1};

        int temp = 0;
        for (int i = 0; i < numbers.length; ++i) {
            for (int j = 1; j < (numbers.length - i); ++j) {
                if (numbers[j - 1] > numbers[j]) {
                    temp = numbers[j - 1];
                    numbers[j - 1] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(numbers));




        int dupNums = 0;
        int dupCounter=0;
        int previous = -1;
        for (int number : numbers) {
            if (number == previous) {
                dupNums++;
                if (dupNums == 1) {
                    // printing repeating nums
                    System.out.print(number + " ");
                    dupCounter++;
                }
            } else {
                previous = number;
                dupNums = 0;
            }
        }
        // printing counter of repeating nums
        System.out.println("\n"+dupCounter);
    }
}

// walk through the sorted array and count duplicates
      /*  int numDup = 0, dupCount = 0;
        int previous = -1;
        for (int i = 0; i < numbers.length; ++i) {
            if (numbers[i] == previous) {
                ++numDup;
                if (numDup == 1) {
                    ++dupCount;
                    if (dupCount == 1) {
                        System.out.print(numbers[i]);
                    } else {
                        System.out.print(", " + numbers[i]);
                    }
                }
            } else {
                previous = numbers[i];
                numDup = 0;
            }
        }

        System.out.println("\nNumber of duplicates values: " + dupCount);
    }*/



