package com.akai.responsibility.raw;

public class Client {
    public static void main(String[] args) {
        Handler h1 = new HandlerA();
        Handler h2 = new HandlerB();
        Handler h3 = new HandlerC();
        // 创建处理链
        h1.setSuccessor(h2);
        h2.setSuccessor(h3);
        // 调用处理链头部的方法
        h1.handle("hello shiho~");
    }
}
