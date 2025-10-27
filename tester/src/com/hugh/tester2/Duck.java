package com.hugh.tester2;


import java.lang.reflect.InvocationTargetException;

public class Duck {
    public static void talk() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        System.out.println("gaga~");
        Class<?> clazzDog = Class.forName("com.hugh.dev2.Dog");
        Object o = clazzDog.getConstructor().newInstance();

        System.out.println(o);
    }

    public static void main(String[] args) throws ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        talk();
    }
}
