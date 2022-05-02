package com.syntax.class28;

import java.util.ArrayList;
import java.util.Iterator;

public class Task4 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers=new ArrayList<>();
        for (int i = 2; i < 500; i+=2) {
            numbers.add(i);
        }
        numbers.removeIf(integer -> integer % 5 == 0);

        System.out.println(numbers);
    }
}
