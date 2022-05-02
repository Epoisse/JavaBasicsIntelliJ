package com.syntax.class21;

public class ClassAA {
    String name;
    int age;
    double weight;

    public ClassAA(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    void printInfo() {
        System.out.println(name + " " + age + " " + weight);
    }
}

class ClassBB extends ClassAA {
    public ClassBB(String name, int age, double weight) {
        super(name, age, weight);
        // because constructor from the parent class don't participate in inheritance
        // we need to create a matching constructor in the child classes as well
        // we can use super() to call the constructor from the patent class so that we don't have to repeat the code
    }
}

class Test {

    public static void main(String[] args) {
        ClassBB classBB=new ClassBB("Tristan", 25, 91);
        classBB.printInfo();
    }

}
