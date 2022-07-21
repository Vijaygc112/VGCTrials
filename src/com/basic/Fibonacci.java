package com.basic;

public class Fibonacci {

    public static void main(String[] args) {

        int a = 0;
        int b = 1;
        int i = 0;
        int sum = 0;
        System.out.print(a + " ");
        System.out.print(b + " ");

        while (i<3){
            sum = a+b;
            a = b;
            b=sum;
            System.out.print(sum + " ");
            i++;
        }

        //This is to test unicode \u000d  System.out.print(" " + "test");

    }
}
