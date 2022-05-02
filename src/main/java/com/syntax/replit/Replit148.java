package com.syntax.replit;

public class Replit148 {

    String item;
    double price;
    int quantity;

    public Replit148(String item, double price, int quantity) {
        this.item = item;
        this.price = price;
        this.quantity = quantity;
    }

    public double itemTotalPrice() {
        return price * quantity;
    }


    public static void main(String[] args) {
        Replit148 replit148 = new Replit148("Blanket", 99.98, 1);
        System.out.println(replit148.item + " Total Value " + replit148.itemTotalPrice());
        Replit148 replit148a = new Replit148("Mattress", 439.18, 1);
        System.out.println(replit148a.item + " Total Value " + replit148a.itemTotalPrice());
        System.out.println("You purchased " + (replit148.itemTotalPrice() + replit148a.itemTotalPrice()) + " Today");
    }
}
/*
Create variables as below.
item,
price,
quantity
Create a constructor to initialize instance variables.
Create a method with name itemTotalPrice.
write a logic to to calculate the total values of items in stock. and print the result.
return the total value.
In Main Class.
Create two Object of ShoppingStore and pass the parameters to Constructor.
then using each object call the method itemTotalPrice.
Store the returned value of each object.
Calculate sum of both object and print the result.
Output:
Blanket Total Value 99.98
Mattress Total Value 439.18
You purchased 539.16 Today
Assignment Goals: Clean Code, proper naming convention, Choosing Variable Datatype,  This Keyword, Method Creation, Mathematic Operations, method return types.
 */