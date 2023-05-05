package org.example.hackerrank;

import java.util.Arrays;

public class FoudTheMissNumber {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7,8,9,10,12,13,14,16};

        int misNumber = getMissNumber(arr);

        System.out.println(misNumber > 0 ? misNumber : "We have a complete arr");

    }

    private static int getMissNumber(int[] arr){
        int size = arr.length;
        for (int i = 0; i < size; i++) {
            if(arr[i] != i + 1){
                return i + 1;
            }
        }
        return 0;
    }

}
