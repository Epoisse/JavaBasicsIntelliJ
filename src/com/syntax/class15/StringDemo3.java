package com.syntax.class15;

public class StringDemo3 {
    public static void main(String[] args) {
        String userName = "Asel";
        String password = "pass12345";
        String confirmedPassword = "pass12345";
        StringDemo3 task1 = new StringDemo3();
        task1.checkUserNamePassword(userName, password, confirmedPassword);
    }

    void checkUserNamePassword(String userName, String password, String confirmedPassword) {


        if (userName.isEmpty() || password.isEmpty()) {
            System.out.println("Username and Password cannot be empty");
        } else {
            if (password.length() < 8) {
                System.out.println("Password is too short");
            } else if (password.contains(userName)) System.out.println("Password cannot contain username");
            else if (password.equals(confirmedPassword)) {
                System.out.println("User has been created");
            } else {
                System.out.println("Passwords do not match");
            }
        }
    }
}

