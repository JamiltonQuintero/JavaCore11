package org.example.hackerrank;

public class Challenges {

    public static void main(String[] args) {

        System.out.println(findDigits(1012));

    }

    public static int findDigits(int n) {

        String cadena = String.valueOf(n);
        int totDivisibleNumbers = 0;
        for (int i = 0; i < cadena.length(); i++) {
            char letra = cadena.charAt(i);

            int valorDigito = letra - '0';

            if (valorDigito != 0 && n % valorDigito == 0) {
                totDivisibleNumbers++;
            }

        }
        return totDivisibleNumbers;
    }

}
