package com.syntax.class30;

import java.util.Map;
import java.util.TreeMap;

public class Task4 {
    public static void main(String[] args) {
        TreeMap<String, Person> personTreeMap=new TreeMap<>();
        personTreeMap.put("124332", new Person("John", "Smith", 23, 1344444));
        personTreeMap.put("243444", new Person("Donald", "Baiden", 23, 1334444));
        personTreeMap.put("123332", new Person("Joe", "Trump", 23, 134444));
        personTreeMap.put("425425", new Person("Viktor", "Corado", 23, 13444444));

        for (Map.Entry<String , Person> p:personTreeMap.entrySet()
             ) {
            System.out.println(p);
        }

    }
}
class Person {
   private String name;
   private String lastName;
   private int age;
   private double salary;

    public Person(String name, String lastName, int age, double salary) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}