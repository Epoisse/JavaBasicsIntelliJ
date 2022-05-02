package com.syntax.homework;

import java.util.Iterator;
import java.util.TreeSet;

public class SetTask2 {
    public static void main(String[] args) {
        TreeSet<String> countries = new TreeSet<>();
        countries.add("Italy");
        countries.add("Poland");
        countries.add("USA");
        countries.add("China");
        countries.add("Albania");
        countries.add("Moldova");
        countries.add("Bulgaria");

        System.out.println(countries);

        for (String count : countries) {
            System.out.print(count + " ");

        }
        System.out.println();

        Iterator<String> iterator = countries.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
    }
}
