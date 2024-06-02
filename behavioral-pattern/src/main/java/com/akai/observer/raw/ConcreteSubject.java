package com.akai.observer.raw;

import java.util.ArrayList;
import java.util.List;

/*具体目标类*/
public class ConcreteSubject implements Subject{

    /*定义集合，存储所有观察者对象*/
    private List<Observer> observers = new ArrayList<>();

    // 注册方法，向观察者集合中增加一个观察者
    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    // 注销方法，用于从观察者集合中删除一个观察者
    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    /*通知所有观察者*/
    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
