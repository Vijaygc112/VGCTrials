package com.interview;

import java.util.Arrays;
import java.util.Collections;

public class CountOfWordsInSentence {

    public static void main(String[] args) {
        String str = "it out test adgd bfgfg";
        String output = rearrangeWords(str);

        String[] strings = str.split(" ");
        Arrays.sort(strings, Collections.reverseOrder());



        System.out.println("No of words is : " + strings.length);
        System.out.println("Rearranged words : \n");
        for (String n :strings) {
            System.out.print(n + " ");

        }
        System.out.println("\n"+ output);
    }

    public static String rearrangeWords(String str) {
    String[] words = str.split(" ");
        System.out.println(Arrays.toString(words));
    String rearrangedStr = rearrangeString(words);
    return rearrangedStr;
    }

    public static String rearrangeString(String[] words) {
        String temp;
        String rearrangedStr = "";
        for (int i = 0; i < words.length-1; i++) {
            if(words[i].compareTo(words[i+1]) < 0){
                temp = words[i+1];
                words[i+1] = words[i];
                words[i] = temp;
            }
        }

        for (int i = 0; i < words.length; i++) {
            rearrangedStr += words[i] + " ";
        }

    return rearrangedStr;
    }

}
