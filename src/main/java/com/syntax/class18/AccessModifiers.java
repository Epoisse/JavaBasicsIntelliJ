package com.syntax.class18;

public class AccessModifiers {
    private String name; // can only be accessed within that class
    int age; //default access can only be accessed from the same package
    protected double weight; //can be accessed from other packages but only in the classes that participate in inheritance
    public String color; //can be accessed from anywhere inside that project

    public static void main(String[] args) {
        AccessModifiers am=new AccessModifiers();
        System.out.println(am.name);
        System.out.println(am.age);
        System.out.println(am.weight);
        System.out.println(am.color);
    }
}
