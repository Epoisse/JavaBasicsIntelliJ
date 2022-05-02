package com.syntax.replit;

public class Replit150 {
    String name;
    static String lastName = "Smith";
    int age;

    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.name = "Joe";
        employee.age = 35;
        employee.salary = 35000;
        employee.printEmployeeProperties();

        Student student = new Student();
        student.name = "Adam";
        student.age = 15;
        student.grade = 10;
        student.printStudentProperties();

        Retiree retiree = new Retiree();
        retiree.name = "Frank";
        retiree.age = 15;
        retiree.seniorActivity = "tour";
        retiree.printSeniorProperties();
    }
}

class Employee extends Replit150 {
    int salary;

    public void printEmployeeProperties() {
        System.out.println(name + " " + lastName + " " + age + " " + salary);
    }
}

class Student extends Employee {
    int grade;

    public void printStudentProperties() {
        System.out.println(name + " " + lastName + " " + age + " " + grade);
    }
}

class Retiree extends Student {
    String seniorActivity;

    public void printSeniorProperties() {
        System.out.println(name + " " + lastName + " " + age + " " + seniorActivity);
    }
}
/*
Create four classes (Person, Employee, Student, Retiree)
Have properties
For Person: name(String)
For Person: lastName(String)
For Person: age(int)
For Employee: salary(int)
For Student: grade(int)
For Retiree: seniorActivity(String)
At Employee, Student, Retiree Class have a print method in each that prints the properties in line as shown in the output
Create multilevel inheritance: Person --> Employee --> Student --> Retiree
From your Main class create objects of the Employee, Student and Retiree classes and call the print method.
Expected Output:
Joe Smith 35 35000
Adam Smith 15 10
Frank Smith 15 tour
 */