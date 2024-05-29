package com.akai.factory.raw.controller;

import com.akai.factory.raw.pojo.AwardInfo;
import com.akai.factory.raw.pojo.DiscountResult;
import com.akai.factory.raw.pojo.SmallGiftInfo;
import com.akai.factory.raw.service.DiscountService;
import com.akai.factory.raw.service.SmallGiftService;
import com.akai.factory.raw.service.YouKuMemberService;

import java.util.UUID;

public class DeliverController {
    /**
     * 按照类型的不同发放商品
     * 奖品类型: 1 打折券，2 优酷会员，3 小礼品
     */
    public void awardToUser(AwardInfo awardInfo) {
        if (awardInfo.getAwardType() == 1) {
            DiscountService discountService = new DiscountService();
            DiscountResult result = discountService.sendDiscount(awardInfo.getUid(), awardInfo.getAwardNumber());
            System.out.println("打折券发放成功：" + result);
        } else if (awardInfo.getAwardType() == 2) {
            // 获取用户手机号
            String phone = awardInfo.getExtMap().get("phone");
            YouKuMemberService youKuMemberService = new YouKuMemberService();
            youKuMemberService.openMember(phone, awardInfo.getAwardNumber());
            System.out.println("发放优酷会员成功");
        } else if (awardInfo.getAwardType() == 3) {

            SmallGiftInfo smallGiftInfo = new SmallGiftInfo();
            smallGiftInfo.setUserName(awardInfo.getExtMap().get("username"));
            smallGiftInfo.setOrderId(UUID.randomUUID().toString());
            smallGiftInfo.setRelAddress(awardInfo.getExtMap().get("address"));
            smallGiftInfo.setUserPhone(awardInfo.getExtMap().get("phone"));

            SmallGiftService smallGiftService = new SmallGiftService();
            smallGiftService.giveSmallGift(smallGiftInfo);
            System.out.println("小礼品发放成功");
        }
    }
}
