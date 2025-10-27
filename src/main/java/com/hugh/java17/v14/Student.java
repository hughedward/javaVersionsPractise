package com.hugh.java17.v14;

// set get 啥的一堆东西帮你写了
public record Student(
        String name,
        int age
) {
    public void study(){
        System.out.println("study hard, up up daily");
    }
}
