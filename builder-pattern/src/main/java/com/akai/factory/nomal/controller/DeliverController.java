package com.akai.factory.nomal.controller;

import com.akai.factory.nomal.factory.FreeGoodsFactory;
import com.akai.factory.nomal.factory.FreeGoodsFactoryMap;
import com.akai.factory.nomal.pojo.AwardInfo;
import com.akai.factory.nomal.pojo.ResultResponse;
import com.akai.factory.nomal.sevice.IFreeGoods;

public class DeliverController {
    // 发放奖品
    public ResultResponse awardToUser(AwardInfo awardInfo) {
        FreeGoodsFactory factory = FreeGoodsFactoryMap.getParserFactory(awardInfo.getAwardType());
        if (factory == null) throw new RuntimeException("no factory bean");
        IFreeGoods iFreeGoods = factory.getInstance();
        ResultResponse response = iFreeGoods.sendFreeGoods(awardInfo);
        return response;
    }
}
