package com.qf.homework1;

import java.util.TreeSet;

public class TestStudent {
    public static void main(String[] args) {
        TreeSet<Student> treeSet = new TreeSet<>();
        treeSet.add(new Student("张三",10,10,10));
        treeSet.add(new Student("戴八",10,10,10));
        treeSet.add(new Student("李四",20,20,20));
        treeSet.add(new Student("王五",30,30,30));
        treeSet.add(new Student("陈六",40,40,40));
        treeSet.add(new Student("黄七",50,50,50));
        for (Student student : treeSet) {
            System.out.println(student);
        }
    }
}
