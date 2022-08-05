package com.basic;

import java.util.Scanner;

public class JavaEOF {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int counter =1;

        while (scanner.hasNext()){
            String string = scanner.nextLine();
        System.out.println(counter + " " + string);
        counter ++;
        }

    }
}
