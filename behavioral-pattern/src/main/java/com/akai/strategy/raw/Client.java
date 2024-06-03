package com.akai.strategy.raw;

public class Client {
    public static void main(String[] args) {
        Strategy strategyA = new ConcreteStrategyA();
        Context context = new Context(strategyA);
        context.algorithm();
    }
}
