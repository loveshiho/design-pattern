package com.akai.interpreter.real;

// 除法运算
public class DivExpression implements AbstractExpression{

    private AbstractExpression exp1;
    private AbstractExpression exp2;

    public DivExpression(AbstractExpression exp1, AbstractExpression exp2) {
        this.exp1 = exp1;
        this.exp2 = exp2;
    }

    /*有递归调用的感觉*/
    @Override
    public long interpret() {
        return exp1.interpret() / exp2.interpret();
    }
}
