package com.qf.homework2;

import java.util.TreeSet;

public class TestTeacher {
    public static void main(String[] args) {
        TreeSet<Teacher> treeSet = new TreeSet<>();
        treeSet.add(new Teacher(30,"bc",1500));
        treeSet.add(new Teacher(30,"bc",1500));

        for (Teacher teacher : treeSet) {
            System.out.println(teacher);
        }
    }
}
