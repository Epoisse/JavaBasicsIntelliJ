package com.syntax.homework;

public class StudentTest {
    public static void main(String[] args) {
        Student student=new CollegeStudent("452791950");
        student.studying();
        student.lectures();

        SchoolStudent student1=new SchoolStudent("429576");
        student1.assignment();
        student1.eat();

        printAssignment(student);
    }

    public static void printAssignment (Student std) {
        std.assignment();
    }
}
