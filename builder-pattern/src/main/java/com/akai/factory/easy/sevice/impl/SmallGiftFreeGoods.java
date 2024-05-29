package com.akai.factory.easy.sevice.impl;

import com.akai.factory.easy.pojo.AwardInfo;
import com.akai.factory.easy.pojo.ResultResponse;
import com.akai.factory.easy.pojo.SmallGiftInfo;
import com.akai.factory.easy.sevice.IFreeGoods;

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
