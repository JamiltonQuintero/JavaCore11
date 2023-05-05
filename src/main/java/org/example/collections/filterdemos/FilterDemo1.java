package org.example.collections.filterdemos;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FilterDemo1 {

    public static void main(String[] args) {

        List<Integer> numberList = new ArrayList<>();

        numberList.add(12);
        numberList.add(15);
        numberList.add(28);
        numberList.add(14);
        numberList.add(26);
        numberList.add(12);
        numberList.add(20);
        numberList.add(33);

        List<Integer> nuewNumbers = numberList
                .stream()
                .filter(integer -> integer %2==0)
                .collect(Collectors.toList());


        System.out.println(nuewNumbers);
    }

}
