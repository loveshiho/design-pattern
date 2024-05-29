package com.akai.factory.raw.service;

import com.akai.factory.raw.pojo.SmallGiftInfo;

public class SmallGiftService {
    public Boolean giveSmallGift(SmallGiftInfo smallGiftInfo) {
        System.out.println("小礼品已发货,获奖用户注意查收! " + smallGiftInfo);
        return true;
    }
}
