package com.interview;

// using brute force Algorithm
public class PalindromeSubString {

    public static void main(String[] args) {

        String string = "qwetyertllollfdavfjsddfsg";
        String palindrome = longestPalindrome(string);
        System.out.println("Given String is : " + string);
        System.out.println("Longest palindrome substring is : " + palindrome);

    }

    private static String longestPalindrome(String string) {

        //create substrings -- brute force
        //reverse the string -- util
        //check palindrome -- util
        //check for boundary conditions
        String longestPalindrome = "";
        int longestPalindromeLength = 0;

        int length = string.length();
        if (length <= 1) {
            return string;
        }
        if (length == 2){
             char c = string.charAt(0);
             String s1 = Character.toString(c);
             return s1;
        }

        //create substrings and validate
        for(int leftIndex = 0; leftIndex<length; leftIndex++){

            for(int rightIndex=leftIndex; rightIndex < length;rightIndex++){

                String str1 = string.substring(leftIndex, rightIndex+1);
                if(isPalindrome(str1) && str1.length()> longestPalindromeLength){
                        longestPalindrome = str1;
                        longestPalindromeLength = str1.length();
                }
            }


        }
        return longestPalindrome;

    }

    private static boolean isPalindrome(String s){
        int length = s.length();
        String revrseWord = reverseWord(s);
        if(s.equalsIgnoreCase(revrseWord)){
            return true;
        }
    return false;
    }


    private static String reverseWord(String s1){
        String revString = "";
        char[] charArray = s1.toCharArray();
        for(int i =s1.length() -1 ; i >= 0; --i){
            revString+=charArray[i];
        }
        return revString;

    }


}
