package org.example;

public class Main {
    static String s;
    public static void main(String[] args) {

        String s;
        boolean isOk=true;
        if (isOk) s = Main.s+"";  // Line 1
        else s="";
        s.concat("Hello ");  // Line 2
        s.concat("World");
        s.toUpperCase();
        System.out.println("s = "+s);

    }
}