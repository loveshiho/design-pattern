package com.akai.responsibility.raw;

public class HandlerB extends Handler{
    @Override
    public void handle(String msg) {
        System.out.println("HandlerB invoked: " + msg);
        if (successor != null) {
            successor.handle(msg);
        } else {
            System.out.println("process pause");
        }
    }
}
