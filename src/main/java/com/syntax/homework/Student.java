package com.syntax.homework;

public class Student {
    String studentID;

    public Student(String studentID) {
        this.studentID = studentID;
    }

    void lectures() {
        System.out.println("Student participates in lectures");
    }

    void assignment() {
        System.out.println("Student gets assignment");
    }

    void studying() {
        System.out.println("Student studies");
    }

}

class SyntaxStudent extends Student {
    public SyntaxStudent(String studentID) {
        super(studentID);
    }

    @Override
    void assignment() {
        System.out.println("Syntax student don't have time to sleep because of amount of assignment");
    }

    @Override
    void studying() {
        System.out.println("Syntax student studies online");
    }

    void learning() {
        System.out.println("Syntax student learns Java");
    }
}

class CollegeStudent extends Student {
    public CollegeStudent(String studentID) {
        super(studentID);
    }

    @Override
    void assignment() {
        System.out.println("College student has match more assignment than School student");
    }

    @Override
    void lectures() {
        System.out.println("College student visits lectures in Campus");
    }

    void payment() {
        System.out.println("College student pays too much");
    }
}

class SchoolStudent extends Student {
    public SchoolStudent(String studentID) {
        super(studentID);
    }

    @Override
    void assignment() {
        System.out.println("School student doesn't get assignment until 5 grade");
    }

    void eat() {
        System.out.println("School student has lunch in the School");
    }
}