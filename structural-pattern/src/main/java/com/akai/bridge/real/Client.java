package com.akai.bridge.real;

import java.math.BigDecimal;

public class Client {
    public static void main(String[] args) {
        System.out.println("测试场景1: 微信支付、人脸方式");
        Pay weChatPay = new WeChatPay(new PayFaceMode());
        weChatPay.transfer("wx_00100100", "10001900", new BigDecimal(100));

        System.out.println();

        System.out.println("测试场景2: 支付宝支付、指纹方式");
        Pay aliPay = new AliPay(new PayFingerPrintMode());
        aliPay.transfer("jlu1234567", "567689999999", new BigDecimal(200));
    }
}
