package com.akai.singleton.demo3;

import com.akai.singleton.demo4.Singleton04;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;

public class TestReflect {
    @Test
    void test() throws Exception{
        // 反射中，欲获取一个类或者调用某个类的方法，首先要获取到该类的 Class对象
        Class<Singleton04> clazz = Singleton04.class;
        Constructor<Singleton04> constructor = clazz.getDeclaredConstructor();
        // 设置为 true，就可以对类中的私有成员进行操作了
        constructor.setAccessible(true);
        Singleton04 instance = constructor.newInstance();
        Singleton04 instance1 = constructor.newInstance();
        System.out.println(instance1 == instance);
    }
}
