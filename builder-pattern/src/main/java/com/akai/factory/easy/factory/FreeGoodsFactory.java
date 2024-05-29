package com.akai.factory.easy.factory;

import com.akai.factory.easy.sevice.IFreeGoods;
import com.akai.factory.easy.sevice.impl.DiscountFreeGoods;
import com.akai.factory.easy.sevice.impl.SmallGiftFreeGoods;
import com.akai.factory.easy.sevice.impl.YouKuFreeGoods;

/*生成免费商品*/
public class FreeGoodsFactory {
    public static IFreeGoods getInstance(Integer type) {
        IFreeGoods iFreeGoods = null;
        if (type == 1) {
            iFreeGoods = new DiscountFreeGoods();
        } else if (type == 2) {
            iFreeGoods = new YouKuFreeGoods();
        } else if (type == 3) {
            iFreeGoods = new SmallGiftFreeGoods();
        }
        return iFreeGoods;
    }
}
