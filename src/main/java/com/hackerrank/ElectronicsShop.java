package com.hackerrank;

import java.util.*;

public class ElectronicsShop {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter budget available, Keyboard prices length, USB Drives length: ");
        String[] strings = scanner.nextLine().split(" ");

        System.out.println("Enter the array of Keyboard prices :" );
        String[] keyboard = scanner.nextLine().split(" ");

        System.out.println("Enter the USB prices array");
        String[] usb = scanner.nextLine().split(" ");

        int amountAvailable = Integer.parseInt(strings[0]);
        int[] keyboardPrices = new int[keyboard.length];
        int[] usbPrices = new int[usb.length];

        for (int i = 0; i < keyboard.length; i++) {
            keyboardPrices[i] = Integer.parseInt(keyboard[i]);
        }
        for (int j = 0; j < keyboard.length; j++) {
            usbPrices[j] = Integer.parseInt(usb[j]);
        }
        System.out.println("Maximum Shopped value : "+ computeBudget(keyboardPrices, usbPrices, amountAvailable));


    }

    private static int computeBudget(int[] keyboardPrices, int[] usbPrices, int amountAvailable) {

        int maximum=0,sum=0;
        for (int i = 0; i < keyboardPrices.length; i++) {

            for (int j = 0; j < usbPrices.length; j++) {
                sum= keyboardPrices[i]+usbPrices[j];
                //if((keyboards[i]+drives[j]) < b)
                if(sum >= maximum && sum <= amountAvailable)
                    maximum = sum;
            }
        }
        if(maximum == 0)
            return -1;
        else {
            return maximum;
        }
    }
}
