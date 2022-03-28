package com.syntax.class27;

import java.util.ArrayList;

public class ArrayListDemo4 {
    public static void main(String[] args) {
        ArrayList<String> fruits=new ArrayList<>();
       fruits.add("Apple");
       fruits.add("Orange");
       fruits.add("Banana");

        ArrayList<String> vegitables=new ArrayList<>();
        vegitables.add("Potato");
        vegitables.add("Tomato");
        vegitables.add("Carrot");

        ArrayList<String> groceries=new ArrayList<>();
        groceries.addAll(vegitables);
        groceries.addAll(fruits);
        System.out.println(groceries);

        ArrayList<String> itemsToBeRemoved=new ArrayList<>();
        itemsToBeRemoved.add("Apple");
        itemsToBeRemoved.add("Onion");

        groceries.removeAll(itemsToBeRemoved);
        System.out.println(groceries);
    }
}
