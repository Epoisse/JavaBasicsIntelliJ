package com.syntax.class25;

public interface MoveAble {
    void move();
}

interface DriveAble {
    void drive();
}

interface Car extends DriveAble, MoveAble {

}

class BMW implements Car {

    @Override
    public void move() {
        System.out.println("we can move a car");
    }

    @Override
    public void drive() {
        System.out.println("we can drive the BMW");
    }
}