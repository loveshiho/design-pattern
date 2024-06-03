package com.akai.strategy.raw;

public class ConcreteStrategyB implements Strategy {
    @Override
    public void algorithm() {
        System.out.println("执行策略B");
    }
}
