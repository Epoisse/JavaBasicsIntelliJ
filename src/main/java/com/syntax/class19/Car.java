package com.syntax.class19;

public class Car {
    String name;
    String make;
    String color;
    String type;

    Car(String name, String make, String color, String type) {
        /*
        If we have same local and instance variables java
        always prefer local variables if you want to in
        instruc java to use instance variables we use the "this" keyword
         */

        this.name = name;
        this.make = make;
        this.color = color;
        this.type = type;
    }

}
