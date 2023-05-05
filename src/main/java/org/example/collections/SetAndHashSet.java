package org.example.collections;

import java.util.HashSet;
import java.util.Set;

public class SetAndHashSet {

    public static void main(String[] args) {

        Set<String> stringSet = new HashSet<>();
        stringSet.add("Walter");
        stringSet.add("Jesse");
        stringSet.add("Skyler");
        stringSet.add("Mike");
        stringSet.add("Saul");
        stringSet.add("Walter");

        stringSet.remove(1);

        System.out.println(stringSet);



    }

}
