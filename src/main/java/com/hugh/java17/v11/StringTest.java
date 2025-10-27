package com.hugh.java17.v11;

public class StringTest {
    public static void main(String[] args) {
        char b = '\u2000';
        String a = b + "aaa ";

        System.out.println(a.strip());;

        System.out.println(a.isBlank());;


    }
}
