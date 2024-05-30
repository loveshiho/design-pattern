package com.akai.bridge.real;

public interface IPayMode {
    // 安全校验功能: 对各种支付模式进行风控校验
    boolean security(String uId);
}
