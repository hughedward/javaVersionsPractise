package com.hugh.tester;


import com.hugh.dev1.Cat;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Tester {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Cat cat = new Cat();
        cat.talk();

        Class<?> aClass = Class.forName("com.hugh.dev2.Dog");
        Object o = aClass.getConstructor().newInstance();
        Method talk = aClass.getMethod("talk");
        talk.invoke(o);
    }
}
