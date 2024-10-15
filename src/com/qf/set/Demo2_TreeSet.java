package com.qf.set;

import java.util.TreeSet;

/**
 * TreeSet排序是使用元素的自然顺序对元素进行排序
 * 能够排序是因为实现了Comparable接口，所以能自然排序
 * 泛型可以减少数据类型转换
 */
public class Demo2_TreeSet {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();
        set.add(3);
        set.add(1);
        set.add(4);
        set.add(5);
        set.add(2);
        set.add(6);
        System.out.println(set);

        TreeSet<Student> set2 = new TreeSet<>();
        set2.add(new Student(18));
        set2.add(new Student(19));
        System.out.println(set2);

    }
}
