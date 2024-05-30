package com.akai.proxy.runtime.jdk;

import com.akai.proxy.still.IUserDao;
import com.akai.proxy.still.UserDaoImpl;

public class Client {
    public static void main(String[] args) {
        IUserDao userDao = new UserDaoImpl();
        ProxyFactory factory = new ProxyFactory(userDao);
        /*获取代理对象*/
        IUserDao proxyInstance = (IUserDao) factory.getProxyInstance();
        /*代理方法执行*/
        proxyInstance.save();
    }
}
