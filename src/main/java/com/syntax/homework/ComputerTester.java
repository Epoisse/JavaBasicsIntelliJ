package com.syntax.homework;

public class ComputerTester {
    public static void main(String[] args) {
        Computer computers[] = {new Apple("macbook", 14), new Lenovo(), new HP(), new Dell()};
        for (Computer comps : computers
        ) {
            comps.runningPrograms();
        }
        new Lenovo().assigningVar("Have no idea", 19);
        System.out.println(new Lenovo().toString());
    }
}
