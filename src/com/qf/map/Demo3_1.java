package com.qf.map;
/**
 * 设计方法，传入字符串，输出该字符串中每个字符出现的次数，使用HashMap
 * 实现例如：“abcHelloabcWorld”，输出 a出现2次，b出现2次，，，l出现3次，H出现1次
 */
public class Demo3_1 {
    public static void main(String[] args) {
        String s = "abcHelloabcWorld";
        int count;
        for (int i = 0; i < s.length(); i++) {
            count = 0;
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    count++;
                }
            }
            System.out.println(s.charAt(i)+"出现"+count+"次");
        }
    }
}
