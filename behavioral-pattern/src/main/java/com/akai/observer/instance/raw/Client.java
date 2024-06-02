package com.akai.observer.instance.raw;

public class Client {
    public static void main(String[] args) {
        LotteryService lotteryService = new LotteryServiceImpl();
        LotteryResult result = lotteryService.lottery("loveshiho");
        System.out.println(result);
    }
}
