package com.syntax.replit;

public class Replit147 {
    String model;
    double price;
    int quantity;

    public Replit147(String model, double price, int quantity) {
        this.model = model;
        this.price = price;
        this.quantity = quantity;
    }
    void carStockValue () {
        System.out.println(model+"Stock Value "+price*quantity);
    }

    public static void main(String[] args) {
        Replit147 replit147=new Replit147("Toyota 2019 ",2500000,1 );
        replit147.carStockValue();
        Replit147 replit147a=new Replit147("BMW 2019 ",652980,1 );
        replit147a.carStockValue();
    }
}
/*
In carObject class:
Create instance variables as below.
model
price,
quantity
Create a constructor that will initialize instance variables.
Create a method with name carStockValue. Write logic to calculate the total values of cars in stock and print the result.
run the application in Main Class
Expected Output:
Toyota 2019 Stock Value 2500000.0
BMW 2019 Stock Value 652980.0
Assignment Goal. Clean Code, This Keyword, Method Creation, Mathematic Operations.
 */