package com.syntax.homework;

import java.sql.SQLOutput;

public class Computer {
    String model;
    int screenSize;
    String color;
    int RAM;


    void runningPrograms() {
        System.out.println("running programs");
    }

    void connectingToInternet() {
        System.out.println("connecting to internet");
    }

    void storingFiles() {
        System.out.println("storing files");
    }

}

class Apple extends Computer {
    public Apple(String model, int screenSize) {
        this.model = model;
        this.screenSize = screenSize;
    }

    @Override
    void storingFiles() {
        System.out.println("storing files on Macintosh HD");
    }

    @Override
    void runningPrograms() {
        System.out.println("running programs only for MacOS");
    }
}

class Lenovo extends Computer {
    @Override
    void connectingToInternet() {
        System.out.println("connecting to internet through sim card");
    }

    void assigningVar(String model, int screenSize) {
        this.model = model;
        this.screenSize = screenSize;
    }

    @Override
    public String toString() {
        return "Lenovo{" +
                "model='" + model + '\'' +
                ", screenSize=" + screenSize +
                ", color='" + color + '\'' +
                ", RAM=" + RAM +
                '}';
    }
}

class HP extends Computer {
    @Override
    void storingFiles() {
        System.out.println("storing files on disk C");
    }
}

class Dell extends Computer {
    @Override
    void runningPrograms() {
        System.out.println("running programs in very slow manner");
    }

    void unlockingTouchID() {
        System.out.println("unlocking through Touch ID");
    }
}
/*
Create a Class Computer that will have 4 subclasses as Apple, Lenovo, HP, Dell.
Define common behavior within and some fields in parent class and override some of the methods in child classes
Define some methods specific to child classes
Create objects of child classes and store them into array. Loop through each object and execute available methods.
 */