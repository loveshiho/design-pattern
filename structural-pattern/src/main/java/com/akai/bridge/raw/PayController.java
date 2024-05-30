package com.akai.bridge.raw;

import java.math.BigDecimal;

public class PayController {
    public boolean doPay(String uId, String tradeId, BigDecimal amount, int channelType, int modeType) {
        // 微信支付
        if (1 == channelType) {
            System.out.println("微信渠道支付划账开始");
            if (1 == modeType) {
                System.out.println("密码支付");
            }
            if (2 == modeType) {
                System.out.println("人脸支付");
            }
            if (3 == modeType) {
                System.out.println("指纹支付");
            }
        }

        // 支付宝支付
        if (2 == channelType) {
            System.out.println("支付宝渠道支付划账开始");
            if (1 == modeType) {
                System.out.println("密码支付");
            }
            if (2 == modeType) {
                System.out.println("人脸支付");
            }
            if (3 == modeType) {
                System.out.println("指纹支付");
            }
        }
        return true;
    }
}
