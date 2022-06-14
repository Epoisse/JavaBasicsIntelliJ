package com.syntax.interviewtasks;

import java.util.HashMap;
import java.util.Map;

public class MaxCharCount {
    @Override
    public String toString() {
        return super.toString();
    }

    public static int countMaxChar(String str){
        int max=0;
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            try {
                map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
            } catch (NullPointerException e) {
                map.put(str.charAt(i), 1);
            }
        }
/*        List<Integer> values= new ArrayList<>(map.values());
        System.out.println(map.toString());
        System.out.println(values.toString());
        for (Integer val :
                values) {
            if (val > max) {
                max=val;
            }
        } return max;*/
        for (Map.Entry entry :
                map.entrySet()) {
            int value=(int) entry.getValue();
            if (value > max) {
                max=value;
            }
        } return max;
    }

    public static void main(String[] args) {
        String str = "abscaaaaabdddd";
        System.out.println(countMaxChar(str));
    }
}
