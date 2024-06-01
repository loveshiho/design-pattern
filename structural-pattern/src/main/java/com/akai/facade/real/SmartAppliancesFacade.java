package com.akai.facade.real;

public class SmartAppliancesFacade {
    private Light light;
    private TV tv;
    private AirCondition airCondition;

    public SmartAppliancesFacade() {
        light = new Light();
        tv = new TV();
        airCondition = new AirCondition();
    }

    public void say(String msg) {
        if (msg.contains("打开")) {
            on();
        } else if (msg.contains("关闭")) {
            off();
        }
    }

    private void off() {
        System.out.println("关闭家电中...");
        light.off();
        tv.off();
        airCondition.off();
    }

    private void on() {
        System.out.println("打开家电中...");
        light.on();
        tv.on();
        airCondition.on();
    }
}
