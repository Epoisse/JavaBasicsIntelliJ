package com.syntax.class19;

public class Student {
   private String name;
   private int history;
   private int java;
   private int math;

    Student (String stName, int grHistory, int grJava, int grMath) {
        name=stName;
        history=grHistory;
        java=grJava;
        math=grMath;
    }
    public void avarage () {
        System.out.println(name+" avarage grade is "+(history+java+math)/3);
    }
}
