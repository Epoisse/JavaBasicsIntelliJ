package com.syntax.groupProgect2;

// Parent class for all types of figures
public class Figures implements Shape {

    public static void main(String[] args) {
        Figures[] array = {new Circle(5), new Square(2)};
        for (Figures a : array
        ) {
            System.out.println(a.calculateArea());
            System.out.printf("%.2f%n", a.calculatePerimeter());
        }
    }

    // Method returns String with remark and result of calculation
    @Override
    public String calculateArea() {
        return "";
    }

    // Method returns just raw double number as result of calculation
    @Override
    public double calculatePerimeter() {
        return 0;
    }
}

// The class inherits from Figures class and override methods
class Circle extends Figures {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public String calculateArea() {
        return "Area of a circle with radius " + radius + " is equal " + Math.PI * radius * radius;

    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

// The class inherits from Figures class and override methods
class Square extends Figures {
    double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public String calculateArea() {
        return "Area of a circle with side " + side + " is equal " + side * side;
    }

    @Override
    public double calculatePerimeter() {
        return side * 4;
    }
}

interface Shape {
    String calculateArea();

    double calculatePerimeter();
}
