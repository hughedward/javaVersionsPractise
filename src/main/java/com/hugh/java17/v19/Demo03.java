package com.hugh.java17.v19;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Demo03 {
    public static void main(String[] args) {
        try (
                ExecutorService executor = Executors.newVirtualThreadPerTaskExecutor();
        ) {
            executor.submit(()->{
                try {
                    TimeUnit.SECONDS.sleep(1);
                    System.out.println("执行任务");
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            });

        } catch (Exception e) {
            System.out.println("1");
        }

    }
}
