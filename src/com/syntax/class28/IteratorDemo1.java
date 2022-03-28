package com.syntax.class28;

import java.util.LinkedList;
import java.util.List;

public class IteratorDemo1 {
    public static void main(String[] args) {
        List<String> course = new LinkedList<>();
        course.add("SDLC");
        course.add("Manual Testing");
        course.add("Java");
        course.add("Git");
        course.add("Selenium");
        /*for (int i = 0; i < course.size(); i++) {
            if (course.get(i).equals("Java")){
                course.remove("Java");
            }
            }
            works with dynamic size of an array
        */
        /*for (String courses : course
        ) {
            if (course.equals("Java")) {
                course.remove(courses);
            }
        }
        doesn't works with dynamic size of an array
        */
    }
}