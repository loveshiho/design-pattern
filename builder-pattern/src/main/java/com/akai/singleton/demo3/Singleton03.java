package com.akai.singleton.demo3;

public class Singleton03 {
    /*1 私有构造方法*/
    private Singleton03() {
    }

    /*2 在本例中创建私有静态的全局对象*/
    // 使用 volatile保证变量的可见性，屏蔽指令重排
    private volatile static Singleton03 instance;

    /*3 通过判断对象是否被初始化，来选择是否创建对象*/
    /*通过添加 synchronized，保证多线程模式下的单例对象的唯一性*/
    public static synchronized Singleton03 getInstance() {
        // 第一次判断，如果 instance不为 null，不进入抢锁阶段，直接返回实例
        if (instance == null) {
            synchronized (Singleton03.class) {
                // 抢到锁之后再次进行判断是否为null
                if (instance == null) {
                    instance = new Singleton03();
                    /*
                    * 上面创建对象的代码，在JVM中被分为3步
                    * 1 分配内存空间
                    * 2 初始化对象
                    * 3 将 instance指向分配好的内存空间
                    * JVM会对上述指令进行重排，重排为 1 3 2
                    * */
                }
            }
        }
        return instance;
    }
}
