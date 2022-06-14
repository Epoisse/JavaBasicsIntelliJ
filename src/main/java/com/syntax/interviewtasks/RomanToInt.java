package com.syntax.interviewtasks;

import java.util.LinkedHashMap;
import java.util.Map;

public class RomanToInt {
    public static int romanToInt(String s) {
        LinkedHashMap<String, String> roman = new LinkedHashMap<>();
        roman.put("IV", "4.");
        roman.put("IX", "9.");
        roman.put("XL", "40.");
        roman.put("XC", "90.");
        roman.put("CD", "400.");
        roman.put("CM", "900.");
        roman.put("I", "1.");
        roman.put("V", "5.");
        roman.put("X", "10.");
        roman.put("L", "50.");
        roman.put("C", "100.");
        roman.put("D", "500.");
        roman.put("M", "1000.");



        for (Map.Entry<String, String> entry:roman.entrySet()
        ) {
            if (s.contains(entry.getKey())){
                s=s.replaceAll(entry.getKey(), entry.getValue());
            }
        }
        int result=0;
        String[] split = s.split("\\.");
        for (String value : split) {
            result = result + Integer.parseInt(value);
        }

        return result;
    }


    public static void main(String[] args) {
        String str = "abcabcbb";
        //System.out.println(str.indexOf("a",1));
        //System.out.println(romanToInt("MCMXCIV"));
        romanToInt("MCMXCIV");
    }
}
