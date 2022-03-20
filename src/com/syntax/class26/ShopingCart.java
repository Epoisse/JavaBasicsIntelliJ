package com.syntax.class26;

public class ShopingCart {
   private double originalPrice=100;
   private double discount=.15;

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        if (discount>0&&discount<=.15) {
            this.discount = discount;
        } else {
            System.out.println("Can't have that much discount");
        }
    }

    void calculatePrice(){
        double price=originalPrice-(originalPrice*discount);
        System.out.println(price);
    }
}
class ShopingCartTester {
    public static void main(String[] args) {
        ShopingCart shopingCart=new ShopingCart();
        shopingCart.setDiscount(.20);
        shopingCart.calculatePrice();
        System.out.println(shopingCart.getDiscount());
    }
}
