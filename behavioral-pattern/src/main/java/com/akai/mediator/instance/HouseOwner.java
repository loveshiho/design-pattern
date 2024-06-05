package com.akai.mediator.instance;

// 具体同事类-房屋拥有者
public class HouseOwner extends Person {
    public HouseOwner(String name, Mediator mediator) {
        super(name, mediator);
    }

    // 与中介联系
    public void contact(String msg) {
        mediator.contact(msg, this);
    }

    // 获取信息
    public void getMsg(String msg) {
        System.out.println("房主: " + name + " 获取到的信息: " + msg);
    }
}
