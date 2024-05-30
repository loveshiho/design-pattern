package com.akai.proxy.still;

public class UserDaoImpl implements IUserDao{
    @Override
    public void save() {
        System.out.println("UserDaoImpl保存数据");
    }
}
