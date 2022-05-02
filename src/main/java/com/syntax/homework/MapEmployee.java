package com.syntax.homework;

import java.util.HashMap;
import java.util.Map;

public class MapEmployee {
    public static void main(String[] args) {
        HashMap<String, Integer> salary = new HashMap<>();
        salary.put("Joe Trump", 55000);
        salary.put("Donald Biden", 35000);
        salary.put("George Clinton", 25000);
        salary.put("Bill Bush", 45000);
        salary.put("John Smith", 100000);

        Map.Entry<String, Integer> maxSalary = null;
        int max = 0;
        for (Map.Entry<String, Integer> entry : salary.entrySet()
        ) {
            if (entry.getValue() > max) {
                max = entry.getValue();
                maxSalary = entry;
            }
        }
        System.out.println(maxSalary);
    }
}
