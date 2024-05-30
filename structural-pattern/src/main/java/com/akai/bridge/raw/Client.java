package com.akai.bridge.raw;

import java.math.BigDecimal;

public class Client {
    public static void main(String[] args) {
        PayController payController = new PayController();

        System.out.println("测试: 微信支付、人脸支付方式");
        payController.doPay("weixin_001", "1000112333333", new BigDecimal(100), 1, 2);

        System.out.println("测试: 支付宝支付、指纹支付方式");
        payController.doPay("zhifubao_002", "1000112334567", new BigDecimal(100), 2, 3);
    }
}
