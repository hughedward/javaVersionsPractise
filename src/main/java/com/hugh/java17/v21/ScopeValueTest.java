package com.hugh.java17.v21;

import java.lang.ScopedValue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ScopeValueTest {
    // 定义一个作用域值（类似“上下文的key”）
    // 起多少个线程，就会有多少个GIFT 副本与线程绑定
    // 副本会自动回收
    private static final ScopedValue<String> GIFT = ScopedValue.newInstance();

    // 赠送礼物的方法：绑定值并执行接收逻辑
    public static void giveGift() {
        // 绑定 GIFT 的值为“手机”，并在作用域内执行 receiveGift()
        // 精准传达
        ScopedValue.where(GIFT, "手机" + Thread.currentThread().getName()).run(() -> receiveGift());
    }

    // 接收礼物的方法：从作用域中获取值
    public static void receiveGift() {
        // 获取当前作用域内 GIFT 的值
        String gift = GIFT.get();
        System.out.println("收到礼物：" + gift); // 输出：收到礼物：手机
    }

    public static void main(String[] args) {
//        giveGift(); // 调用赠送方法，触发整个流程
        ScopeValueTest t = new ScopeValueTest();
        ExecutorService pool = Executors.newCachedThreadPool();
        for (int i = 0; i < 10; i++) {
            pool.submit(()->{
                t.giveGift();
            });
        }
        pool.shutdown();
    }
}
