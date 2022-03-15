package com.syntax.homework;

public class StudentTest {
    public static void main(String[] args) {
        Student student=new CollegeStudent();
        student.studying();
        student.lectures();

        SchoolStudent student1=new SchoolStudent();
        student1.assignment();
        student1.eat();

        printAssignment(student);
    }

    public static void printAssignment (Student std) {
        std.assignment();
    }
}
