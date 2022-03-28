package com.syntax.class28;

import java.util.ArrayList;

public class Task3 {
    public static void main(String[] args) {
        ArrayList<String> drinks=new ArrayList<>();
        drinks.add("beer");
        drinks.add("water");
        drinks.add("whiskey");
        drinks.add("tequila");

        System.out.println(drinks);
        for (int i = 0; i < drinks.size(); i++) {
            if (drinks.get(i).contains("a") || drinks.get(i).contains("e")) {
                drinks.set(i, "Water");
            }
        }
        System.out.println(drinks);
    }
}
