package com.interview;

//asked in PhonePe interview
//Given a java program as a string check if the string has a closing bracket for each opening bracket in order.
// Brackets include {,},[,],(,)
// If yes print Compiled successfully or else print Compile unsuccessful
// input - {([])} Output - Compiled
// input - {())} Output - Compilation Failed

import java.util.Stack;

public class ParenthesisMatch {

    public static void main(String[] args) {
        String string = "{}(){}{}{}[[";
        Boolean bool = checkParenthesis(string);

        if(bool)
            System.out.println("Compiled Successfully" );
        else
            System.out.println("Compilation Failed!!");
    }

    private static Boolean checkParenthesis(String string) {
        Stack<Character> stack = new Stack<>();

        for (int i=0; i< string.length() ; i++){
            char c = string.charAt(i);
            if (c == '{' || c == '(' || c == '[' ){
                stack.push(string.charAt(i));
            }

            else if(!stack.isEmpty() &&
                    ( c == '}' && stack.peek() == '{') ||
                    ( c == ')' && stack.peek() == '(') ||
                    ( c == ']' && stack.peek() == '[') ){

                        stack.pop();
            }
            else
                stack.push(c);
        }
        if (stack.isEmpty())
            return true;
        else
            return false;
    }

}
