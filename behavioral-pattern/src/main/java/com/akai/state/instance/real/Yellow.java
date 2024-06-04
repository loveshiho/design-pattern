package com.akai.state.instance.real;

public class Yellow implements State{
    @Override
    public void switchToGreen(TrafficLight trafficLight) {
        trafficLight.setState(new Green());
        System.out.println("绿灯亮起，时长60秒");
    }

    @Override
    public void switchToYellow(TrafficLight trafficLight) {
        System.out.println("当前就是黄灯，无需切换");
    }

    @Override
    public void switchToRed(TrafficLight trafficLight) {
        trafficLight.setState(new Red());
        System.out.println("红灯亮起，时长为600秒");
    }
}
