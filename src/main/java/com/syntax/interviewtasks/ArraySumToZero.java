package com.syntax.interviewtasks;

import java.util.Arrays;
import java.util.Random;

public class ArraySumToZero {
    public static int[] arraySumToZero(int N) {
        int[] array = new int[N];
        Random random = new Random();
        int rnd = random.nextInt(N) + 1;

        if (N % 2 == 0) {
            for (int i = 0; i < N; i++) {
                if (i % 2 == 0) {
                    array[i] = rnd;
                } else array[i] = -rnd;
            }
        } else {
            array[0] = 0;
            for (int i = 1; i < N; i++) {
                if (i % 2 == 0) {
                    array[i] = rnd;
                } else array[i] = -rnd;
            }
        }
        return array;
    }

    public static int[] arraySumToZeroJohn(int n) {
        int[] intArr = new int[n];
        for (int i = 0; i < n / 2; i++) {
            intArr[i] = n - i;
            intArr[intArr.length - 1 - i] = (n - i) * -1;
        }
        return intArr;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(arraySumToZeroJohn(5)));
    }
}
