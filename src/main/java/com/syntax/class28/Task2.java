package com.syntax.class28;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;

public class Task2 {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("one");
        words.add("two");
        words.add("tree");
        words.add("four");

        System.out.println(words);
        // 1
        Iterator<String> iterator = words.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().toLowerCase().endsWith("e")) {
                iterator.remove();
            }
        }
        System.out.println(words);

        // 2
        System.out.println(words);
        words.removeIf(s -> s.toLowerCase().endsWith("e"));
        System.out.println(words);

        /* WRONG!
        System.out.println(words);
        for (int i = 0; i < words.size(); i++) {
            if (words.get(i).endsWith("e")) {
                words.remove(i);
            }
        }
        System.out.println(words);
        */
    }
}
