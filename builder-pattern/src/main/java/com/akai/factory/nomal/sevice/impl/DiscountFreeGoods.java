package com.akai.factory.nomal.sevice.impl;

import com.akai.factory.nomal.pojo.AwardInfo;
import com.akai.factory.nomal.pojo.ResultResponse;
import com.akai.factory.nomal.sevice.IFreeGoods;

public class DiscountFreeGoods implements IFreeGoods {
    @Override
    public ResultResponse sendFreeGoods(AwardInfo awardInfo) {
        System.out.println("发放打折卷成功" + awardInfo);
        return new ResultResponse("200", "nice~");
    }
}
