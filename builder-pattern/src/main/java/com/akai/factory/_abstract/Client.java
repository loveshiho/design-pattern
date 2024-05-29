package com.akai.factory._abstract;

import com.akai.factory._abstract.factory.AppliancesFactory;
import com.akai.factory._abstract.product.Freezer;
import com.akai.factory._abstract.product.TV;

public class Client {
    private TV tv;
    private Freezer freezer;

    public Client(AppliancesFactory factory) {
        /*在客户端看来，就是使用抽象工厂来生产家电*/
        this.tv = factory.createTV();
        this.freezer = factory.createFreezer();
    }

    public TV getTv() {
        return tv;
    }

    public void setTv(TV tv) {
        this.tv = tv;
    }

    public Freezer getFreezer() {
        return freezer;
    }

    public void setFreezer(Freezer freezer) {
        this.freezer = freezer;
    }
}
