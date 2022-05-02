package com.syntax.class28;

import java.util.LinkedList;
import java.util.List;

public class ListDemo2 {
    public static void main(String[] args) {
        List<String> course =new LinkedList<>();
        course.add("SDLC");
        course.add("Manual Testing");
        course.add("Java");
        course.add("Git");
        course.add("Selenium");
        for (int i = 0; i < course.size(); i++) {
            if (course.get(i).equals("Java")) {
                course.set(i,"Happy");
            } // replace loop
        }
    }
}
