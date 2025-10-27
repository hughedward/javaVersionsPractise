package com.hugh.java17.v16;

/**
 * 不建议使用包装类作为锁对象
 */
public class Integer01 {
    public static void main(String[] args) {
        Integer a = 1;
        // 不要这样写
        synchronized (a){

        }
    }
}
