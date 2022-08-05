package com.basic;

public class TryOccurrenceFinal {

    public static void main(String[] args) {
        String string = "Good At Coding";
        countOccurrence(string);
    }

    private static void countOccurrence(String string) {
        int[] count = new int[255];

        System.out.println(count['G'] + " Test");
        System.out.println('G' + " test2");

        for (int i = 0; i < string.length(); i++) {
            System.out.println(count[string.charAt(i)]++);
        }
    }
}
