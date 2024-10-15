package com.qf.map;

import java.util.*;

public class Demo2_HashMap {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("A",1);
        map.put("B",2);
        map.put("C",3);
        map.put("D",4);
        System.out.println(map);
        // 键集keySet()
        Set<String> keySet = map.keySet();
        // 遍历键集合，得到每个键
        Iterator<String> iterator = keySet.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("*******************");
        for (String key : keySet) {
            Integer integer = map.get(key);
            System.out.println(key+"="+integer);
        }
        System.out.println("*******************");
        // 值集 values()
        Collection<Integer> values = map.values();
        for (Integer value : values) {
            System.out.println(value);
        }
        System.out.println("*******************");
        // 键值映射集
        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
        for (Map.Entry<String, Integer> entry : entrySet) {
            // 获得entry的键
            String key = entry.getKey();
            // 获得entry的值
            Integer value = entry.getValue();
            System.out.println(key+"="+value);
        }
    }
}
