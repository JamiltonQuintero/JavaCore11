package org.example;

import java.util.HashMap;
import java.util.Map;

public class GapInterview {

//    Write a function to determine whether a word is anagram of another
//    Two words are anagrams of one another if their letters can be rearranged to
//    form the other word.
//    For example: "top" y "pot"
//    For example: "ootp" y "poot"

    public static void main(String[] args) {
        System.out.println(isAnagram("toop","top"));
    }

    private static boolean isAnagram(String firstWord, String secondWord){

        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < firstWord.length(); i++) {
           char caracter = firstWord.charAt(i);
            map.put(caracter, 0);
        }

        for (int i = 0; i < secondWord.length(); i++) {

            char caracter = secondWord.charAt(i);

            if(map.containsKey(caracter)){
                Integer value = map.get(caracter);
                map.put(caracter, ++value);

            } else {
                return false;
            }

            /*if(!map.containsKey(caracter)){
                return false;
            }*/

        }

        return true;

    }

}
