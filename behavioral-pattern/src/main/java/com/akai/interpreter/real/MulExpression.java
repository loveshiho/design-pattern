package com.akai.interpreter.real;

// 乘法运算
public class MulExpression implements AbstractExpression{

    private AbstractExpression exp1;
    private AbstractExpression exp2;

    public MulExpression(AbstractExpression exp1, AbstractExpression exp2) {
        this.exp1 = exp1;
        this.exp2 = exp2;
    }

    /*有递归调用的感觉*/
    @Override
    public long interpret() {
        return exp1.interpret() * exp2.interpret();
    }
}
