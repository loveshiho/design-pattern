package com.akai.factory.nomal.factory.impl;

import com.akai.factory.nomal.factory.FreeGoodsFactory;
import com.akai.factory.nomal.sevice.IFreeGoods;
import com.akai.factory.nomal.sevice.impl.DiscountFreeGoods;

public class DiscountFreeGoodsFactory implements FreeGoodsFactory {
    @Override
    public IFreeGoods getInstance() {
        // 返回具体的产品
        return new DiscountFreeGoods();
    }
}
