package com.syntax.class16;

import org.omg.CORBA.WStringSeqHelper;

import java.util.Arrays;

public class StringDemo3 {
    public static void main(String[] args) {

        // split by words and store in an array
        String s="This is a sentence";
        String[]strArr=s.split(" ");
        System.out.println(Arrays.toString(strArr));
        System.out.println(strArr.length);
        System.out.println(strArr[0]);
        System.out.println(strArr[3]);

        String s2="This is a sentence. All good. I think so. Fascinating";
        String[] strArr2=s2.split("[.]");
        System.out.println(strArr2.length);
        System.out.println(strArr2[3].trim());
    }
}
