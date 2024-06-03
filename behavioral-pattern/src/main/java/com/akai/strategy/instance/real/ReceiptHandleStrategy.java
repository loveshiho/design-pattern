package com.akai.strategy.instance.real;

import com.akai.strategy.instance.raw.Receipt;
/*回执处理策略接口*/
public interface ReceiptHandleStrategy {
    void handleReceipt(Receipt receipt);
}
