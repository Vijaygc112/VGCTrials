package com.basic;

import java.io.IOException;

class Employee{
        int empID = 123;
        public  void printName(){

            System.out.println("Employee ID is " + empID);

            String is = getClass().getResource("/test.txt").getFile();
            System.out.println(is);

        }

        }


public class getClassTest {

    public static void main(String[] a) throws IOException {

        Employee e1 = new Employee();
        Employee e2 = new Employee();

        System.out.println("This is e1.getClass" + e1.getClass());
        System.out.println("This is e1.getClass loader" + e1.getClass().getClassLoader());

        System.out.println("This is e2.getClass" + e2.getClass());

        e2.printName();


    }
}
