package com.syntax.homework;

import java.util.ArrayList;

public class CollectionIntegersDuplicates {

    public static void main(String[] args) {

        ArrayList<Integer> duplicates = new ArrayList<>();
        duplicates.add(11);
        duplicates.add(33);
        duplicates.add(11);
        duplicates.add(33);
        duplicates.add(11);

        int sum = 0;
        for (Integer dup :
                duplicates) {
            sum = sum + dup;
        }
        System.out.println(sum);
    }
}
