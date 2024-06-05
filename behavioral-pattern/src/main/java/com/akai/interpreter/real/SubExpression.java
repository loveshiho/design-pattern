package com.akai.interpreter.real;

// 减法运算
public class SubExpression implements AbstractExpression{

    private AbstractExpression exp1;
    private AbstractExpression exp2;

    public SubExpression(AbstractExpression exp1, AbstractExpression exp2) {
        this.exp1 = exp1;
        this.exp2 = exp2;
    }

    @Override
    public long interpret() {
        return exp1.interpret() - exp2.interpret();
    }
}
