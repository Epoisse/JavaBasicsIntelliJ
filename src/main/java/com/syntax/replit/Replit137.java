package com.syntax.replit;

public class Replit137 {
    private String name;
    String city;
    protected String nameOfTheSchool;
    public int batchNumber;

    public Replit137(String name, String city, String nameOfTheSchool, int batchNumber) {
        this.name = name;
        this.city = city;
        this.nameOfTheSchool = nameOfTheSchool;
        this.batchNumber = batchNumber;
    }

    void printAll() {
        System.out.println("My name is " + name + " and I live in " + city + ". I study at " + nameOfTheSchool + " in batch " + batchNumber);
    }

    public static void main(String[] args) {
        new Replit137("John", "Miami", "Syntax", 9).printAll();
    }
}
/*For you to do
In main class please declared the variables using different access modifiers that will hold value for:
name
city
name of the school
batch number
Create a method to display details in following format:
My name is ___ and I live in ___. I study at ___ in batch ___
Assign values to the variables and execute method display
Expected Output:
My name is John and I live in Miami. I study at Syntax in batch 9
*/