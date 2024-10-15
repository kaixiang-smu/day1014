package com.qf.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * 设计方法，传入字符串，输出该字符串中每个字符出现的次数，使用HashMap
 * 实现例如：“abcHelloabcWorld”，输出 a出现2次，b出现2次，，，l出现3次，H出现1次
 */
public class Demo3 {
    public static void main(String[] args) {

        ciShu("abcHelloabcWorld");
    }

    public static void ciShu(String s){
        // key存字符，value存次数
        HashMap<String, Integer> hashMap = new HashMap<>();
        char[] chars = s.toCharArray();
        // 遍历字符数组
        for (char c : chars) {
            String key = String.valueOf(c);
            // 判断map里面是否包含此键，即该字符
            boolean flag = hashMap.containsKey(key);
            if (!flag){ // 不包含，则是第1次存入，键的值，即次数是1
                hashMap.put(key,1);
            }else { // 之前有过该字符，次数+1，要先把键对应的值取出来，＋1之后再存入
                Integer count = hashMap.get(key);
                count++;
                hashMap.put(key,count);
            }
        }
        Set<Map.Entry<String, Integer>> entrySet = hashMap.entrySet();
        for (Map.Entry<String, Integer> entry : entrySet) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key+"出现"+value+"次");
        }
    }


    private static void show1() {
        String s = "abcHelloabcWorld";
        char[] chars = s.toCharArray();
        int count;
        for (int i = 0; i < chars.length; i++) {
            count = 0;
            for (int j = 0; j < chars.length; j++) {
                if (chars[i]==chars[j]) {
                    count++;
                }
            }
            System.out.println(chars[i]+"出现"+count+"次");
        }
    }
}
