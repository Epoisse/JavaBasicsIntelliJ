package com.syntax.homework;

import java.util.HashSet;
import java.util.Iterator;

public class SetTask4 {
    public static void main(String[] args) {
        HashSet<StudentSetTask> studentSetTasks = new HashSet<>();
        studentSetTasks.add(new StudentSetTask("Joe", "2947"));
        studentSetTasks.add(new StudentSetTask("Irina", "2984"));
        studentSetTasks.add(new StudentSetTask("Vlad", "23384"));
        studentSetTasks.add(new StudentSetTask("Oleg", "2933484"));
        studentSetTasks.add(new StudentSetTask("Christian", "298424524"));
        studentSetTasks.add(new StudentSetTask("Chris", "2984435"));
        studentSetTasks.add(new StudentSetTask("John", "298435"));

        for (StudentSetTask studentSetTask : studentSetTasks) {
            System.out.println(studentSetTask.name);
        }
    }
}

class StudentSetTask {
    String name;
    String id;

    public StudentSetTask(String name, String id) {
        this.name = name;
        this.id = id;
    }
}