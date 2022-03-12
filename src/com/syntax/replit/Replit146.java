package com.syntax.replit;

public class Replit146 {
    String name;
    String lastName;
    int employeeId;
    String startDate;
    int salary;

    public Replit146() {
    }

    public Replit146(String name, String lastName, int employeeId, String startDate, int salary) {
        this.name = name;
        this.lastName = lastName;
        this.employeeId = employeeId;
        this.startDate = startDate;
        this.salary = salary;
    }

    public static void main(String[] args) {
        Replit146 replit146 = new Replit146();
        System.out.println(replit146.name + " " + replit146.lastName + " " + replit146.employeeId + " " + replit146.startDate + " " + replit146.salary);
        Replit146 replit146a = new Replit146("Joe", "Smith", 12345, "01/01/1970", 35000);
        System.out.println(replit146a.name + " " + replit146a.lastName + " " + replit146a.employeeId + " " + replit146a.startDate + " " + replit146a.salary);
    }

}
/*
Complete the Employee.java class:
Include the following class variables:
name(String)
lastName(String)
employeeId(int)
startDate(String)
salary(int)
Write two constructors:
non-argument constructor
parameterized constructor that will initialize all instance variables
Create two different objects of the Employee class using both constructors and print the values of the properties inline using a print method.
Output:
null null 0 null 0
Joe Smith 12345 01/01/1970 35000
 */