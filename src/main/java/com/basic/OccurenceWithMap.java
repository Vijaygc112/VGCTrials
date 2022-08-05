package com.basic;

import java.util.HashMap;
import java.util.Map;

public class OccurenceWithMap {

    public static void main(String[] args) {
        String str = "Vijay Chitragar";
        countOccurrences(str);
    }

    private static void countOccurrences(String str) {

        HashMap<Character, Integer> countmap = new HashMap<Character, Integer>();

        char[] strArray = str.toCharArray();

        for (Character c : strArray) {
            if (countmap.containsKey(c)) {
                countmap.put(c, countmap.get(c) + 1);
            } else {
                countmap.put(c, 1);
            }

        }
//PRINT
        for (Map.Entry entry : countmap.entrySet()) {
            System.out.println("The character " + entry.getKey() + " is " + entry.getValue());
        }
    }
}
