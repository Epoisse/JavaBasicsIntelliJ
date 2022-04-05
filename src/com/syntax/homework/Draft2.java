package com.syntax.homework;

import java.util.ArrayList;
import java.util.Iterator;

public class Draft2 {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("hi");
        words.add("yo");
        words.add("sup");
        words.add("yolo");
        words.add("boop");

        Iterator<String> iterator = words.iterator();
        while (iterator.hasNext()) {
           String i= iterator.next();
            iterator.next();
            iterator.remove();
            if (iterator.hasNext())
                System.out.print(iterator.next()+" ");
        }
    }
}

