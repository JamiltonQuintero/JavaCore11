package org.example.hackerrank.natural;

import java.util.*;

public class NaturalOrder {

    public static void main(String[] args) {

        Set<Animal> animals = new TreeSet<>();

        animals.add(new Animal(1,"Rene", (byte) 5));
        animals.add(new Animal(2,"Pepe", (byte) 7));
        animals.add(new Animal(3,"Andy", (byte) 2));
        animals.add(new Animal(4,"Mario", (byte) 1));
        animals.add(new Animal(5,"Rene", (byte) 12));

//        animals.add("Rene");
//        animals.add("Pepe");
//        animals.add("Andy");
//        animals.add("Mario");
//        animals.add("Rene");




        System.out.println(animals);

    }

}
