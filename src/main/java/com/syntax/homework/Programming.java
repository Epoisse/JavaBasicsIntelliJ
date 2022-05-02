package com.syntax.homework;

public class Programming {

    static void print() {
        System.out.println("I love programming languages");
    }

    static void print(String language) {
        System.out.println("I love " + language);
    }

    public static void main(String[] args) {
        Programming.print();
        Programming.print("Phyton");
    }

}
/*Create a class named 'Programming'. While creating an object of the class, if nothing is passed to it, then the message
"I love programming languages" should be printed. If some String is passed to it, then in place of "programming languages"
the value variable should be printed. Example, if we pass "Java", then "I love Java" should be printed.*/