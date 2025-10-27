package com.hugh.java17.v17_LTS;

public class Switch01 {
    public static void main(String[] args) {
        Animal a = new Bird();
        action(a);

    }

    public static void action(Animal a){
        switch (a){
             // 预览版本 17
             // java: patterns in switch statements 是预览功能，默认情况下禁用。
             //  （请使用 --enable-preview 以启用 patterns in switch statements）
            case Rabbit r -> r.run();
            case Bird b -> b.fly();
            case null-> System.out.println("null");
            default -> System.out.println("no animals");
        }

    }
}

