package com.syntax.interviewtasks;

public class ReverseString {
    public static void main(String[] args) {
        String strToRev="I am a java Programmer";
        String [] arr=strToRev.split(" ");
        System.out.println(reverse(strToRev));
    }

    public static String reverse(String strToRev){
        String [] arr=strToRev.split(" ");
        strToRev="";
        for (int i= arr.length-1; i >=0; i--) {
            strToRev+=arr[i]+" ";
            }
        return strToRev.trim();
    }
}
/*
* Reverse the String without using the Reverse method from the BtringBuilder Class
* input["I am a java Programmer"] output["Programmer java a am I"]
input["Syntax is Great"] output["Great is Syntax"]
* */