package com.akai.singleton.demo2;

import org.junit.jupiter.api.Test;

public class TestSingleton02 {
    @Test
    void test() {
        for (int i = 0; i < 1000; i++) {
            new Thread(() -> {
                Singleton02 instance = Singleton02.getInstance();
                System.out.println(Thread.currentThread().getName() + "---" + instance);
            }).start();
        }
    }
}
