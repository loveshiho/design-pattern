package com.akai.interpreter.real;

public class NumExpression implements AbstractExpression {

    private long num;

    public NumExpression(long num) {
        this.num = num;
    }

    public NumExpression(String num) {
        this.num = Long.parseLong(num);
    }

    @Override
    public long interpret() {
        return this.num;
    }
}
