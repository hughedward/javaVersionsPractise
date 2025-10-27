package com.hugh.java17.v10;

public class LocalVariable {
    public static void main(String[] args) {
        var name = "zhangsan";
        var age = 18;
        var height = 99999L;
        var o = new Object();

        // 11
        name.stripIndent();
        name.strip();
        name.isBlank();
        System.out.println((name + " ").repeat(3));
    }
}
