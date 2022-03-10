package com.syntax.homework;

public class UserClass {
    static String name;
    static int mobileNumber;

    public UserClass(String name, int mobileNumber) {
        this.name = name;
        this.mobileNumber = mobileNumber;
    }
}

class UserInfo extends UserClass {
    static String userAddress;

    public UserInfo(String name, int mobileNumber, String userAddress) {
        super(name, mobileNumber);
        this.userAddress = userAddress;
    }

    //public UserInfo(String userAddress) {}

    static void userDetails() {
        System.out.println(name + ", " + mobileNumber + ", " + userAddress);
    }

    public static void main(String[] args) {
        new UserInfo("John", 283749033, "NYC");
        UserInfo.userDetails();
    }
}

/*Write program: userClass  that has a constructor that initializes instance variable name and mobile number.
Create a subclass  userInfo that will have user address variable and it also being initialized through constructor call.
Print users name, mobile number and address in userDetails method. Test your code.*/