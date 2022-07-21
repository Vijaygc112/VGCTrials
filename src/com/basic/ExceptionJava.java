package com.basic;

import java.io.*;
import java.util.*;

public class ExceptionJava {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner scanner = new Scanner(System.in);
        try {
            int i = scanner.nextInt();
            int j = scanner.nextInt();

            System.out.println(i / j);
        }
             catch (InputMismatchException e){
                System.out.println("java.util.InputMismatchException");
            }
        catch (Exception e){
                System.out.println(e);
        }




    }
}