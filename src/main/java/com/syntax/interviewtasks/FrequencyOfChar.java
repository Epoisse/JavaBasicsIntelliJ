package com.syntax.interviewtasks;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfChar {

    public static int getFrequency(String input, char ch) {
        int counter = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == ch) {
                counter++;
            }
        }
        return counter;
    }

    public static int getFrequency2(String input, char query) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < input.length(); i++) {
                if (map.containsKey(input.charAt(i))) {
                    map.put(input.charAt(i), map.get(input.charAt(i))+1);
                } else {
                map.put(input.charAt(i), 1);
            }
        }
        return map.get(query);
    }

    public static int getFrequency3(String input, char query) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < input.length(); i++) {
            try {
                map.get(input.charAt(i));
                map.put(input.charAt(i),map.get(input.charAt(i))+1);
            } catch (NullPointerException e) {
                map.put(input.charAt(i), 1);
            }
        }
        return map.get(query);
    }

    public static int getFrequency4(String input, char query) {
            return input.replaceAll("[^"+query+"]", "").length();
    }

    public static void main(String[] args) {
        System.out.println(getFrequency4("somerandomword", 'r'));
    }
}
