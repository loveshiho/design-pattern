package com.akai.observer.raw;

/*抽象观察者*/
public interface Observer {
    /*为不同观察者更新行为定义一个相同的接口，不同的观察者对该方法有不同的实现*/
    void update();
}
