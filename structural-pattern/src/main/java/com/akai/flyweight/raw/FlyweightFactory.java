package com.akai.flyweight.raw;

import java.util.HashMap;
import java.util.Map;

/* 享元工厂类
 * 作用: 作为存储享元对象的享元池 用户获取享元对象时先从享元池获取，有则返回，没有创建新的
 * 享元对象返回给用户，并在享元池中保存新增的对象*/
public class FlyweightFactory {
    // 定义一个HashMap用于存储享元对象，实现享元池
    private Map<String, Flyweight> pool = new HashMap();

    public FlyweightFactory() {
        // 添加对应的内部状态
        pool.put("A", new ConcreteFlyweight("A"));
        pool.put("B", new ConcreteFlyweight("B"));
        pool.put("C", new ConcreteFlyweight("C"));
    }

    // 根据内部状态来进行查找
    public Flyweight getFlyweight(String key) {
        // 对象存在，从享元池直接返回
        if (pool.containsKey(key)) {
            System.out.println("享元池中存在，直接复用，key: " + key);
            return pool.get(key);

        } else {
            // 如果对象不存在，先创建一个新的对象添加到享元池中，然后返回
            System.out.println("享元池中不存在，创建并复用，key: " + key);
            Flyweight fw = new ConcreteFlyweight(key);
            pool.put(key, fw);
            return fw;
        }
    }
}
