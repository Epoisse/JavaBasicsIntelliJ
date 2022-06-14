package com.syntax.interviewtasks;

public class ReverseNumber {
    public static int reverseInteger(int N) {
        String intToStr = "" + N;
        String reverse = "";
        for (int i = intToStr.length() - 1; i >= 0; i--) {
            reverse += intToStr.charAt(i);
        }
        return N = Integer.parseInt(reverse);
    }

    public static int reverseInteger2(int N) {
        int reverse=0;
        while(N!=0) {
            int remainder=N%10;
            reverse=reverse*10+remainder;
            N=N/10;
        }
        return reverse;
    }


    public static void main(String[] args) {
        int a = 12345;
        System.out.println(reverseInteger2(a));
    }
}

/*
* Reverse the number

Input[123] ->output [321]

Input[12345] ->output [54321]

Input[1001] ->output [1001]

Input[789] ->output [987]
* */
