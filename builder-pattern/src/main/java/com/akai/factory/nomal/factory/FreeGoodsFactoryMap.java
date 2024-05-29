package com.akai.factory.nomal.factory;

import com.akai.factory.nomal.factory.impl.DiscountFreeGoodsFactory;
import com.akai.factory.nomal.factory.impl.SmallGoodsFreeGoodsFactory;

import java.util.HashMap;
import java.util.Map;

public class FreeGoodsFactoryMap {
    private static final Map<Integer, FreeGoodsFactory> cachedFactories = new HashMap<>();
    static {
        cachedFactories.put(1, new DiscountFreeGoodsFactory());
        cachedFactories.put(3, new SmallGoodsFreeGoodsFactory());
    }

    public static FreeGoodsFactory getParserFactory(Integer type) {
        /*不存在键是不会报错的*/
        return cachedFactories.get(type);
    }
}
