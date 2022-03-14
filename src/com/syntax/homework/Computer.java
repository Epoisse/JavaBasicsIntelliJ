package com.syntax.homework;

public class Computer {
    String model;
    int ScreenSize;
    String color;
    int RAM;


    void runningPrograms () {
        System.out.println("running programs");
    }
    void connectingToInternet () {
        System.out.println("connecting to internet");
    }
    void storingFiles () {
        System.out.println("storing files");
    }

}
class Apple extends Computer {
    @Override
    void runningPrograms() {
        super.runningPrograms();
        System.out.println("running programs only for MacOS");
    }
}
class Lenovo extends Computer {
    @Override
    void connectingToInternet() {
        super.connectingToInternet();
        System.out.println("connecting to internet through sim card");
    }
}
class HP extends Computer {
    @Override
    void storingFiles() {
        super.storingFiles();
        System.out.println("storing files on disk C");
    }
}
class Dell extends Computer {
    void unlockingTouchID () {
        System.out.println("unlocking through Touch ID");
    }
}