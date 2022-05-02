package com.syntax.reviewclass12;

import java.util.ArrayList;

public class CollectionDemo3 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        for (int i = 0; i < 1000000; i++) {
            names.add("aasfj;ljfa;sjf;dja;w");
        }
        long startTime=System.currentTimeMillis();
        long count = names.stream().filter(x -> x.length() > 5).count();
        long endTime=System.currentTimeMillis();
        System.out.println(endTime-startTime);
        long startTime1=System.currentTimeMillis();
        long count1 = names.parallelStream().filter(x -> x.length() > 5).count();
        long endTime1=System.currentTimeMillis();
        System.out.println(endTime1-startTime1);
    }
}
