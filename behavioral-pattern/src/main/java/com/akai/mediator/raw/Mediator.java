package com.akai.mediator.raw;

// 抽象中介者
public interface Mediator {
    // 处理同事对象注册，与转发同事对象信息的方法
    void apply(String key);
}
