package com.syntax.reviewclass11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class CollectionDemo3 {
    public static void main(String[] args) {
        ArrayList<String>arrayList=new ArrayList<>();
        arrayList.add("Emilia");
        arrayList.add("Medina");
        arrayList.add("Nassir");
        arrayList.add("Teyfur");
        System.out.println(arrayList.size());
        System.out.println(arrayList.contains("Emilia"));
        Collections.sort(arrayList);
        System.out.println(arrayList);
        Collections.reverse(arrayList);
        System.out.println(arrayList);
        Collections.shuffle(arrayList);
        System.out.println(arrayList);
        System.out.println(Character.isAlphabetic('B'));
        char[]arr="Maha".toCharArray();
        System.out.println(arr[0]);
    }
}
