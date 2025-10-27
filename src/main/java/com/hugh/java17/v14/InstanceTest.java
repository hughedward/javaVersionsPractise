package com.hugh.java17.v14;

public class InstanceTest {
    public static void main(String[] args) {
        // Instance 匹配
        // 减少强制转换的操作
        // 14
        Object o = 1; // 多态

        // 旧写法
        if(o instanceof Integer){
            Integer oo = (Integer)o;
            System.out.println(oo);
        }

        // 新写法
        if(o instanceof Integer ii){
            System.out.println(ii);
        }
    }
}
