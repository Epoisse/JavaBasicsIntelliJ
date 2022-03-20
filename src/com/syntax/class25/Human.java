package com.syntax.class25;

public interface Human {
    //public static final redundant because by default all the variables are public static final
    //public static final int legs=2; the same as int legs=2;
    int legs=2;
    //public abstract void walk ();
    void walk();
    static void printLegs(){
        System.out.println(legs);
    }
    public default void noNeedToWorry(){
        System.out.println("default methods are there to functional programming");
    }
}
class Maha implements Human {


    @Override
    public void walk() {
        System.out.println("I can walk");
    }

    public static void main(String[] args) {
        Maha maha=new Maha();
        maha.walk();
        // Maha.printLegs();
        // Since static methods don't need create an obj it will be confusion if we call method which can be in different interfaces
        Human.printLegs(); //static methods can be called only throug the interface's name
    }
}
