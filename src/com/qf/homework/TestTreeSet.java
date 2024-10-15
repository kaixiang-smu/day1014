package com.qf.homework;

import java.util.TreeSet;

public class TestTreeSet {
    public static void main(String[] args) {
        TreeSet<User> set = new TreeSet<>();
        set.add(new User(19,"鹏龙"));
        set.add(new User(19,"成龙"));
        set.add(new User(21,"九龙"));
        set.add(new User(18,"克龙"));
        set.add(new User(20,"甲龙"));
        for (User user : set) {
            System.out.println(user);
        }
    }
}
