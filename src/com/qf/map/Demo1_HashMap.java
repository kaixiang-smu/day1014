package com.qf.map;

import java.util.HashMap;

public class Demo1_HashMap {
    public static void main(String[] args) {

        HashMap<String, Integer> map = new HashMap<>();
        map.put("A",1);
        map.put("B",2);
        map.put("C",3);
        map.put("D",4);
        // 通过键获得值
        // V get(Object key)
        // 返回指定键所映射的值；如果对于该键来说，此映射不包含任何映射关系，则返回null
        Integer v = map.get("E");
        System.out.println(v); // 找不到，返回null
        Integer v2 = map.get("C");
        System.out.println(v2);

        // 根据键移除整个键值对，返回这个键映射的值
        // V remove(Object key)
        // 从此映射中移除指定键的映射关系（如果存在）
        Integer a = map.remove("A");
        System.out.println(a);
        System.out.println(map);

        // 大小 int size()
        // 返回此映射中的键-值映射关系数
        int size = map.size();
        System.out.println(size);

        // 判断是否为空 boolean isEmpty()
        // 如果此映射不包含键-值映射关系，则返回 true
        System.out.println(map.isEmpty());

        // 清空 void clear()
        // 从此映射中移除所有映射关系
        map.clear();
        System.out.println(map.isEmpty());

        // 判断是否包含
        // boolean containsKey(Object key) 判断集合是否包含键
        // 如果此映射包含对于指定键的映射关系，则返回 true
        // boolean containsValue(Object value) 判断集合是否包含值
        // 如果此映射将一个或多个键映射到指定值，则返回 true
    }

    private static void show1() {
        HashMap<String, Integer> map = new HashMap<>();
        System.out.println(map);
        // 存储数据
        // V put(K key, V value) 在此映射中关联指定值与指定键
        // 返回值V代表的是该键之前的旧值，如果第一次没有就是null
        // 调用put方法，如果没有这个键，相当于添加
        // 之前如果有这个键，再put，相当于修改/替换，所以没有set方法
        Integer old = map.put("A", 1);
        System.out.println(old);
        // 存储相同的键，键不保留，但是值会替换，并且会返回旧值
        Integer old2 = map.put("A", 2);
        System.out.println(old2);
        map.put("C",3);
        map.put("D",4);
        map.put("B",2);
        // 无序，键不能重复，值允许重复
        System.out.println(map);

        HashMap<String, String> m = new HashMap<>();
        m.put("河南","豫");
        m.put("安徽","皖");
        m.put("上海","沪");
        m.put("浙江","浙");
        m.put("江苏","苏");

    }
}
