package com.akai.state.instance.real;

public class Green implements State{
    @Override
    public void switchToGreen(TrafficLight trafficLight) {
        System.out.println("当前就是绿灯，无需切换");
    }

    @Override
    public void switchToYellow(TrafficLight trafficLight) {
        trafficLight.setState(new Yellow());
        System.out.println("黄灯亮起，时长6秒");
    }

    @Override
    public void switchToRed(TrafficLight trafficLight) {
        System.out.println("绿灯不能切换为红灯");
    }
}
