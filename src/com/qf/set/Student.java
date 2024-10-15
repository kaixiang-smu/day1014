package com.qf.set;

import java.util.Objects;

public class Student implements Comparable<Student>{
    private int age;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(age);
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                '}';
    }

    public Student() {
    }

    public Student(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    @Override
    public int compareTo(Student o) {
        /**
         * 正在存储的元素this，与之前存在的元素o相减
         * 结果为 0 说明相等，相等则不存储
         * 结果为 负 放左边
         * 结果为 正 放右边
         */
        return this.getAge()-o.getAge();
    }
}
