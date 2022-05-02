package com.syntax.class26;

import java.util.ArrayList;

public class CollectionsDemo1 {
    public static void main(String[] args) {
        String name="Yazgul";
        String name2="Farah";
        // Not scalable if we have to store large amount of data
        // Arrays can be good option to tackle this problem

        String [] names={"Yazgul", "Andrew"};
        // names[2]="Teyfur"; is not possible because out of bounds
        String [] names2=new String[1000];
        ArrayList<String> syntaxStudents=new ArrayList<>();
        // ArroyList=> Name of the class
        // <> diamond operator
        // String datatype
        syntaxStudents.add("Dmitriy");
        syntaxStudents.add("Mike");
        System.out.println(syntaxStudents);

    }
}
