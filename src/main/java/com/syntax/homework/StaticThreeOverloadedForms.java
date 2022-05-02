package com.syntax.homework;

public class StaticThreeOverloadedForms {

    static void printSomeText () {
        System.out.println("I am printing nothing cool because the method don't have any parameters");
    }
    static void printSomeText (String text) {
        System.out.println("Now I am printing the text that was passed to the method parameters :"+text+" text");
    }
    static void printSomeText (String text, String anotherText) {
        System.out.println("Now it is printing concat of two strings: "+text+" "+anotherText);
    }

    public static void main(String[] args) {
        StaticThreeOverloadedForms.printSomeText();
        StaticThreeOverloadedForms.printSomeText("Wow! It is magic");
        StaticThreeOverloadedForms.printSomeText("Here is nothing to see. Just one text plus", "another one");
    }
}
/*Create 1 class with a static method that has 3 overloaded forms.
Then call each overloaded method with specific arguments and observe result.
 */