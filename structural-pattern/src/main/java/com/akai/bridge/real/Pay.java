package com.akai.bridge.real;

import java.math.BigDecimal;

public abstract class Pay {
    /*桥接对象*/
    protected IPayMode payMode;

    public Pay(IPayMode payMode) {
        this.payMode = payMode;
    }

    // 划账功能
    public abstract String transfer(String uId, String tradeId, BigDecimal amount);
}
