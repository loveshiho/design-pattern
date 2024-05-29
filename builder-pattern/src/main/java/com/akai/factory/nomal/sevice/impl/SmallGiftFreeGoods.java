package com.akai.factory.nomal.sevice.impl;

import com.akai.factory.nomal.pojo.AwardInfo;
import com.akai.factory.nomal.pojo.ResultResponse;
import com.akai.factory.nomal.pojo.SmallGiftInfo;
import com.akai.factory.nomal.sevice.IFreeGoods;

import java.util.UUID;

public class SmallGiftFreeGoods implements IFreeGoods {
    @Override
    public ResultResponse sendFreeGoods(AwardInfo awardInfo) {
        SmallGiftInfo smallGiftInfo = new SmallGiftInfo();
        smallGiftInfo.setUserPhone(awardInfo.getExtMap().get("phone"));
        smallGiftInfo.setUserName(awardInfo.getExtMap().get("username"));
        smallGiftInfo.setRelAddress(awardInfo.getExtMap().get("address"));
        smallGiftInfo.setOrderId(UUID.randomUUID().toString());
        System.out.println("小礼品已发放" + smallGiftInfo);
        return new ResultResponse("200", "nice~");
    }
}
