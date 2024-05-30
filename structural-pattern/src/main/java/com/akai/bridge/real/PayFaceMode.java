package com.akai.bridge.real;

public class PayFaceMode implements IPayMode{
    @Override
    public boolean security(String uId) {
        System.out.println("人脸识别");
        return true;
    }
}
