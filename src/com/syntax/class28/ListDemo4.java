package com.syntax.class28;

import java.util.LinkedList;

public class ListDemo4 {
    public static void main(String[] args) {
        Student teyfur=new Student("Tefur", 12, "Memes");
        Student gulden=new Student("Gulden", 12, "Study");
        Student emilia=new Student("Emilia", 12, "Complaining");
        LinkedList<Student>studentLinkedList=new LinkedList<>();
        studentLinkedList.add(teyfur);
        studentLinkedList.add(gulden);
        studentLinkedList.add(emilia);
        System.out.println(studentLinkedList.toString());
    }

}
class Student {
    public Student(String name, int age, String hobbies) {
        this.name = name;
        this.age = age;
        this.hobbies = hobbies;
    }

    String name;
    int age;
    String hobbies;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", hobbies='" + hobbies + '\'' +
                '}';
    }
}
