package org.example.hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class DeleteRepeateNumber {

    public static void main(String[] args) {

        int[] arr = new int[] {2,3,4,4,1,1,1,4,5,6};

        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());

        System.out.println(list);

        List<Integer> set = new ArrayList<>(new HashSet<>(list));

        System.out.println(set);


    }

}
