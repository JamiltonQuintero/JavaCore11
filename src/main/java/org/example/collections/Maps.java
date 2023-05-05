package org.example.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Maps {

    public static void main(String[] args) {

        Map<String, Integer> empids = new TreeMap<>();

        empids.put("Jamilton", 1230);
        empids.put("Pero", 1230);
        empids.put("Pepe", 1230);
        empids.put("Pablo", 1230);
        empids.put("Juan", 1230);

        System.out.println(empids);

    }

}
