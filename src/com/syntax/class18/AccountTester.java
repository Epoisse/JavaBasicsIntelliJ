package com.syntax.class18;

public class AccountTester {

    public static void main(String[] args) {
        Account account = new Account();
        // account.printUserName(); private access
        account.printPassword();
        account.printBalance();
        account.printAccountNumber();

        //accessing a field directly is different from accessing the same field
        //with methods having different access modifier
    }
}
