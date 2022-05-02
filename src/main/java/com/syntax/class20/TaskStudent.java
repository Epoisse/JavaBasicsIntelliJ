package com.syntax.class20;

public class TaskStudent {
    String name;
    String address;

    TaskStudent (String name, String address) {
        this.name=name;
        this.address=address;
    }

    void displayInfo () {
        System.out.println(name+" from "+address);
    }

    public static void main(String[] args) {
        TaskStudent taskStudent=new TaskStudent("John", "New York");
        taskStudent.displayInfo();
        new TaskStudent("Lilly", "Montana").displayInfo();

    }
}

