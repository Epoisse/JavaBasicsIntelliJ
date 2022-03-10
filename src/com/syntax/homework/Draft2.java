package com.syntax.homework;

public class Draft2 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        mystery(a);
        // should print out 10 1 30 2 50
    }

    static void mystery(int[] array) {
        int[] result=new int[array.length];
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                result[i]=array[i] / 2;
            } else {
                result[i]=array[i] * 10;
            }
            System.out.println(result[i]);
        }
    }
}

