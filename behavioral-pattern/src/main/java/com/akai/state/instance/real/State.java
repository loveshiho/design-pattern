package com.akai.state.instance.real;

/*状态接口*/
public interface State {
    void switchToGreen(TrafficLight trafficLight); // 切换为绿灯

    void switchToYellow(TrafficLight trafficLight); // 切换为黄灯

    void switchToRed(TrafficLight trafficLight); // 切换为红灯
}
