package com.syntax.class30;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapDemo7 {
    public static void main(String[] args) {
        HashMap<String, Double> fruit = new HashMap<>();
        fruit.put("Apple", 20.0);
        fruit.put("Banana", 23.0);
        fruit.put("Kiwi", 203.0);
        fruit.put("Orange", 26.0);
        fruit.put("Mango", 25.0);

        Iterator<Map.Entry<String, Double>> iterator = fruit.entrySet().iterator();
        while (iterator.hasNext())  {
            Map.Entry<String, Double> entry=iterator.next();
            //getting the keys and values from the Entry object
            if (entry.getKey().endsWith("e") || entry.getValue()>=20) {
                iterator.remove();
            }

        }
        System.out.println(fruit);
    }
}
