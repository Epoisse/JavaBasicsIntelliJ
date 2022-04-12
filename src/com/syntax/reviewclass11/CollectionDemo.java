package com.syntax.reviewclass11;

import com.syntax.class27.ArraysListDemo5;
import com.syntax.util.ArrayUtil;

import java.util.ArrayList;
import java.util.Arrays;

public class CollectionDemo {
    public static void main(String[] args) {
        String [] names=new String[100];
        names[0]="Maha";
        System.out.println(Arrays.toString(names));

        ArrayList<String> arrayList= ArrayUtil.toArrayList(names);
        System.out.println(arrayList);
    }
}
