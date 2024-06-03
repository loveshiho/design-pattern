package com.akai.observer.instance.real;

public class Client {
    public static void main(String[] args) {
        LotteryService lotteryService = new LotteryServiceImpl();
        LotteryResult result = lotteryService.lotteryAndMsg("loveshiho");
        System.out.println(result);
    }
}
