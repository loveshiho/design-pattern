package com.akai.template.instance;

public class Client {
    public static void main(String[] args) {
        Account a1 = new LoanSevenDays();
        a1.handle("tom", "12345");
        Account a2 = new LoanOneMonth();
        a2.handle("tom", "123456");
    }
}
