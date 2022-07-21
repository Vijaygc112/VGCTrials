package com.basic;

import java.util.HashMap;
import java.util.HashSet;

public class UniqueNumbersInAArray {

    public static void main(String[] args) {
        int[] a = {2,3,4,2,3,6,7};

        printUniqueNumbers(a);
    }

    private static void printUniqueNumbers(int[] a) {
        HashSet<Integer> hashSet = new HashSet<Integer>();
        for (int i = 0; i < a.length; i++) {
            if (!hashSet.contains(a[i])){
                hashSet.add(a[i]);
                System.out.println(a[i]);
            }

        }

    }
}
