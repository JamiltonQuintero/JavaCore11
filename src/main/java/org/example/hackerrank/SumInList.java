package org.example.hackerrank;

import java.util.List;
import java.util.stream.Collectors;

public class SumInList {

    public static void main(String[] args) {

        System.out.println(sum(List.of(1,2,3,4,5,6,7)));

    }

    public static List<Integer> sum (List<Integer> integers){
        //ntegers.stream().sorted(Integer::compareTo);
        return integers.stream().map(integer -> integer + 10).collect(Collectors.toList());
    }


}
