package com.hugh.java17.v21;

import static java.lang.StringTemplate.STR;

public class StringTem {
    public static void main(String[] args) {
        String sport = "basketball";
        // java.lang.StringTemplate is a preview API and may be removed in a future release
        String s2 = STR."I like \{sport}";
        System.out.println(s2);
    }
}
