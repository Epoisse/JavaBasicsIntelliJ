package com.syntax.class30;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapDemo6 {
    public static void main(String[] args) {
        HashMap<String, Double> fruit = new HashMap<>();
        fruit.put("Apple", 20.0);
        fruit.put("Banana", 23.0);
        fruit.put("Kiwi", 203.0);
        fruit.put("Orange", 26.0);
        fruit.put("Mango", 25.0);
        fruit.put("Peach", 23.0);


        System.out.println(fruit.keySet());
        System.out.println(fruit.values());
        System.out.println(fruit.entrySet());
        // getting keys and values in the form of an entry (Map.Entry)
        Iterator<Map.Entry<String, Double>> iterator = fruit.entrySet().iterator();
        while (iterator.hasNext())  {
            System.out.println(iterator.next());
            System.out.println(iterator.next().getKey());
            System.out.println(iterator.next().getValue());

        }
    }
}
