package com.syntax.replit;

public class Replit145 {
    String dogName;
    double dogWeight;
    static String dogBreed = "Mutt";

    public Replit145(String dogName, double dogWeight) {
        this.dogName = dogName;
        this.dogWeight = dogWeight;
    }

    public static void main(String[] args) {
        Replit145 replit145 = new Replit145("Tarzan", 50);
        System.out.println(replit145.dogName +" "+ Replit145.dogBreed +" "+ replit145.dogWeight);
        Replit145 replit145a = new Replit145("Lucy", 10);
        System.out.println(replit145a.dogName +" "+ Replit145.dogBreed +" "+ replit145a.dogWeight);
    }
}
/*
Complete the Dog.java class:
Create following class variables.
dogName
dogWeight
static dogBreed=Mutt;
For all methods and variables use proper naming convention.
Create constructor to initialize instance variables
In Main class Create 2 Objets of a Dog class and using each object reference variable print details of objects.
Expected Output:
Tarzan Mutt 50.0
Lucy Mutt 10.0
 */