package org.example.variables;

public class TruncateNumber {

    public static void main(String[] args) {

        float myFloat = 123.456f;
        Float myFloatWrapper = new Float(myFloat);
        int mynumber = (int) myFloat;

        // Casting with loss of precision
        System.out.println("MyNumber = " + mynumber);

        // We can get the same result using Float.intValue();
        System.out.println("Float.intValue() = " + myFloatWrapper.intValue());

    }

}
