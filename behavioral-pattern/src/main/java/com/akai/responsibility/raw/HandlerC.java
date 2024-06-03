package com.akai.responsibility.raw;

public class HandlerC extends Handler{
    @Override
    public void handle(String msg) {
        System.out.println("HandlerC invoked: " + msg);
        if (successor != null) {
            successor.handle(msg);
        } else {
            System.out.println("process pause");
        }
    }
}
