package org.example.hackerrank;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class HowToRemoveDuplicateKeys {

    public static void main(String[] args) {

        List<Integer> nums = List.of(1,1,1,2,3,3,4);

        System.out.println(nums);


        List<Integer> unicNumbers = new ArrayList<>(new HashSet<>(nums));
        System.out.println(unicNumbers);
    }

}
