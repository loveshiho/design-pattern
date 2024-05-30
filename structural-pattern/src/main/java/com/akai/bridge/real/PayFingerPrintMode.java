package com.akai.bridge.real;

public class PayFingerPrintMode implements IPayMode{
    @Override
    public boolean security(String uId) {
        System.out.println("指纹支付");
        return true;
    }
}
