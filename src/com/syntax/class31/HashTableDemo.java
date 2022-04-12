package com.syntax.class31;

import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class HashTableDemo {
    public static void main(String[] args) {
        Hashtable<String, String> students=new Hashtable<>();
        students.put("1", "Moreed(Run Moreed)");
        students.put("2", "soaihfgj");
        students.put("3", "jsal;kdfal");
        students.put("4", "sdgd");
        students.put("5", "Gulden(Flower Pot)");

        Set<Map.Entry<String, String>> entrySet=students.entrySet();
        for (Map.Entry<String, String> entry:
             entrySet) {
            System.out.println(entry);
        }
    }
}
