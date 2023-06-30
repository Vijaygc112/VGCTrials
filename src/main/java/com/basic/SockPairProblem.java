package com.basic;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'sockMerchant' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER_ARRAY ar
     */

    public static int sockMerchant(int n, List<Integer> ar) {

        Set<Integer> pair = new HashSet<Integer>();
        int count = 0;

        for(int i=0; i< n; i++){

            if(!(pair.contains(ar.get(i))))
                pair.add(ar.get(i));
            else {
                count++;
                pair.remove(ar.get(i));
            }
        }

        return count;

    }

}

public class SockPairProblem {
    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        int n = Integer.parseInt(bufferedReader.readLine().trim());
//
//        List<Integer> ar = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
//                .map(Integer::parseInt)
//                .collect(toList());
        int n = 5;
        List<Integer> ar = new ArrayList<>();
        ar.add(2);
        ar.add(3);
        ar.add(2);
        ar.add(3);
        ar.add(5);

        int result = Result.sockMerchant(n, ar);
        System.out.println("Result "+ result);

    }
}
