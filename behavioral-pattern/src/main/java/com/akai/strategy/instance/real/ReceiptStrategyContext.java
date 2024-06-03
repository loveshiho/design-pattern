package com.akai.strategy.instance.real;

import com.akai.strategy.instance.raw.Receipt;

/*上下文类，持有策略接口*/
public class ReceiptStrategyContext {
    private ReceiptHandleStrategy receiptHandleStrategy;

    public void setReceiptHandleStrategy(ReceiptHandleStrategy receiptHandleStrategy) {
        this.receiptHandleStrategy = receiptHandleStrategy;
    }

    // 调用策略类中的方法
    public void handleReceipt(Receipt receipt) {
        if (receipt != null) {
            receiptHandleStrategy.handleReceipt(receipt);
        }
    }
}
