package com.akai.observer.raw;

public class Client {
    public static void main(String[] args) {
        /*创建目标类*/
        Subject subject = new ConcreteSubject();

        /*注册观察者，可以注册多个*/
        subject.attach(new ConcreteObserver1());
        subject.attach(new ConcreteObserver2());

        /*主题内部发生变化，给所有注册过的观察者发送通知*/
        subject.notifyObservers();
    }
}
