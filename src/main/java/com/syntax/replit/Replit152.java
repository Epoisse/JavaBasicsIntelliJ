package com.syntax.replit;

public class Replit152 {

    public static void main (String []args) {
        Child child = new Child();
    }
}
class Parent {
    Parent (String city) {
        System.out.println(city);
    }

    Parent () {
        System.out.println("Parent Constructor");
    }
}
class Child extends Parent {
    public Child() {
    }

    public Child(String city) {
        super(city);
    }
}