package com.akai.factory.nomal.factory.impl;

import com.akai.factory.nomal.factory.FreeGoodsFactory;
import com.akai.factory.nomal.sevice.IFreeGoods;
import com.akai.factory.nomal.sevice.impl.SmallGiftFreeGoods;

public class SmallGoodsFreeGoodsFactory implements FreeGoodsFactory {
    @Override
    public IFreeGoods getInstance() {
        return new SmallGiftFreeGoods();
    }
}
