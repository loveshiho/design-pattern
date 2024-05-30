package com.akai.bridge.real;

import java.math.BigDecimal;

public class AliPay extends Pay{

    public AliPay(IPayMode payMode) {
        super(payMode);
    }

    @Override
    public String transfer(String uId, String tradeId, BigDecimal amount) {
        System.out.println("支付宝支付开始");
        boolean security = payMode.security(uId);
        System.out.println("支付宝支付风险校验：" + uId + ", " + tradeId + ", " + security);
        if (!security) return "500";
        System.out.println("收到金额：" + amount);
        return "200";
    }
}
