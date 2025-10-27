package com.hugh.java17.v21;

public class SwitchDemo {
    public static void main(String[] args) {
        Integer a = 1;
        System.out.println(getObjInstance(a));
    }
    static Object getObjInstance(Object obj) {
        return switch (obj) {
            case null -> null;
            case Integer i -> "Integer: " + i;
            case String s -> "String: " + s;
            default -> "Object: " + obj;
        };
    }
}
