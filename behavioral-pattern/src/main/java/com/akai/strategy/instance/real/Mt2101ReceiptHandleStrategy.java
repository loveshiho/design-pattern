package com.akai.strategy.instance.real;

import com.akai.strategy.instance.raw.Receipt;

public class Mt2101ReceiptHandleStrategy implements ReceiptHandleStrategy{
    @Override
    public void handleReceipt(Receipt receipt) {
        System.out.println("解析报文MT2101: " + receipt.getMsg());
    }
}
