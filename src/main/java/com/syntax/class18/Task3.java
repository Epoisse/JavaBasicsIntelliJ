package com.syntax.class18;

public class Task3 {
    //Create a method that will accept a String as a parameter and return a new
    // String that consist only of vowels. Method should be available
    // inside the class only where it was declared and executed by calling it is name.

    // Static method can access other static methods and fields without needing
    //an object of that class name if they are inside the same class

    private static String onlyvowels(String input) {
        //String newStr=input.replaceAll("[^aeiouAEIOU]", "");
        //return newStr;
        return input.replaceAll("[^aeiouAEIOU]", "");
    }

    public static void main(String[] args) {
        System.out.println(onlyvowels("Emili"));
    }
}
