package com.syntax.class28;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IteratorDemo4 {
    public static void main(String[] args) {
        List<String> course = new LinkedList<>();
        course.add("SDLC");
        course.add("Manual Testing");
        course.add("Java");
        course.add("Git");
        course.add("Selenium");
        Iterator<String> iterator = course.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().equals("Java")) {
                iterator.remove();
            }
        }
        // When you are doing any operations on the list that
        //can change the size use Iterator otherwise you can use loops
        System.out.println(course);
    }
}
