package com.syntax.homework;

import java.util.LinkedHashSet;

public class SetTask3 {
    public static void main(String[] args) {
        LinkedHashSet<String> cities = new LinkedHashSet<>();
        cities.add("Toronto");
        cities.add("Ottawa");
        cities.add("Portland");
        cities.add("Acapulco");
        cities.add("Jersey City");
        cities.add("Washington DC");
        cities.add("Mexico City");
        cities.add("Amsterdam");

        System.out.println(cities);

        cities.removeIf(s -> s.toLowerCase().startsWith("a"));

        System.out.println(cities);
    }
}
