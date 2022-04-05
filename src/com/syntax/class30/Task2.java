package com.syntax.class30;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class Task2 {
    public static void main(String[] args) {
        TreeMap<String, String> countries = new TreeMap<>();
        countries.put("USA", "Washington DC");
        countries.put("Canada", "Ottawa");
        countries.put("Mexico", "Mexico City");
        countries.put("Italy", "Milan");
        countries.put("Germany", "Berlin");
        countries.put("Denmark", "Copenhagen");


        for (Map.Entry<String, String> entry : countries.entrySet()
        ) {
            System.out.println(entry);
            System.out.println(entry.getValue());
        }

        System.out.println("-------------------------");

        Iterator<Map.Entry<String, String>> iterator = countries.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> entry = iterator.next();
            System.out.println(entry);
            System.out.println(entry.getValue());
        }
    }
}
/*
Create a map of countries with its capital that will store countries in alphabetical order.
Print all keys and values from a country map using for each loop and iterator.
Print all values from a country map using for each loop and iterator.
 */