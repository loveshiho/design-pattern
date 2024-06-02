package com.akai.flyweight.raw;

public class UnsharedConcreteFlyweight extends Flyweight{

    /*成员变量*/
    private String instate;

    public UnsharedConcreteFlyweight(String instate) {
        this.instate = instate;
    }

    @Override
    public void operation(String extrinsicState) {
        System.out.println("非共享享元类内部状态：" + instate);
        System.out.println("非共享享元类外部状态：" + extrinsicState);
    }
}
