package com.akai.mediator.raw;

public class MediatorImpl implements Mediator{
    @Override
    public void apply(String key) {
        System.out.println("最终中介者执行的操作：" + key);
    }
}
