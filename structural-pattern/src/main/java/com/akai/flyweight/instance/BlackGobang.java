package com.akai.flyweight.instance;

/*共享享元类-黑色棋子*/
public class BlackGobang extends GobangFlyweight{
    @Override
    public String getColor() {
        return "black";
    }
}
