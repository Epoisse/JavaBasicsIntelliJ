package com.syntax.class19;

public class Panda {
    String name = "Poe";
    String breed = "Red";
    String color = "Red";
    double height = 2.2;
    int age = 32;
    double weight = 23.4;

    Panda(String pandaName, String pandaBreed, String pandaColor, double pandaHeight, int pandaAge, double pandaWeight) {
        name = pandaName;
        breed = pandaBreed;
        color = pandaColor;
        height = pandaHeight;
        age = pandaAge;
        weight = pandaWeight;
    }

    Panda(String pandaName, String pandaBreed) {
        name = pandaName;
        breed = pandaBreed;
    }

    Panda(String pandaName) {
        name = pandaName;
    }

    void printInfo() {
        System.out.println(name + " " + breed + " " + color + " ");
    }
}
