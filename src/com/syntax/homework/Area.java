package com.syntax.homework;

public class Area {
    static void area(int length, int width) {
        System.out.println("Rectangle area with length "+length+" and width "+width+" is "+length*width);
    }
    static void area(int side) {
        System.out.println("Square area with side "+side+" is "+(side*=side));
    }
    static void area(int length, int width, int height) {
        System.out.println("Box volume with length "+length+" and width "+width+" and height "+height+" is "+length*width*height);
    }

    public static void main(String[] args) {
        Area.area(5,4, 4);
    }
}

/*Create 1 class in which create a methods that will calculate the area (volume in case of box) of
Rectangle
Square
Box*/