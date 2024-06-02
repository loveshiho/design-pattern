package com.akai.flyweight.instance;

public abstract class GobangFlyweight {
    public abstract String getColor();

    public void display() {
        System.out.println("棋子颜色: " + this.getColor());
    }
}
