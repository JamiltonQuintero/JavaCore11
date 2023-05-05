package org.example.collections;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkListVsArraylist {

    public static void main(String[] args) {

        LinkedList<String> stringLinkedList = new LinkedList<>();
        stringLinkedList.add("John");
        stringLinkedList.add("Paul");
        stringLinkedList.add("George");
        stringLinkedList.add("Ringo");

        System.out.println(stringLinkedList.get(2));

        ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("John");
        stringArrayList.add("Paul");
        stringArrayList.add("George");
        stringArrayList.add("Ringo");
        System.out.println(stringArrayList.get(2));
    }

}
