package com.akai.state.instance.real;

public class Red implements State{
    @Override
    public void switchToGreen(TrafficLight trafficLight) {
        System.out.println("红灯不能切换为绿灯");
    }

    @Override
    public void switchToYellow(TrafficLight trafficLight) {
        trafficLight.setState(new Yellow());
        System.out.println("黄灯亮起，时长6秒");
    }

    @Override
    public void switchToRed(TrafficLight trafficLight) {
        System.out.println("当前就是红灯，无需切换");
    }
}
