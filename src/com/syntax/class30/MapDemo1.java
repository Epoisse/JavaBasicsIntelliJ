package com.syntax.class30;

import java.util.HashMap;

public class MapDemo1 {
    public static void main(String[] args) {
        HashMap<String, Double> fruit =new HashMap<>();
         //fruit.put("Apple", 20); autocasting does not work in collections and maps
        fruit.put("Apple", 20.0);
        fruit.put("Banana", 23.0);
        fruit.put("Kiwi", 203.0);
        fruit.put("Orange", 26.0);
        fruit.put("Mango", 25.0);
        fruit.put("Apple", 27.0); // duplicate values are overwritten
        System.out.println(fruit);
        System.out.println(fruit.get("Kiwi"));


    }
}
