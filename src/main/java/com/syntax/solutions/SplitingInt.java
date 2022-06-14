package com.syntax.solutions;

import java.util.ArrayList;
import java.util.List;

public class SplitingInt {
    public static void main(String[] args) {

        int n=12443241;
        List<Integer> digits = new ArrayList<Integer>();
        while (n > 0) {
            digits.add(n%10);
            n/=10;
        }
        System.out.println(digits.toString());
    }
}
