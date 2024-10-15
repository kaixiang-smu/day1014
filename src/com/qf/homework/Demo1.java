package com.qf.homework;

import java.util.HashSet;

public class Demo1 {
    public static void main(String[] args) {
        String[] arr = {"a","a","b","b","c","c"};
        HashSet<String> hashSet = new HashSet<>();
        for (String s : arr) {
            hashSet.add(s);
        }
        System.out.println(hashSet);
    }
}
