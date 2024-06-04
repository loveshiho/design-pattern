package com.akai.state.raw;

public class ConcreteStateA implements State{
    @Override
    public void handle(Context context) {
        System.out.println("进入状态A");
        context.setCurState(this);
    }
}
