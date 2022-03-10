package com.syntax.homework;

public class PrivateThreeOverloadedForms {
    private void printPrivateMethod () {
        System.out.println("Printing private method without any parameters");
    }
    private void printPrivateMethod (String textOne) {
        System.out.println("Printing private method without any parameters plus text: "+textOne);
    }
    private void printPrivateMethod (String textOne, String textTwo) {
        System.out.println("Printing private method without any parameters plus concat of two strings:"+textOne+" and "+textTwo);
    }

    public static void main(String[] args) {
        new PrivateThreeOverloadedForms().printPrivateMethod();
        new PrivateThreeOverloadedForms().printPrivateMethod("text one");
        new PrivateThreeOverloadedForms().printPrivateMethod("text one", "text two");
    }
}
/*Create 1 class with a private method that has 3 overloaded forms.
Then call each overloaded method with specific arguments and observe result.
 */