package org.example.leetcode;

import java.util.*;
import java.util.stream.Collectors;

public class RemoveDuplicates {

    public static void main(String[] args) {

        System.out.println(removeDuplicates(new int[]{0,0,1,1,1,2,2,3,3,4}));


    }


    public static int removeDuplicates(int[] nums) {

        int count =0;

        Set<Integer> integers = Arrays.stream(nums).boxed().collect(Collectors.toCollection(TreeSet::new));

        Iterator<Integer> iterator = integers.iterator();

        while (iterator.hasNext()){
            nums[count] = iterator.next();
            count++;
        }

        return count;

    }

}



