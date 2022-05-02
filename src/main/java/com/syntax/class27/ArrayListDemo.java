package com.syntax.class27;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Double> numberList=new ArrayList<>();
        Double double1=new Double(10.4);
        double1.toString();
        double number=double1.doubleValue(); // unboxing
        Double number2=new Double(number); // boxing
        double number3=10.3;
        Double number4=number3; // same as Double double1=new Double(10.4); autoboxing
        number3=number4; // autoUnboxing
    }
}

