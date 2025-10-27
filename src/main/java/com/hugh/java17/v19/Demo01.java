package com.hugh.java17.v19;

import java.util.concurrent.TimeUnit;

public class Demo01 {
    public static void main(String[] args) throws InterruptedException {
        Runnable task = () -> {
            System.out.println("执行任务");
        };
        // 交给虚拟线程
        Thread.startVirtualThread(task);
        /**
         * 这是因为虚拟线程的执行特性导致的：
         *
         *   原理分析
         *
         *   1. 虚拟线程是守护线程：虚拟线程默认是守护线程，当主线程（非守护线程）结束时，所有守护线程会被强制终止。
         *   2. 主线程执行太快：如果没有 TimeUnit.SECONDS.sleep(1)，主线程会立即执行完毕并退出，虚拟线程还没来得及执行 System.out.println("执行任务")
         *   就被终止了。
         *   3. 睡眠的作用：TimeUnit.SECONDS.sleep(1) 让主线程等待1秒，给虚拟线程足够的时间来执行任务。
         */
        TimeUnit.SECONDS.sleep(1);
    }
}
