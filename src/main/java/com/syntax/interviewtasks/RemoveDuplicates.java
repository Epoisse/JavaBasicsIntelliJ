package com.syntax.interviewtasks;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class RemoveDuplicates {

    public static void main(String[] args) {
        String input = "aabbccaddda";
        System.out.println(removeConsecutiveDuplicates3(input));
    }

    public static String removeConsecutiveDuplicates(String input) {
        int j = 0;
        String noDup = "";
        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(j) != input.charAt(i)) {
                noDup += input.charAt(i);
            }
            j++;
        }
        return noDup;
    }

    public static String removeConsecutiveDuplicates2(String input) {
        if (input.length() <= 1)
            return input;
        if (input.charAt(0) == input.charAt(1))
            return removeConsecutiveDuplicates2(input.substring(1));
        else
            return input.charAt(0) + removeConsecutiveDuplicates2(input.substring(1));
    }
    public static String removeConsecutiveDuplicates3(String input) {
        char[] chars = input.toCharArray();
        int n=chars.length, j=0;
        for(int i=0;i<n;i++){
            if(chars[j]!=chars[i]){
                j++;
                chars[j]=chars[i];
            }
        }
        input=String.valueOf(Arrays.copyOfRange(chars,0,j+1));
        return input;
    }
}
/*
* Remove Consecutive duplicates Write the logic to remove only consecutive duplicates
input ["aabbcde"]-> output["abcde"]
input ["aabbcc"]-> output["abc"]
input ["aabbcca"]-> output["abca"]
input ["aabbccaddda"]-> output["abcada"]
* */