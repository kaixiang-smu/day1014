package com.qf.homework3;

import java.util.HashSet;

public class TestUser {
    public static void main(String[] args) {
        HashSet<User> set = new HashSet<>();
        set.add(new User(18,"男",100,"盼盼"));
        set.add(new User(18,"男",105,"盼盼"));
        set.add(new User(18,"男",100,"花花"));
        set.add(new User(19,"男",100,"盼盼"));
        set.add(new User(20,"男",120,"盼盼"));
        set.add(new User(18,"女",100,"盼盼"));

        for (User user : set) {
            System.out.println(user);
        }
    }
}
