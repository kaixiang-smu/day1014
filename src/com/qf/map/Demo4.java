package com.qf.map;

import com.qf.set.Student;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

public class Demo4 {
    public static void main(String[] args) {
        /**
         * 使用map存储数据
         * 键存班级(字符串)，值存学生(多个学生)
         */
        HashMap<String, ArrayList<Student>> hashMap = new HashMap<>();

        // 存储一班学生
        ArrayList<Student> list1 = new ArrayList<>();
        list1.add(new Student(18));
        list1.add(new Student(18));
        list1.add(new Student(18));
        hashMap.put("一班",list1);

        HashMap<String, Object> obj = new HashMap<>();
        obj.put("id",1);
        obj.put("username","zhangsan");
        obj.put("passWord","123456");
        obj.put("createTime",new Date());
        obj.put("money",1.1);
        System.out.println(obj);


    }
}
