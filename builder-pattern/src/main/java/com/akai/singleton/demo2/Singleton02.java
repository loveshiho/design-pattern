package com.akai.singleton.demo2;

public class Singleton02 {
    /*1 私有构造方法*/
    private Singleton02() {
    }

    /*2 在本例中创建私有静态的全局对象*/
    private static Singleton02 instance;

    /*3 通过判断对象是否被初始化，来选择是否创建对象*/
    /*通过添加 synchronized，保证多线程模式下的单例对象的唯一性*/
    public static synchronized Singleton02 getInstance() {
        if (instance == null) instance = new Singleton02();
        return instance;
    }
}
