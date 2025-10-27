package com.hugh.java17.v12;

public class SwitchTest {
    public static void main(String[] args) {
        int month = 3;
        // 12 预览版本，13 14 正式版本
        /**
         * javac --enable-preview -source 12 Test.java
         * java --enable-preview Test
         */
        switch(month){
            case 3,4,5 -> System.out.println("Spring");
            case 6,7,8 -> System.out.println("Summer");
            case 9,10,11 -> System.out.println("Autumn");
            case 12,1,2 -> System.out.println("Winter");
            default -> System.out.println("Invalid month");
        }

        // 以前
        switch (month) {
            case 3:
            case 4:
            case 5:
                System.out.println("Spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Autumn");
                break;
            case 12:
            case 1:
            case 2:
                System.out.println("Winter");
                break;
            default:
                System.out.println("Invalid month");
                break;
        }
    }
}
