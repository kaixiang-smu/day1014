package com.qf.homework1;

public class Student implements Comparable<Student>{
    private String name;
    private int chiScore;
    private int mathScore;
    private int engScore;

    /**
     * 单独设计一个方法获得总成绩
     */
    public int getScore(){
        return chiScore+mathScore+engScore;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", chiScore=" + chiScore +
                ", mathScore=" + mathScore +
                ", engScore=" + engScore +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getChiScore() {
        return chiScore;
    }

    public void setChiScore(int chiScore) {
        this.chiScore = chiScore;
    }

    public int getMathScore() {
        return mathScore;
    }

    public void setMathScore(int mathScore) {
        this.mathScore = mathScore;
    }

    public int getEngScore() {
        return engScore;
    }

    public void setEngScore(int engScore) {
        this.engScore = engScore;
    }

    public Student() {
    }

    public Student(String name, int chiScore, int mathScore, int engScore) {
        this.name = name;
        this.chiScore = chiScore;
        this.mathScore = mathScore;
        this.engScore = engScore;
    }

    /**
     * 完成按照分数高低排序
     * --------------------
     * this是当前正在存储的元素
     * o是已经存储在集合中的元素
     * --------------------
     * 返回0 不存储，即去重
     * 返回正数，放节点右侧
     * 返回负数，放节点左侧
     * --------------------
     * 二叉树在读数据时，按照左中右的顺序读取
     * 既然想按照总分从高到低排序，那么左侧应该放大值，右侧放小值
     */
    @Override
    public int compareTo(Student o) {
        int result = o.getScore() - this.getScore();
        return result >= 0 ? 1 : -1;
    }
}

