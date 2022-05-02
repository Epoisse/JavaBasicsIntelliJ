package com.syntax.interviewtasks;

import java.util.List;

public class FindTheLargestEvenLengthString {
    public static void main(String[] args) {
        String input = "I was";
        System.out.println(findMaxLenEven(input));
    }

    public static String findMaxLenEven(String str) {
        String maxLen = "-1";

        String[] array = str.split(" ");
        for (String s :
                array) {
            if (s.length() > maxLen.length() && s.length() % 2 == 0) {
                maxLen = s;
            }
        }
        return maxLen;
    }
}
/*
*Find the largest even length word from a String
* if there are two words with same largest even length return the first one.
* if there are not even words return -1
input ["find MaxLen Even"]
output ["MaxLen"]
input["I am very Good at Java"]
output ["very"]
input["I was"]
output ["-1"]
* */