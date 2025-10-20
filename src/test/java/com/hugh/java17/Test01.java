package com.hugh.java17;

// already be in java8
public interface Test01 {
    void eat();

    default void fun1(){
        System.out.println("hello");
    }

    static void hun2(){
        System.out.println("hello2");
    }



}
