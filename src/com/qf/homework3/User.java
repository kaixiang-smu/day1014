package com.qf.homework3;

import java.util.Objects;

public class User {
    private int age;
    private String sex;
    private int score;
    private String name;

    /**
     * 返回true，则认为相同，则不存储
     */
    @Override
    public boolean equals(Object o) {
       User other = (User) o;
        boolean b1 = other.sex.equals(this.sex);
        boolean b2 = other.name.equals(this.name);
        // 5岁以内不存储
        boolean b3 = Math.abs(other.age - this.age) <= 5;
        // 成绩相差10以内不存储
        boolean b4 = Math.abs(other.score - this.score) <= 10;
        if (b1 && b2 && b3 && b4){
            return true;
        }
        return false;
    }
    /**
     * hashcode不同时，直接存储
     * hashcode相同，才执行equals判断内容
     */
    @Override
    public int hashCode() {
        return Objects.hash(sex, name);
        // return 1; // 都返回1也行
    }

    @Override
    public String toString() {
        return "User{" +
                "age=" + age +
                ", sex='" + sex + '\'' +
                ", score=" + score +
                ", name='" + name + '\'' +
                '}';
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User() {
    }

    public User(int age, String sex, int score, String name) {
        this.age = age;
        this.sex = sex;
        this.score = score;
        this.name = name;
    }
}
