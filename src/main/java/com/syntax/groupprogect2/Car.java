package com.syntax.groupprogect2;

public class Car {
    double carPrice;
    String color;

    public Car(double carPrice, String color) {
        this.carPrice = carPrice;
        this.color = color;
    }

    void displaySalePrice() {
    }

    double calculateSalePrice() {
        return carPrice;
    }
}

class Sedan extends Car {
    double length;

    public Sedan(double carPrice, String color, double length) {
        super(carPrice, color);
        this.length = length;
    }

    @Override
    void displaySalePrice() {
        System.out.println("The price with discount for " + color + " sedan with length " + length + " feet is $" + calculateSalePrice());
    }

    @Override
    double calculateSalePrice() {
        if (length > 20) return carPrice - (carPrice * 0.05);
        else return carPrice - (carPrice * 0.10);
    }
}

class Truck extends Car {
    double weight;

    public Truck(double carPrice, String color, double weight) {
        super(carPrice, color);
        this.weight = weight;
    }

    @Override
    void displaySalePrice() {
        System.out.println("The price with discount for " + color + " truck with weight " + weight + " lb is $" + calculateSalePrice());
    }

    @Override
    double calculateSalePrice() {
        if (weight > 2000) {
            return carPrice - (carPrice * 0.10);
        } else return carPrice - (carPrice * 0.20);
    }
}

class CarTester {
    public static void main(String[] args) {
        new Sedan(100000, "blue", 25).displaySalePrice();
        new Truck(100000, "red", 1400).displaySalePrice();
    }
}
