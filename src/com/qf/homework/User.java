package com.qf.homework;

public class User implements Comparable{
    private int age;
    private String name;



    @Override
    public String toString() {
        return "User{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public User() {
    }

    public User(int age, String name) {
        this.age = age;
        this.name = name;
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

    /**
     * 此方法的返回值决定了TreeSet中排序和去重
     * ----------------------------------
     * 返回0，则去重
     * 返回负数，放在二叉树的左子树
     * 返回正数，放在二叉树的右子树
     * 参数Object是集合中已经存在的元素
     */
    @Override
    public int compareTo(Object o) {
        User other = (User) o; // 向下转型

//        int result = this.getAge() - other.getAge();
//        // 如果年龄和姓名完全一致，则返回0，去重即不存储
//        if (this.getAge()==other.getAge() && this.getName().equals(other.getName())){
//            return 0;
//        }
//        return result;

        // 先判断姓名
        if (this.getName().equals(other.getName())){
            // 年龄一样
            if (this.getAge() == other.getAge()){
                return 0; // 去重
            }else {
                // 姓名一样，年龄不一样，按照年龄升序排序
                return this.getAge()-other.getAge();
            }
        }else {
            // 姓名不一样，按照年龄升序排序
            return this.getAge()-other.getAge();
        }
    }
}
