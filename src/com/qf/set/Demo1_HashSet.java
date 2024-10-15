package com.qf.set;

import java.util.HashSet;

public class Demo1_HashSet {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        boolean r1 = set.add(31);
        System.out.println(r1);
        boolean r2 = set.add(11);
        System.out.println(r2);
        // set集合不允许重复
        boolean r3 = set.add(11);
        System.out.println(r3);
        set.add(41);
        set.add(41);
        set.add(21);
        // 遍历顺序和插入顺序不一致
        for (Integer i : set) {
            System.out.println(i);
        }
        // 自行演示
        // 添加，删除，大小，判断(空，包含)，遍历

        System.out.println("****************");
        HashSet<Student> set2 = new HashSet<>();

        /**
         * 每new一个都是新对象，都是新地址值，地址值就是hashcode
         * 每new一遍都会调用一遍hashcode()，地址值都不一样，所以没去重
         * 所以需要重写hashcode()，但是只重写hashcode()还不行
         * 现在想做到属性一样就去重
         * 调用hashcode()获得地址值
         * 如果地址值不一样，直接存储
         * 如果地址值一样
         * (怎么可能出现地址值一样呢，那就是因为重写了hashcode()，如果不重写，每次地址值都不一样)
         * 如果地址值一样，也没有直接舍弃不存储
         * 而是再调用equals()判断对象内容
         * 如果内容判断不一样，存储
         * 如果内容一样，舍弃不存储
         */
        set2.add(new Student(18));
        set2.add(new Student(18));
        set2.add(new Student(21));
        set2.add(new Student(21));
        System.out.println(set2);
        System.out.println(new Student().hashCode());
        System.out.println(new Student().hashCode());
        System.out.println(new Student().hashCode());
        System.out.println(new Student(18).hashCode());
        System.out.println(new Student(18).hashCode());
        System.out.println(new Student(21).hashCode());
        System.out.println(new Student(21).hashCode());
        System.out.println(new Student(25).hashCode());
        System.out.println(new Student(25).hashCode());

    }
}
