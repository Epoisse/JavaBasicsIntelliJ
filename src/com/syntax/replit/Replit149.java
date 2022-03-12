package com.syntax.replit;

public class Replit149 {
    public static void main(String[] args) {
        B b = new B();
        b.printA();
        b.printB();
    }
}

class A {
    public void printA() {
        System.out.println("Class A");
    }
}

class B extends A {
    public void printB() {
        System.out.println("Class B");
    }
}
/*
Create Three classes (Main, A, B):
Have a method that prints out the following
For A: "Class A"
For B: "Class B"
Make B extend A
From your Main class create an object of the B class and call the methods.
Output:
Class A
Class B
 */