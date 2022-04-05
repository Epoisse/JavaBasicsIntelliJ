package com.syntax.class30;

import java.util.HashMap;
import java.util.Iterator;

public class MapDemo4 {
    public static void main(String[] args) {
        HashMap<String, Double> fruit = new HashMap<>();
        fruit.put("Apple", 20.0);
        fruit.put("Banana", 23.0);
        fruit.put("Kiwi", 203.0);
        fruit.put("Orange", 26.0);
        fruit.put("Mango", 25.0);

        // getting the iterator from the map with the help of method chaining.
        // first we are getting the set from the map then we are getting the iterator on that set
        Iterator<String> iterator = fruit.keySet().iterator();
        while (iterator.hasNext()) { // checks if there are still elements left in the iterator
            String key = iterator.next(); //getting the key from the iterator
            Double value = fruit.get(key); // getting the coresponding values from the map by passing the keys
            if (key.contains("e") && value >= 20) {
                iterator.remove(); // if both conditions are satisfied we remove the element from the map
            }
        }
    }
}
