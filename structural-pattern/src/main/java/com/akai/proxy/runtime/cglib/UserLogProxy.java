package com.akai.proxy.runtime.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/*模拟添加日志功能*/
public class UserLogProxy implements MethodInterceptor {

    private Object target;

    public UserLogProxy(Object target) {
        this.target = target;
    }

    /*生成cglib动态代理类*/
    /*返回代理类对象*/
    public Object getLogProxy() {
        /*增强类，用来创建动态代理类*/
        Enhancer enhancer = new Enhancer();
        // 设置代理类的父类字节码对象
        enhancer.setSuperclass(target.getClass());
        // 设置回调: 对于代理类上所有的方法的调用,都会调用 CallBack,而 Callback则需要实现 intercept()方法进行拦截
        enhancer.setCallback(this);
        // 创建动态代理对象并返回
        return enhancer.create();
    }

    /**
     * 实现回调方法
     *
     * @param o           代理对象
     * @param method      目标对象中的方法的Method实例
     * @param objects     实际参数
     * @param methodProxy 代理对象中的方法的method实例
     * @return: java.lang.Object
     */
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("proxy invoke");
        Object res = methodProxy.invokeSuper(o, objects);
        return res;
    }
}
