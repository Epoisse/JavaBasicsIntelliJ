package com.syntax.class27;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;

public class Task1 {
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<>();
        names.add("Mykola");
        names.add("Tetiana");
        names.add("Oleksandr");
        names.add("Volodymir");
        names.add("Taras");

        System.out.println(names.isEmpty());
        System.out.println(names.contains("Tetiana"));
        System.out.println(names.size());
        System.out.println(names);
    }
}
/*
Create an ArrayList that will store 5 names into it.
Find out whether the given ArrayList is empty or not?
Check whether the specific name is present in an ArrayList or not?
Find the size of your arrayList and print all values from that
 */