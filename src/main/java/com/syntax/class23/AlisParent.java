package com.syntax.class23;

public class AlisParent {
    String girlName = "Salma";
    double money = 100000000;

    void marry() {
        System.out.println("Ali you should marry " + girlName);
    }
}

class Ali extends AlisParent {
    String girlName = "Taylor Swift";

    void marry() {
        super.marry();
        System.out.println("But Dad I want to marry " + girlName);

    }
}
