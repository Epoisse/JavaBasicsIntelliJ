package com.syntax.homework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

public class Main {
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
                newList.add(deviceNames.get(i) + (newMap.get(deviceNames.get(i))-1));
            } catch (Exception e) {
                newMap.put(deviceNames.get(i), 1);
                newList.add(deviceNames.get(i));
            }
        }
        return newList;
    }

}
/*Count the number of repetations of words in an ArrayList append that count and return that list.
You need to implent a function countDeviceNames that takes an ArrayList as an input and returns an ArrayList

input ["switch","tv","switch","tv","switch","tv"]
output [switch, tv, switch1, tv1, switch2, tv2]

In this example as word switch is repeated we pick the next entry where it is repeated and append the count i.e
how many times that word was present previously

More Exmaples
input ["switch","tv","switch","tv","switch","tv","radio"]
output [switch, tv, switch1, tv1, switch2, tv2, radio]
input ["switch","tv","switch","tv"]
output [switch, tv, switch1, tv1]

if words are not repeated we get the same output
input ["switch","tv"]
output [switch, tv]*/