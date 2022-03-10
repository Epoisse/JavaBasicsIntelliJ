package com.syntax.class19;

public class Tester {
    public static void main(String[] args) {
        Horse horse=new Horse("Blanca", 24, 333);

        /*
        Horse -> Data type (Names of classes)
        horse -> Object/instance/reference variable/ variable
        = ->  assignment operator
        Horse("Blanca", 24, 333); -> call to a constructor
         */

        horse.printHorseName();
    }
}
