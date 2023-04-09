package org.example.hackerrank;


public class EjercicioLinkedList {


    public static void main(String[] args) {
        System.out.println(libraryFine(15, 7, 2014,1 ,7 ,2015));
    }

    public static int libraryFine(int d1, int m1, int y1, int d2, int m2, int y2) {
        // Write your code here

        int totDaysLater = d1- d2;
        int totMonthsLater = m1- m2;
        int totYeartsLater = y1- y2;

        int totExpected;

        if(totYeartsLater > 0){
            totExpected = totYeartsLater * 10000;
        } else if (totMonthsLater > 0 && !(totYeartsLater < 0)) {
            totExpected = totMonthsLater* 500;
        }  else if (totDaysLater > 0 && !(totMonthsLater < 0) && !(totYeartsLater < 0)) {
            totExpected = totDaysLater * 15;
        } else {
            totExpected= 0;
        }
        return totExpected;
    }

}
