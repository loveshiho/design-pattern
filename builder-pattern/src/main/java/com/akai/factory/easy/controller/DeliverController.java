package com.akai.factory.easy.controller;

import com.akai.factory.easy.factory.FreeGoodsFactory;
import com.akai.factory.easy.pojo.AwardInfo;
import com.akai.factory.easy.pojo.ResultResponse;
import com.akai.factory.easy.sevice.IFreeGoods;

public class DeliverController {
    // 发放奖品
    public ResultResponse awardToUser(AwardInfo awardInfo) {
        try {
            IFreeGoods freeGoods = FreeGoodsFactory.getInstance(awardInfo.getAwardType());
            ResultResponse res = freeGoods.sendFreeGoods(awardInfo);
            return res;
        } catch (Exception e) {
            e.printStackTrace();
            return new ResultResponse("201", "奖品发放失败!");
        }
    }
}
