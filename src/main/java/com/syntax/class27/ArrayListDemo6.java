package com.syntax.class27;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListDemo6 {
    public static void main(String[] args) {
        List<String> groceries= Arrays.asList("Apple","Orange","Banana" );
        System.out.println(groceries);

        ArrayList<String> list2=new ArrayList<>();
        list2.add("Apple");
        list2.add("Onion");
        // list2.add("Pillow");

        System.out.println(groceries.containsAll(list2)); // return boolean if all items are present in the list
    }
}
