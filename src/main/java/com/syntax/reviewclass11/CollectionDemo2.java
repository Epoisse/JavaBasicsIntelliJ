package com.syntax.reviewclass11;

import java.util.ArrayList;
import java.util.Objects;

public class CollectionDemo2 {
    public static void main(String[] args) {
        ArrayList<String> fruit=new ArrayList<>();
        fruit.add("Apple");
        fruit.add("Orange");
        fruit.add("Mango");

        fruit.remove("Mango");
        System.out.println(fruit);
        ArrayList<Fruit>f=new ArrayList<>();
        f.add(new Fruit("Apple"));
        f.add(new Fruit("Orange"));
        f.add(new Fruit("Mango"));
        f.remove(new Fruit("Mango"));
        System.out.println(f.toString());
        System.out.println(new Fruit("Mango"));
    }
}
class Fruit{
    String name;
    Fruit(String name){
        this.name=name;
    }

    //instead of checking the address of objects we check if the fruit name
    //is same or not if it is same we consider the object also the same

    /*
    equals method when we overwrite it we can check for the equality of two
    objects based on the fields of that class instead of addresses
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fruit fruit = (Fruit) o;
        return Objects.equals(name, fruit.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    //by default toString method from the Object class used to print out and Object, but it only prints the addresses
    //of objects if we want to printout the actual fields of a class we override the toString method
    @Override
    public String toString() {
        return "Fruit{" +
                "name='" + name + '\'' +
                '}';
    }
}