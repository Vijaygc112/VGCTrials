package com.interview;

// Brute force approach will have o(n^2) complexity
// below solution is with O(n) complexity

public class EquilibriumPoint {


    public static void main(String[] args) {
        int[] array = {2,0,5,4,5,2};
        int length = array.length;
        System.out.println("Equilibrium index is : " + equilibriumIndex(array, length));

    }

    private static int equilibriumIndex(int[] array, int length) {
        int i;
        int leftsum = 0, sum = 0;

        for (i = 0; i < length; i++)
            sum += array[i];

        for (i = 0; i < length; i++) {
            sum -= array[i];

            if (leftsum == sum)
                return i;

            leftsum += array[i];
        }

        return -1;


    }

}




