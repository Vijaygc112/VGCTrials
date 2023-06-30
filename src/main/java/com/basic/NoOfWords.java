package com.basic;

/*Multiple approaches available
1. Loop through each character -> if separator is hit > Increment the counter
2. Use String.split() method -> use string array.length
*/
public class NoOfWords {

    public static void main(String[] args) {
        String s = "This is Word      Count ";
        System.out.println("Given String is " + s);
        System.out.println("Word Count is " + find_count_via_split_method(s));
    }

    private static int find_count_via_split_method(String s) {

        String[] strings = s.split(" ");
        return strings.length;


    }


}
