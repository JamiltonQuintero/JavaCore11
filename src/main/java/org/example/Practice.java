package org.example;

import java.util.HashMap;
import java.util.Map;

public class Practice {

    public static void main(String[] args) {

        System.out.println(longestCommonPrefix(new String[]{"flower","flow","flight"}));

    }

    public static String longestCommonPrefix(String[] strs) {

        String prefix = strs[0];

        for (int i = 1; i < strs.length; i++) {

            String currentWord = strs[i];

            while (currentWord.indexOf(prefix) != 0){
                prefix = prefix.substring(0, prefix.length() - 1);
            }

            if (prefix.equals("")) return "";

        }
        return prefix;
    }

}
