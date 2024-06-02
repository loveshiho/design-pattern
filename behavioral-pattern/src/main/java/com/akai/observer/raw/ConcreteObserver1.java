package com.akai.observer.raw;

public class ConcreteObserver1 implements Observer {
    @Override
    public void update() {
        System.out.println("ConcreteObserver1得到通知，更新状态");
    }
}
