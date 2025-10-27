package com.hugh.java17.v19;

import java.util.concurrent.TimeUnit;

public class Demo02 {
    public static void main(String[] args) throws InterruptedException {
        // 方式2
        Runnable task = () -> {
            System.out.println(Thread.currentThread().getName());
        };
        // 也可以直接start()
        Thread zhangsanThread = Thread.ofVirtual().name("zhangsan").unstarted(task);
        zhangsanThread.start();
        System.out.println("是否虚拟线程：" + zhangsanThread.isVirtual());

        TimeUnit.SECONDS.sleep(1);
    }
}
