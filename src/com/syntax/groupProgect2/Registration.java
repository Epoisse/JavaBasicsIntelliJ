package com.syntax.groupProgect2;

public class Registration {
    private String email;
    private String userName;
    private String password;

    // setters with requirements
    public void setEmail(String email) {
        if (email.endsWith("@yahoo.com")) {
            this.email = email;
            System.out.println("email has been set up");
        } else System.out.println(-1);
    }

    public void setUserName(String userName) {
        if (userName.length() > 6) {
            this.userName = userName;
            System.out.println("username has been set up");
        } else System.out.println(-1);
    }

    public void setPassword(String password) {
        if (password.length() > 6 && password.contains(userName)) {
            this.password = password;
            System.out.println("password has been set up");
        } else System.out.println(-1);
    }

    // getters for class fields
    public String getEmail() {
        return email;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }
}

class RegistrationTester {
    public static void main(String[] args) {
        // negative test
        Registration obj = new Registration();
        obj.setEmail("test@gmail.com");
        obj.setUserName("test");
        obj.setPassword("123");

        // positive test
        Registration obj1 = new Registration();
        obj.setEmail("test@yahoo.com");
        obj.setUserName("testusername");
        obj.setPassword("123testusername");
        System.out.println(obj.getEmail());

    }
}