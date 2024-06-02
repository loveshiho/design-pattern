package com.akai.flyweight.instance;

public class Client {
    public static void main(String[] args) {
        // 获取享元工厂对象
        GobangFactory factory = GobangFactory.getInstance();
        GobangFlyweight b1 = factory.getGobang("b");
        GobangFlyweight b2 = factory.getGobang("b");
        GobangFlyweight b3 = factory.getGobang("b");
        System.out.println(b1 == b2 && b2 == b3);   // true

        GobangFlyweight w1 = factory.getGobang("w");
        GobangFlyweight w2 = factory.getGobang("w");
        System.out.println(w1 == w2);   // true
    }
}
