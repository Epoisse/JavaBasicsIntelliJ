package com.syntax.replit;

import java.util.Arrays;

public class Replit141 {


    public static void main(String[] args) {

        int[] arr = {5, 12, -3, 7, 3, 22};
        System.out.println(maxValue(arr)); //should print 22
    }

    static int maxValue(int[] arr) {
        Arrays.sort(arr);
        return arr[arr.length - 1];
    }
}
/*
For you to do: Create the maxValue method that will accept int array and return the maximum value in the array.
Method should visible every class in any package!
Expected Output:
22
 */
