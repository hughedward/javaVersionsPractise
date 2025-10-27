package com.hugh.java17.v13;

public class SwitchTest {
    public static void main(String[] args) {
        // 13 Switch 可以有返回值了

        int month = 3;
        String res = switch(month){
            case 3,4,5 -> "Spring";
            case 6,7,8 -> "Summer";
            case 9,10,11 -> "Autumn";
            case 12,1,2 -> "Winter";
            default -> "Invalid month";
        };


        System.out.println(res);


    }
}
