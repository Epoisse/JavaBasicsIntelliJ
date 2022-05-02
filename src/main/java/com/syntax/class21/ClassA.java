package com.syntax.class21;

public class ClassA {
    void method() {
        System.out.println("method from Class A");
    }
}

class ClassB extends ClassA {
    void method() {
        System.out.println("method from Class B");
    }
    void test() {
        method(); // call the same class method
        this.method(); // call the same class method
        super.method(); // calls the parent class method
    }
}

class Tester {
    public static void main(String[] args) {
        ClassB classB = new ClassB();
        classB.method();
        classB.test();
    }
}
