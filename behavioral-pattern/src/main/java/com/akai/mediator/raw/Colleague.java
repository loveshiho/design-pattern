package com.akai.mediator.raw;

// 抽象同事类
public abstract class Colleague {
    private Mediator mediator;

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }

    public Mediator getMediator() {
        return mediator;
    }
    // 同事间进行交互的方法
    public abstract void exec(String key);
}
