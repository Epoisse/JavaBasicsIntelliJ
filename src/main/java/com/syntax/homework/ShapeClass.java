package com.syntax.homework;

public class ShapeClass {
    static int radius;

    public ShapeClass(int radius) {
        this.radius = radius;
    }
}

class CircleClass extends ShapeClass {
    public CircleClass(int radius) {
        super(radius);
    }
    public void circleArea () {
        System.out.println((radius*=radius)*3.14159265);
    }

    public static void main(String[] args) {
        new CircleClass(3).circleArea();
    }

}

/*Write program: Shape class has a constructor that takes the radius and has a subclass as circle class.
In circle class create a method to calculate the area of circle. Test your code
 */