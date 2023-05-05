package org.example.hackerrank;

public class SherlockAndSquares {



    public static int squares(int a, int b) {
        int count= 0;
        int index =1;
        boolean flag = true;
        while (flag){
            int square = index*index;
            if (square >= a && square <= b){
                count++;
            }else if(square > b) {
                flag = false;
            }
            index++;
        }
        return  count;

    }

}
