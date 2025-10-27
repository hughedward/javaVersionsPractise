package com.hugh.java17.v19;

import java.time.Duration;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

// 没使用虚拟线程
public class VirtualThrd {
    private static final Logger logger = LoggerFactory.getLogger(VirtualThrd.class);

    public static void main(String[] args) {
        // ExcutorService实现了AutoCloseable接口，可以自动关闭
        try (
//                ExecutorService executor = Executors.newCachedThreadPool()
                ExecutorService executor = Executors.newVirtualThreadPerTaskExecutor()

        ) {
            IntStream.range(0, 1000000).forEach(
                    i -> {
                        executor.submit(() -> {
                            try {
                                // 模拟
                                Thread.sleep(Duration.ofSeconds(1));
                                System.out.println("执行任务：" + i);
                            } catch (InterruptedException e) {
//                                e.printStackTrace();
                                logger.error("Error: {} - {}", e.getClass().getSimpleName(), e.getMessage());
                            }
                        });
                    }
            );
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
