package com.akai.observer.instance.real;

import java.util.Date;

// 开奖服务
public class LotteryServiceImpl extends LotteryService {

    // 注入摇号服务
    private DrawHouseService houseService = new DrawHouseService();

    /*只摇号，其它事不用干*/
    @Override
    public LotteryResult lottery(String uId) {
        String lots = houseService.lots(uId);
        return new LotteryResult(uId, lots, new Date());
    }
}
