package com.syntax.homework;

public class UserName {
    public void checkUserName(String userName) {
        if (userName.length() < 5) {
            throw new RuntimeException("Username length is less than 5 character");
        }
    }

    public static void main(String[] args) {
        UserName userName = new UserName();
        userName.checkUserName("Use");
    }
}
