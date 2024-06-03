package com.akai.strategy.instance.raw;

import java.util.List;

public class Client {
    public static void main(String[] args) {
        List<Receipt> receiptList = ReceiptBuilder.genReceiptList();
        for (Receipt receipt : receiptList) {
            if ("MT1011".equals(receipt.getType())) {
                System.out.println("接收到MT1011回执");
                System.out.println("解析回执内容");
                System.out.println("执行业务逻辑A" + "\n");
            } else if ("MT2101".equals(receipt.getType())) {
                System.out.println("接收到MT2101回执");
                System.out.println("解析回执内容");
                System.out.println("执行业务逻辑B" + "\n");
            } else if ("MT4101".equals(receipt.getType())) {
                System.out.println("接收到MT4101回执");
                System.out.println("解析回执内容");
                System.out.println("执行业务逻辑C" + "\n");
            } else if ("MT8104".equals(receipt.getType())) {
                System.out.println("接收到MT8104回执");
                System.out.println("解析回执内容");
                System.out.println("执行业务逻辑D");
            }
        }
    }
}
