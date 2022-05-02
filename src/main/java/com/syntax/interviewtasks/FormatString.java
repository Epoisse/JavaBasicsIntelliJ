package com.syntax.interviewtasks;

public class FormatString {
    public static void main(String[] args) {
        String input = "00-44 48 555555";
        System.out.println(formatString(input));
    }

    public static String formatString(String S) {

        String formatStr=S.replaceAll("[^\\d.]","");
        StringBuilder formatStr2= new StringBuilder();
        for (int i = 0; i < formatStr.length(); i++)
            if (i % 3 == 0 && i != 0) formatStr2.append("-").append(formatStr.charAt(i));
            else formatStr2.append(formatStr.charAt(i));
        return formatStr2.toString();
    }
}
/*
Format the String: Write the logic to format the string in the below given
format xxx-xxx-xxx after each 3 digits ther should be dash("-") if there are any spaces in the input remove those
input ["00-44 48 555555"
output ["004-448-555-555"]
input ["00-44 48 555"]
output["004-448-555"]
input ["00-44 #$% 48 55"]
output ["004-448-55"]
* */