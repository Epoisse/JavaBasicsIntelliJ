package com.syntax.groupProgect2;

public class MarksAvg {
    public static void main(String[] args) {
        Students[] students = {new StudentA("Joe", "Trump", 23, 32, 45),
                new StudentB("Donald", "Baiden", 33, 22, 11, 54)};

        // for each loop to implement all methods for each object
        for (Students s : students
        ) {
            System.out.println("Average grade for student " + s.name + " " + s.lastName + " is " + String.format("%.2f", s.getPercentage()));
        }
    }
}

abstract class Marks {
    abstract double getPercentage();
}

class Students extends Marks {
    String name;
    String lastName;
    double math;
    double history;
    double coding;

    // Constructor to assign values for the class attributes
    public Students(String name, String lastName, double math, double history, double coding) {
        this.name = name;
        this.lastName = lastName;
        this.math = math;
        this.history = history;
        this.coding = coding;
    }

    @Override
    double getPercentage() {
        return 0;
    }
}

class StudentA extends Students {

    // Matching the constructor from Parent class
    public StudentA(String name, String lastName, double math, double history, double coding) {
        super(name, lastName, math, history, coding);
    }

    @Override
    double getPercentage() {
        return (math + history + coding) / 3;
    }
}

class StudentB extends Students {
    double chemistry;

    // Matching the constructor from Parent class
    public StudentB(String name, String lastName, double math, double history, double coding, double chemistry) {
        super(name, lastName, math, history, coding);
        this.chemistry = chemistry;
    }

    @Override
    double getPercentage() {
        return (math + history + coding + chemistry) / 4;
    }
}
/*
class StudentA extends Marks{
    StudentA(double...marks){
    this.marks=marks;
}
    @Override
    double getPercentage() {
    double sum = 0;
    for(double x:marks){
        sum+=x;
    }
    double Percentage=sum/marks.length;
        return Percentage;
 */