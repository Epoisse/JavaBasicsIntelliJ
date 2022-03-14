package com.syntax.class24;

public class ToStringDemo {
    String name;
    int age;
    ToStringDemo (String name, int age) {
        this.name=name;
        this.age=age;
    }

    @Override
    public String toString() {
        return "Mr will show the face";
    }

    public static void main(String[] args) {
        ToStringDemo toStringDemo=new ToStringDemo("mr.A", 10);
        System.out.println(toStringDemo.toString());


    }
}
