package com.basic;

import java.util.Scanner;

public class StringReversal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the String : ");
       String string = scanner.nextLine();
        System.out.print("After the reversal ");


        for (int i=string.length() ; i > 0 ; --i){
            System.out.print(string.charAt(i-1));
        }




    }
}
