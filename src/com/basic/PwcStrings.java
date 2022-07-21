package com.basic;

public class PwcStrings {

    public static void main(String[] args) {

        String string = "Vijay Chitragar";
        int countv = 0;
        int counti = 0;
        int countj = 0;
        for (int i=0; i < string.length() ; i++){

            if(string.charAt(i) == 'V'){
                countv ++;
            }else if (string.charAt(i) == 'i'){
                counti++;
            }else if (string.charAt(i) == 'j'){
                countj++;
            }

        }
        System.out.print("V=" + countv + " I="+ counti + " J=" + countj);


    }
}

