package com.syntax.class33;

public class NullPointerDemo {
    public static void main(String[] args) {
        String str = null;
        //we get the nullpointer exception when a method is called on an obj which
        // is not initialized
        str.length();
    }
}
