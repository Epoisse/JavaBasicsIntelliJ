package com.syntax.class27;

import java.util.ArrayList;

public class ArrayListDemo2 {
    public static void main(String[] args) {
        ArrayList<Double>number=new ArrayList<>();
        number.add(10.4);
        number.add(104.4);
        number.add(1044.4);
        number.add(102.4);
        System.out.println(number.get(2));
        number.remove(2);
        System.out.println(number);
        System.out.println(number.size());
        for (Double a :
                number) {
            System.out.println(a);
        }
    }
}
