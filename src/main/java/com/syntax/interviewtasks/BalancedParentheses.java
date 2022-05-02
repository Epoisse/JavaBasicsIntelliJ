package com.syntax.interviewtasks;

public class BalancedParentheses {
    public boolean isBalanced(String s) {
        String leftParentheses = "";
        String rightParentheses = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                leftParentheses += s.charAt(i);
            } else if (s.charAt(i) == ')') {
                rightParentheses += s.charAt(i);
            } else System.out.println("wrong char");
        }
        return (leftParentheses.length() == rightParentheses.length());
    }

    public static boolean isBalancedJohnEdition(String s) {

        int openBracket = s.replace(")", "").length();
        int closeBracket = s.replace("(", "").length();
        return  (openBracket == closeBracket);
    }
}
