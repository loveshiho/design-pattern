package com.akai.state.instance.real;

public class Client {
    public static void main(String[] args) {
        TrafficLight trafficLight = new TrafficLight();
        trafficLight.switchToGreen();
        trafficLight.switchToYellow();
        trafficLight.switchToRed();
        /**
         * 红灯不能切换为绿灯
         * 黄灯亮起，时长6秒
         * 红灯亮起，时长为600秒
         * */
    }
}
