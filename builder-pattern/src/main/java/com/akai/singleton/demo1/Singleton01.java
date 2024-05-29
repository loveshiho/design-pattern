package com.akai.singleton.demo1;

/*饿汉式在类加载期间初始化静态实例，保证 instance实例的创建是线程安全的*/
/*特点：不支持延时加载，获取实例对象的速度比较快，但是如果对象比较大，而没有使用就会造成内存浪费*/
public class Singleton01 {
    /*1 私有构造方法*/
    private Singleton01() {
    }

    /*2 在本例中创建私有静态的全局对象*/
    private static Singleton01 instance = new Singleton01();

    /*3 提供全局访问点，供外部获取单例对象*/
    public static Singleton01 getInstance() {
        return instance;
    }
}
