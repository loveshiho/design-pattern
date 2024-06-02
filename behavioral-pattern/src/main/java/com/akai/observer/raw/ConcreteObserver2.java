package com.akai.observer.raw;

public class ConcreteObserver2 implements Observer {
    @Override
    public void update() {
        System.out.println("ConcreteObserver2得到通知，更新状态");
    }
}
