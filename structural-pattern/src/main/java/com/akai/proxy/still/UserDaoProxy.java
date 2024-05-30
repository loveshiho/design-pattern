package com.akai.proxy.still;

public class UserDaoProxy implements IUserDao{
    // 组合真实对象
    private IUserDao target;

    public UserDaoProxy(IUserDao target) {
        this.target = target;
    }

    @Override
    public void save() {
        System.out.println("开启事务"); // 扩展额外功能
        target.save();
        System.out.println("提交事务");
    }
}
