package com.akai.interpreter.real;

// 加法运算
public class PluExpression implements AbstractExpression{

    private AbstractExpression exp1;
    private AbstractExpression exp2;

    public PluExpression(AbstractExpression exp1, AbstractExpression exp2) {
        this.exp1 = exp1;
        this.exp2 = exp2;
    }

    @Override
    public long interpret() {
        return exp1.interpret() + exp2.interpret();
    }
}
