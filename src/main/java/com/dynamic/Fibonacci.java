package com.dynamic;

//recursive vs dynamic programming
// in dynamic, values are stored in a location to avaoid redundant calculation in the program flow
//      reducing the time taken

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {

        List<Integer> fibonacci = new ArrayList<Integer>();


        System.out.println("Enter a index to which series needs to be printed :: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        System.out.println("Recursive function");
        long str = System.currentTimeMillis();
        for (int i=0; i<n ; i++){
            System.out.print(function(i) + " ");
        }
        long end = System.currentTimeMillis();

        System.out.println("\nDynamic Programming (Tabulation)");
        long str_dp = System.currentTimeMillis();
        int[] arr = new int[n];
        arr[0]=0;
        arr[1]=1;
        for (int i = 2; i< n; i++){
            arr[i] = arr[i-1] + arr[i-2];
        }
        System.out.println(Arrays.toString(arr));
        long end_dp = System.currentTimeMillis();

        System.out.println("Time taken for Recursive solution (in milisec) :: " + (end - str));
        System.out.println("Time taken for DP solution (in milisec) :: " + (end_dp  - str_dp));
    }

    private static int function(int n) {

        if(n <= 1)
            return n;
        else
            return function(n-1) + function(n-2);
    }

}
