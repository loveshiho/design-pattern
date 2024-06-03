package com.akai.template.instance;

/*借款七天*/
public class LoanSevenDays extends Account{
    @Override
    public void calculate() {
        System.out.println("无利息");
    }

    @Override
    public void display() {
        System.out.println("七日内借款无利息");
    }
}
