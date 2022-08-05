package com.basic;

import java.util.Scanner;

// Find the first non repetitive character in a string
// Use native approach not the Map
public class NonRepititiveChar {

    public static void main(String[] args) {
        System.out.println("Enter a string : ");
        Scanner in = new Scanner(System.in);
        String string = in.nextLine();
        printFirstNonRecitativeChar(string);
    }

    private static void printFirstNonRecitativeChar(String string) {

        int[] count = new int[string.length()];
        char[] charArray = new char[string.length()];

        for(int i=0; i<string.length(); i++){

            charArray[i] = string.charAt(i);
            count[i]++;

            for (int j=0; j<i; j++){
                if (charArray[i] == charArray[j]){
                    count[i]++;
                    charArray[j]='0';
                }
            }


        }

        for ( int i=0; i< string.length();i++){

            if (charArray[i] != 0){
                System.out.println("First Non Repetitive character is : " + string.charAt(i));
                break;
            }
        }

    }


}
