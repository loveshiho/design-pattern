package com.akai.factory.easy.sevice.impl;

import com.akai.factory.easy.pojo.AwardInfo;
import com.akai.factory.easy.pojo.ResultResponse;
import com.akai.factory.easy.sevice.IFreeGoods;

public class YouKuFreeGoods implements IFreeGoods {
    @Override
    public ResultResponse sendFreeGoods(AwardInfo awardInfo) {
        String phone = awardInfo.getExtMap().get("phone");
        System.out.println("优酷会员已发放" + phone);
        return new ResultResponse("200", "nice~");
    }
}
