package com.syntax.homework;

import java.util.LinkedHashSet;

public class MapConcatStrings {

    public static void main(String[] args) {

        LinkedHashSet<String> collection = new LinkedHashSet<>();
        collection.add("apple");
        collection.add("peach");
        collection.add("mango");
        collection.add("apple");
        collection.add("orange");


        StringBuilder concat = new StringBuilder();
        for (String s : collection) {
            concat.append(s);
        }
        System.out.println(concat);
    }
}
