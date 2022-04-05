package com.syntax.class30;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

public class MapDemo3 {
    public static void main(String[] args) {
        HashMap<String, Double> fruit = new HashMap<>();
        fruit.put("Apple", 20.0);
        fruit.put("Banana", 13.0);
        fruit.put("Kiwi", 203.0);
        fruit.put("Orange", 26.0);
        fruit.put("Mango", 25.0);

        Collection<Double> values=fruit.values();
        System.out.println(values);

        Iterator<Double> iterator=values.iterator();
        while (iterator.hasNext()) {
            if(iterator.next()>=20) {
                iterator.remove();
            }
        }
        System.out.println(fruit);
    }
}