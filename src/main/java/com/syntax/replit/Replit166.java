package com.syntax.replit;

public class Replit166 {
    public static void main(String[] args) {
        Animal[] array = {new Cat("Cat"), new Kitten1("Kitten1"), new Kitten2("Kitten2"), new Kitten3("Kitten3")};
        for (Animal arr : array) {
            arr.eat();
            arr.sleep();
        }
    }
}


class Animal {
    String type;

    Animal(String type) {
        this.type = type;
    }

    void eat() {
        System.out.println(type + " eats");
    }

    void sleep() {
        System.out.println(type + " sleeps a lot");

    }
}

class Cat extends Animal {
    Cat(String type) {
        super(type);
    }

    void sleep() {
        System.out.println(type + " sleeps a lot");
    }
}

class Kitten1 extends Cat {
    Kitten1(String type) {
        super(type);
    }

    void eat() {
        System.out.println(type + " eats milk");
    }
}

class Kitten2 extends Cat {
    Kitten2(String type) {
        super(type);
    }

    void eat() {
        System.out.println(type + " eats snacks");
    }
}

class Kitten3 extends Cat {
    Kitten3(String type) {
        super(type);
    }

    void eat() {
        System.out.println(type + " eats everything");
    }
}
