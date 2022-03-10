package com.syntax.class18;

public class Account {
    private String userName = "Teyfur";
    private String password = "Admin";
    public String accountNumber = "12345";
    private double balance=-1500;

    private void printUserName(){
        System.out.println(userName);
    }
    protected void printPassword(){
        System.out.println(password);
    }
    void printBalance() {
        System.out.println(balance);
    }
    public void printAccountNumber (){
        System.out.println(accountNumber);
    }
    public static void main(String[] args) {
        Account account=new Account();
        account.printUserName();
        account.printPassword();
        account.printAccountNumber();

        System.out.println(account.userName);
        System.out.println(account.accountNumber);
    }
}
