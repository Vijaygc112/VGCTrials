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
        //  String string = "package com.basic; public class OlaSolution { public static void main(String[] args) { int a[] = {1,2,3,4}; int b[] = {2, 5, 6}; //VIJAY JAYVI // VIJAY JAYIV //1 2 3 4 // 2 5 6 // 1 3 4 5 6 printUniqueelements(a, b); } private static void printUniqueelements(int[] a, int[] b) { int[] c = new int[10]; int[] d = new int[10]; for (int i = 0; i < a.length; i++) { for (int j = 0; j < i ; j++) { if(a[i] != a[j]){ c[i] = a[i]; } } } for (int i = 0; i < c.length; i++) { System.out.println(c[i]); } } } ";
            String string = "{aasas([])}as}";
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
                stack.push(c);
                continue;
            }

            else if(!stack.isEmpty() &&
                    (( c == '}' && stack.peek() == '{') ||
                    ( c == ')' && stack.peek() == '(') ||
                    ( c == ']' && stack.peek() == '[') )){
                        stack.pop();
            }
             else if (c == '}' || c== ')' || c== ']')   // this is needed to handle if there are any additional closing brackets at the end
                   stack.push(c);
        }
        return (stack.isEmpty());

    }

}
