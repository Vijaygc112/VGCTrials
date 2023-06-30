package com.hackerrank;

import java.util.Scanner;

public class CountingValleys {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter number of steps taken : ");
        int n = in.nextInt();

        System.out.println("Enter the path taken (single string with 'U' and 'D')");
        String path = in.next();

        int valleys = countValleys(n, path);
        System.out.println("Number of valleys is : " + valleys);
    }

    private static int countValleys(int n, String s) {
        int i=0, sealevel=0,temp=0,count=0;

        while(i<n){
            if(s.charAt(i) == 'D')
                sealevel =sealevel-1;
            else
                sealevel =sealevel+1;
            if(sealevel < 0)
                temp = 1;
            if(temp == 1 && sealevel == 0) {
                count++;
                temp = 0;
            }
            i++;
        }
        return count;
    }

//

}
