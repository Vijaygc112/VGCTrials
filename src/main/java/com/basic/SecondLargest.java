package com.basic;

public class SecondLargest {


    public static void main(String[] args) {
        int a[] = {2,5,1,55,6,49};

        printSecondLargest(a);
    }

    private static void printSecondLargest(int[] a) {

        int len = a.length;
        int temp = 0;
        for (int i=0; i< len; i++){

            for (int j=i+1; j< len;j++ ){

                if(a[i]> a[j]){
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        for(int i : a){
            System.out.println(i);
        }
        System.out.println("Second largest number is " + a[len-2]);
    }

}
