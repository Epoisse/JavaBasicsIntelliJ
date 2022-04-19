package com.syntax.solutions;

import java.util.*;

public class ListDupCounterWithMap {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("switch", "tv", "switch", "tv", "switch", "tv", "radio"));
        System.out.println(countDeviceNames(list));
    }

    public static List<String> countDeviceNames(List<String> deviceNames) {
        Map<String, Integer> newMap = new LinkedHashMap<>();
        List<String> newList = new ArrayList<>();
        for (int i = 0; i < deviceNames.size(); i++) {
            try {
                newMap.put(deviceNames.get(i), newMap.get(deviceNames.get(i)) + 1);
                newList.add(deviceNames.get(i) + (newMap.get(deviceNames.get(i)) - 1));
            } catch (Exception e) {
                newMap.put(deviceNames.get(i), 1);
                newList.add(deviceNames.get(i));
            }
        }
        return newList;
    }
}