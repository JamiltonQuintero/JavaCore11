package org.example.hackerrank;

import java.util.*;


public class CutTheSticks {

    public static void main(String[] args) {

        System.out.println(cutTheSticks(Arrays.asList(5,4, 4, 2, 2, 8)));

    }

    public static List<Integer> cutTheSticks(List<Integer> arr) {

        LinkedList<Integer> integerLinkedList = new LinkedList<>(arr);

        integerLinkedList.sort(Integer::compareTo);

        List<Integer> resultCutNumbers = new ArrayList<>();

        Iterator<Integer> iterator = integerLinkedList.iterator();

        while (iterator.hasNext()) {
            int lessNumber = integerLinkedList.getFirst();
            List<Integer> numbersToDelete = new ArrayList<>();
            int index = 0;
            resultCutNumbers.add(integerLinkedList.size());
            for (Integer num : integerLinkedList) {
                int remaining = num - lessNumber;

                if (remaining == 0) {

                    numbersToDelete.add(remaining);
                    integerLinkedList.set(index, remaining);
                } else {
                    integerLinkedList.set(index, remaining);
                }

                index++;

            }

            integerLinkedList.removeAll(numbersToDelete);

        }

        return resultCutNumbers;
    }

}
