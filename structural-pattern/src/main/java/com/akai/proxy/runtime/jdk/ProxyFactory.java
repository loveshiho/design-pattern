package com.akai.proxy.runtime.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/*动态代理工厂*/
public class ProxyFactory {
    /*维护目标对象*/
    private Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }

    /*为目标对象生成代理对象*/
    public Object getProxyInstance() {
        return Proxy.newProxyInstance(
                // 目标类使用的类加载器
                target.getClass().getClassLoader(),
                // 目标类实现的接口
                target.getClass().getInterfaces(),
                // 事件处理器
                new InvocationHandler() {
                    /**
                     * @param proxy  the proxy instance that the method was invoked on
                     * @param method the {@code Method} instance corresponding to
                     *               the interface method invoked on the proxy instance.  The declaring
                     *               class of the {@code Method} object will be the interface that
                     *               the method was declared in, which may be a superinterface of the
                     *               proxy interface that the proxy class inherits the method through.
                     * @param args   an array of objects containing the values of the
                     *               arguments passed in the method invocation on the proxy instance,
                     *               or {@code null} if interface method takes no arguments.
                     *               Arguments of primitive types are wrapped in instances of the
                     *               appropriate primitive wrapper class, such as
                     *               {@code java.lang.Integer} or {@code java.lang.Boolean}.
                     * @return 返回目标对象的方法的返回值，没有返回值就返回 null
                     * @throws Throwable
                     */
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("开启事务");
                        method.invoke(target, args);
                        System.out.println("提交事务");
                        return null;
                    }
                }
        );
    }
}
