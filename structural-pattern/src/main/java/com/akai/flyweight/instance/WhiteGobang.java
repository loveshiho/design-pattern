package com.akai.flyweight.instance;

/*共享享元类-白色棋子*/
public class WhiteGobang extends GobangFlyweight{
    @Override
    public String getColor() {
        return "white";
    }
}
