package org.example;

import java.util.*;

public class Main {
    static String s;
    public static void main(String[] args) {

        String s;
        boolean isOk=true;
        if (isOk) s = Main.s+"";  // Line 1
        else s="";
        s.concat("Hello ");  // Line 2
        s.concat("World");
        s.toUpperCase();
        System.out.println("s = "+s);


        ClassFoerInterview classFoerInterview = new ClassFoerInterview();
        classFoerInterview.methodInsideInterviewBit("ClassFoerInterview");
        classFoerInterview.Products("ClassFoerInterview");

        InterviewBit interviewBit = new ClassFoerInterview();
        interviewBit.Products("InterviewBit");
        interviewBit.methodInsideInterviewBit("InterviewBit");


        InterviewBit interviewBit2 = new InterviewBit() {
            @Override
            void Products(String name) {
                System.out.println("insede method and overrride " + name);
            }
        };

        interviewBit2.Products("No use this");
        interviewBit2.methodInsideInterviewBit("No use this");

        List<Integer> aColle = new ArrayList<>();
        Integer integer = 10;
        int integer2 = integer;
        for (Iterator<?> it = aColle.iterator(); it.hasNext();){
            System.out.println(it);
        }
        aColle.forEach(System.out::println);

        aColle.stream().filter(integer1 -> integer1 > 20)
                .forEach(System.out::println);

        // enhanced loop
        for (Object o : aColle) {
            System.out.println(o);
        }

        List<Integer> aCollesets1 = new ArrayList<>();
        aCollesets1.add(1);
        aCollesets1.add(2);
        aCollesets1.add(3);
        aCollesets1.add(5);
        aCollesets1.add(4);
        aCollesets1.add(5);
        aCollesets1.add(6);
        Set<Integer> sets1 = new HashSet<>(aCollesets1);

        List<Integer> aCollesets2 = new ArrayList<>();
        aCollesets2.add(1);
        aCollesets2.add(2);
        aCollesets2.add(3);
        aCollesets2.add(4);
        aCollesets2.add(5);
        aCollesets2.add(5);
        Set<Integer> sets2 = new HashSet<>(aCollesets2);

        System.out.println(sets1.equals(sets2));

        Set<Integer> integers = new TreeSet<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(4);
        integers.add(5);
        integers.add(5);


        Set<Integer> integerLinkedHashSet = new LinkedHashSet<>();
        /*var asdasd = integers.descendingIterator();

        while (asdasd.hasNext()){

            System.out.println(asdasd.next());

        }*/

    }

    public int removeDuplicates(int[] nums) {

        int count =0;
        int currentNumber = nums[0];

        for (int i = 1; i < nums.length; i++) {

            if(currentNumber != nums[i-1]){
                currentNumber = nums[i];
            } else {
                count ++;
            }

        }

        return count;

    }
}