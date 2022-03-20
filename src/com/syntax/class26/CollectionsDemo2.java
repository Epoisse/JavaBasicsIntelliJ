package com.syntax.class26;

import java.util.ArrayList;

public class CollectionsDemo2  {
    public static void main(String[] args) {
        ArrayList<String> countries=new ArrayList<>();
        countries.add("USA");
        countries.add("Turkey");
        countries.add("Morocco");
        countries.add("Gana");

        System.out.println(countries.get(3));
        System.out.println(countries.get(2));
        System.out.println(countries);
        countries.add(3,"Pakistan"); // inserts the elements at this specified index
        System.out.println(countries);
        System.out.println(countries.size());
        countries.remove("Pakistan");
        System.out.println(countries);
        countries.clear();
        System.out.println(countries);
    }
}
