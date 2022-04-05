package com.syntax.class30;

import java.util.HashMap;
import java.util.Map;

public class MapDemo5 {
    public static void main(String[] args) {
        HashMap<String, Double> fruit = new HashMap<>();
        fruit.put("Apple", 20.0);
        fruit.put("Banana", 23.0);
        fruit.put("Kiwi", 203.0);
        fruit.put("Orange", 26.0);
        fruit.put("Mango", 25.0);


        // entrySet is a box inside we have boxes with keys and values
        System.out.println(fruit.entrySet());
        // getting the entries ala small boxes that contain the keys and values together
        for (Map.Entry<String, Double> entry : fruit.entrySet()) {
            System.out.println(entry);
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
    }
}
