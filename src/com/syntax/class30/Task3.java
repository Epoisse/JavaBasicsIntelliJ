package com.syntax.class30;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Task3 {
    public static void main(String[] args) {
        HashMap<Integer, String> bestBuy=new HashMap<>();
        bestBuy.put(773737, "printer");
        bestBuy.put(23432, "camera");
        bestBuy.put(775737, "laptop");
        bestBuy.put(773747, "TV");

        Iterator<Map.Entry<Integer, String>> iterator=bestBuy.entrySet().iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
