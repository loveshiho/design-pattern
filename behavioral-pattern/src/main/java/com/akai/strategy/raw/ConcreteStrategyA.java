package com.akai.strategy.raw;

public class ConcreteStrategyA implements Strategy {
    @Override
    public void algorithm() {
        System.out.println("执行策略A");
    }
}
