package com.syntax.replit;

public class Replit140 {

    public static void main(String[] args) {
        String[] arr = {"hey", "yolo", "hi", "this is long", "thees is long"};
        System.out.println(maxLength(arr));
        //should print "this is long"
    }

   static String maxLength(String[] arr) {
        String arr1 = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() > arr1.length()) {
                arr1 = arr[i];
            }
        }
        return arr1;
    }
}
/*For you to do:
Create the maxLength method that will accept String array of words and return the word with the largest length.
Method should visible only within same package!
Expected Output:
this is long
*/