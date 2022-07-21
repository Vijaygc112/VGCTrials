package com.basic;

public class PWCTry {


    public static void main(String[] args) {
        String string = "vijay chitragar";
        countOccurrence(string);
    }

    private static void countOccurrence(String string) {

        char[] charArray = new char[string.length()];
        int[] count = new int[string.length()];

        for (int i = 0; i < string.length(); i++) {
            charArray[i] = string.charAt(i);
            count[i]++;

            for (int j = 0; j < i; j++) {

                if (charArray[i] == charArray[j]) {
                    count[i]++;
                    charArray[j]= '0';
                }
            }

        }

        for (int i = 0; i < charArray.length; i++) {

            if(charArray[i] != '0' && charArray[i] != ' ')
            System.out.println("The Number of occurrence of " + charArray[i] + " is " + count[i]);
        }

        System.out.println(charArray);
    }
}
