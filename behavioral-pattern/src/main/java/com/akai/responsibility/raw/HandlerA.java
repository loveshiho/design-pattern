package com.akai.responsibility.raw;

public class HandlerA extends Handler{
    @Override
    public void handle(String msg) {
        System.out.println("HandlerA invoked: " + msg);
        if (successor != null) {
            successor.handle(msg);
        } else {
            System.out.println("process pause");
        }
    }
}
