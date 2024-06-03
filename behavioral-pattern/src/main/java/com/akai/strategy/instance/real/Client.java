package com.akai.strategy.instance.real;

import com.akai.strategy.instance.raw.Receipt;

import java.util.List;

public class Client {
    public static void main(String[] args) {
        List<Receipt> receipts = ReceiptBuilder.genReceiptList();
        /*获取 context*/
        ReceiptStrategyContext context = new ReceiptStrategyContext();
        ReceiptHandleStrategyFactory.init();
        // 🌟策略模式最主要的工作：策略模式将策略的 定义、创建、使用这三部分进行了解耦
        for (Receipt receipt : receipts) {
            // 获取策略
            ReceiptHandleStrategy strategy = ReceiptHandleStrategyFactory.getStrategy(receipt.getType());
            // 设置策略
            context.setReceiptHandleStrategy(strategy);
            // 执行策略
            context.handleReceipt(receipt);
        }
    }
}
