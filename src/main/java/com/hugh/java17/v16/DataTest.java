package com.hugh.java17.v16;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DataTest {
    public static void main(String[] args) {
        // 这个有一个表，在官网
        System.out.println(DateTimeFormatter.ofPattern("B").format(LocalDateTime.now()));
        System.out.println(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss").format(LocalDateTime.now()));
    }
}
