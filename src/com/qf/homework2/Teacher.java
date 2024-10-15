package com.qf.homework2;

public class Teacher implements Comparable<Teacher>{
    private int age;
    private String name;
    private double salary;

    @Override
    public String toString() {
        return "Teacher{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    public Teacher() {
    }

    public Teacher(int age, String name, double salary) {
        this.age = age;
        this.name = name;
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


    @Override
    public int compareTo(Teacher o) {
        if (this.age>o.age){
            return -1;
        }else if (this.age<o.age){
            return 1;
        }else {
            if (this.salary<o.salary){
                return -1;
            }else if(this.salary>o.salary){
                return 1;
            }else {
                int result = this.name.compareTo(o.name);
                return result>=0?1:-1;
            }
        }
    }
}
