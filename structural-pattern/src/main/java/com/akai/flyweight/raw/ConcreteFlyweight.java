package com.akai.flyweight.raw;

/*可共享的，具体享元类*/
/*在具体享元类中，需要将内部状态和外部状态分开处理*/
public class ConcreteFlyweight extends Flyweight {

    /*成员变量*/
    private String instate;

    public ConcreteFlyweight(String instate) {
        this.instate = instate;
    }

    /*外部状态在使用时，通常由外部设置，不保存在享元对象中，即使是同一个对象*/
    @Override
    public void operation(String extrinsicState) {
        System.out.println("内部状态：" + instate);
        System.out.println("外部状态：" + extrinsicState);
    }
}
