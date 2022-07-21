package com.basic;

import java.util.*;

public class TryList {
    public static void main(String[] args) {

        System.out.println("http://deo.oraclecorp.com:7001");

        List values = new ArrayList();
        values.add("Vijay");
        values.add("test");
        values.add(45);
        values.add(576.56);
        values.add(1,98);

        for (Object i: values) {
            System.out.println(i);
        }
//
//        Set set = new HashSet();
//        set.add("Vijay");
//        set.add(57);
//        set.add("test");





    }


}
