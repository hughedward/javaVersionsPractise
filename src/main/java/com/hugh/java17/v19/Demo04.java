package com.hugh.java17.v19;

public class Demo04 {
    public static void main(String[] args) {
        // 平台线程
        Runnable task = () -> {
            System.out.println(Thread.currentThread().getName());
        };
        // 链式编程
        Thread platformThrd = Thread.ofPlatform().name("平台线程").priority(4).daemon(true).unstarted(task);
        platformThrd.start();

        Thread thread = new Thread(task, "zhangsan");
        thread.start();

    }
}
