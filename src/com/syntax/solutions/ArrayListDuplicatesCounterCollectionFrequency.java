package com.syntax.solutions;

import java.util.*;

public class ArrayListDuplicatesCounterCollectionFrequency {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("switch", "tv", "switch", "tv", "switch", "tv"));
        countDeviceNames(list);
    }

    public static void countDeviceNames(List<String> deviceNames) {
        Set<String> unique = new HashSet<>(deviceNames);
        for (String u :
                unique) {
            System.out.println(u + " : " + Collections.frequency(deviceNames, u));
        }

    }
}
