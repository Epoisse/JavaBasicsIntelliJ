package com.syntax.replit;

import java.util.Arrays;

public class Replit132 {
    public static void main(String[] args) {
        int[][] a = {{1, 2, 3, 4},
                     {4, 5, 6, 7},
                     {1, 3, 5, 7}};
        //printing the elements from new array using for each loop
        for (int[] r : reduce10(a)) {
            for (int c : r) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }

    //declaring the method
    static int[][] reduce10(int[][] array) {
        /*When we're declaring a new array we have to specify the number of rows and columns int [rows][columns] array.
        But in this case, we have the array in the main method which we take as parameters for this method, so
        we use [array.length] to know how many rows are in there (3 rows).
        Number of columns I have not decided how to set dynamically, so I set it just using length from the first
        column of the array a [array[0].length] (4 columns)
         */
        int[][] array1 = new int[array.length][array[0].length];
        /*Then we use for loop to retrieve data from the array a from the main method and assign
        these values to our new array1 subtracting 10 from each value before that
         */
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) array1[i][j] = array[i][j] - 10;
        }
        //returning new array with values -10
        return array1;
    }
}
