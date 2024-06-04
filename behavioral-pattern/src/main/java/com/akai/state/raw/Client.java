package com.akai.state.raw;

public class Client {
    public static void main(String[] args) {
        Context context = new Context();
        State stateA = new ConcreteStateA();
        State stateB = new ConcreteStateB();
        stateA.handle(context);
        stateB.handle(context);
        /*
        进入状态A
        进入状态B
        */
    }
}
