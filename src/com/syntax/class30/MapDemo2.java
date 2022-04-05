package com.syntax.class30;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MapDemo2 {
    public static void main(String[] args) {
        HashMap<String, Double> fruit = new HashMap<>();
        fruit.put("Apple", 20.0);
        fruit.put("Banana", 23.0);
        fruit.put("Kiwi", 203.0);
        fruit.put("Orange", 26.0);
        fruit.put("Mango", 25.0);

        Set<String> keys=fruit.keySet();
        System.out.println(keys);
        Iterator<String> iterator= keys.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().contains("e")) {
                iterator.remove();
            }
        }
        System.out.println(fruit);
    }
}
