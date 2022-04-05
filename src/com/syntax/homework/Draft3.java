package com.syntax.homework;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class Draft3 {
    public static void main(String[] args) {
        LinkedHashMap<String, String> address = new LinkedHashMap<>();
        address.put("Street", "Patrick ST");
        address.put("Suite", "256");
        address.put("City", "Vienna");
        address.put("Zip", "22180");
        address.put("Country", "United States");

        for (Map.Entry<String, String> entry :
                address.entrySet()) {
            System.out.println(entry.getValue());
        }
    }
}