package com.akai.singleton.demo1;

import org.junit.jupiter.api.Test;

public class TestSingleton01 {
    @Test
    void test() {
        Singleton01 instance = Singleton01.getInstance();
        Singleton01 instance1 = Singleton01.getInstance();
        System.out.println(instance1 == instance);  // true
    }
}
