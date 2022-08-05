package com.basic;

public class Palindrome {

    public static void main(String[] args) {

        String str = "Gadag";
        String rev="";

        for (int i = str.length()-1; i>=0 ; --i){
            rev+=str.charAt(i);
        }
        System.out.println(rev);

        if(!str.equalsIgnoreCase(rev))
            System.out.println(str + " is not a palindrome");
        else
        System.out.println("palindrome");
    }
}
