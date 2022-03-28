package com.syntax.class28;

import java.util.ArrayList;
import java.util.Iterator;

public class Task1 {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();
        cars.add("BMW");
        cars.add("Mercedes");
        cars.add("Linkoln");

        System.out.println(cars);

        for (String car :
                cars) {
            System.out.println(car);
        }

        for (int i = 0; i < cars.size(); i++) {
            System.out.print(cars.get(i) + " ");
        }

        Iterator<String >iterator=cars.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
