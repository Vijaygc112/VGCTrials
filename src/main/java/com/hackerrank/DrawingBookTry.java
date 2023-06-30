package com.hackerrank;

import java.util.Scanner;

public class DrawingBookTry {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter no of pages");
        int n = in.nextInt();
        System.out.println("Enter the page number to go to");
        int p = in.nextInt();

        System.out.println("Minimum turns needed (From Front or From Back) is : "+ minTurnsNeeded(n,p));
    }

    private static int minTurnsNeeded(int n, int p) {
        if (n % 2 == 0)
            n++;   //why is this needed ???
        return (Math.min(p/2, (n-p)/2));

    }
}
