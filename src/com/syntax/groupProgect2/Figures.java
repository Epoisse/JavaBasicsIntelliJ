package com.syntax.groupProgect2;

import java.lang.Math.*;

interface Shape {
    double calculateArea();

    double calculatePerimeter();
}

public class Figures implements Shape {
    @Override
    public double calculateArea() {
        return 0;
    }

    @Override
    public double calculatePerimeter() {
        return 0;
    }

    public static void main(String[] args) {
        Figures[] array = {new Circle(5), new Square(2)};
        for (Figures a : array
        ) {
            System.out.println(a.calculateArea());
            System.out.println(a.calculatePerimeter());
        }
    }
}


class Circle extends Figures {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

class Square extends Figures {
    double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }

    @Override
    public double calculatePerimeter() {
        return side * 4;
    }
}