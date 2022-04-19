package com.syntax.class33;

public class ThrowDemo {
    public static void main(String[] args) {
        Account account = new Account();
        try {
            account.setBalance(-15);
        } catch (Exception e) {
            System.out.println("Negative");
            e.printStackTrace();
        }
    }
}
