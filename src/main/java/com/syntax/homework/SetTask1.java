package com.syntax.homework;

import java.util.*;

public class SetTask1 {
    public static void main(String[] args) {
        List<String> aList = new ArrayList<>();
        aList.add("John");
        aList.add("Jane");
        aList.add("James");
        aList.add("Jasmine");
        aList.add("Jane");
        aList.add("James");
        System.out.println(aList);

        LinkedHashSet<String> aListNoDuplicates = new LinkedHashSet<>(aList);
        System.out.println(aListNoDuplicates);

        aList.clear();
        aList.addAll(aListNoDuplicates);
        System.out.println(aList);
    }
}
