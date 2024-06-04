package com.akai.visitor.instance;

import java.time.LocalDate;

public class Candy extends Product implements Acceptable {
    public Candy(String name, LocalDate producedDate, double price) {
        super(name, producedDate, price);
    }

    @Override
    public void accept(Visitor visitor) {
        // accept实现方法中调用访问者并将自己 "this" 传回，此时 this是一个明确的身份，不存在任何泛型
        // 成功解决了上述问题
        visitor.visit(this);
    }
}
