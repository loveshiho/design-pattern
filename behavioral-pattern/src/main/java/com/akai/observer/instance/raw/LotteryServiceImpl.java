package com.akai.observer.instance.raw;

import java.util.Date;

// 开奖服务
public class LotteryServiceImpl implements LotteryService {

    // 注入摇号服务
    private DrawHouseService houseService = new DrawHouseService();

    @Override
    public LotteryResult lottery(String uId) {
        String result = houseService.lots(uId);
        /*发短信*/
        System.out.println("发送短信通知用户ID为：" + uId + "，您的摇号结果如下：" + result);
        // 发送MQ消息
        System.out.println("记录用户摇号结果(MQ)，用户ID：" + uId + "，摇号结果：" + result);
        /*问题：发短信，MQ消息都不该是主流程操作，对于后续扩展不友好*/
        return new LotteryResult(uId, result, new Date());
    }
}
