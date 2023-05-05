package org.example.hackerrank;

public class ValidParentheses {


    public static void main(String[] args) {


        String s = "()[]{}";

        //System.out.println(isValid(s));

        char c = '{' + 1;
        System.out.println(c);

    }

    public static boolean isValid(String s) {
        for (int i = 0; i < s.length(); i+=2) {
            char c = s.charAt(i);
            char c2 = s.charAt(i+1);
            if (c+1 != c2){
                return false;
            }
        }

        return true;
    }

}
