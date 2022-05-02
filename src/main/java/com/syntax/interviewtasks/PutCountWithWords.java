package com.syntax.interviewtasks;

import java.util.*;

public class PutCountWithWords {

    public static List<String> countDeviceNames(List<String> deviceNames) {
        Map<String, Integer> newMap = new HashMap<>();
        for (int i = 0; i < deviceNames.size(); i++) {
            try {
                newMap.put(deviceNames.get(i), newMap.get(deviceNames.get(i)) + 1);
                deviceNames.set(i, (deviceNames.get(i) + (newMap.get(deviceNames.get(i))).toString()));
            } catch (Exception e) {
                newMap.put(deviceNames.get(i), 0);
            }
        }
        return deviceNames;
    }

    public static List<String> countDeviceNamesJohn(List<String> deviceNames) {

        Map<String, Integer> holder = new LinkedHashMap<>();
        for (int i = 0; i < deviceNames.size(); i++) {
            if (holder.containsKey(deviceNames.get(i))) {
                holder.put(deviceNames.get(i), holder.get(deviceNames.get(i)) + 1);
                StringBuilder str = new StringBuilder(deviceNames.get(i));
                str.append(holder.get(deviceNames.get(i)));
                deviceNames.set(i, str.toString());
            } else {
                holder.put(deviceNames.get(i), 0);
            }
        }
        return deviceNames;

    }

    public static void main(String[] args) {
        List<String> deviceNames = new ArrayList<>(Arrays.asList("switch", "tv", "switch", "tv", "switch", "tv", "radio"));
        System.out.println(countDeviceNames(deviceNames));
        //System.out.println(countDeviceNamesJohn(deviceNames));
    }
}

/*
* Count the number of reputations of words in an ArrayList append that count and return that list.
* You need to implement a function countDeviceNames that takes an ArrayList as an input and returns an ArrayList
input ["switch","tv","switch","tv","switch","tv"]
output [switch, tv, switch1, tv1, switch2, tv2]

In this example as word switch is repeated we pick the next entry where it is repeated and append the count i.e
* how many times that word was present previously
More Examples:
input ["switch","tv","switch","tv","switch","tv","radio"]
output [switch, tv, switch1, tv1, switch2, tv2, radio]
input ["switch","tv","switch","tv"]
output [switch, tv, switch1, tv1]

if words are not repeated we get the same output

input ["switch","tv"]
output [switch, tv]
* */