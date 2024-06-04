package com.akai.visitor.instance;

import java.time.LocalDate;

/*抽取计价操作*/
public class DiscountVisitor implements Visitor {

    private LocalDate billDate;

    public DiscountVisitor(LocalDate billDate) {
        this.billDate = billDate;
        System.out.println("结算日期：" + billDate);
    }

    @Override
    public void visit(Candy candy) {
        System.out.println("糖果：" + candy.getName());
        // 糖果大于180天，禁止售卖，否则打九折
        long days = billDate.toEpochDay() - candy.getProducedDate().toEpochDay();
        if (days > 180) {
            System.out.println("糖果超过半年，请勿食用");
        } else {
            double v = candy.getPrice() * 0.9;
            System.out.println("糖果打折后的价格为：" + v);
        }
    }

    @Override
    public void visit(Fruit fruit) {
        System.out.println("水果: " + fruit.getName());
        // 获取产品生产天数
        long days = billDate.toEpochDay() - fruit.getProducedDate().toEpochDay();

        double rate = 0;

        if (days > 7) {
            System.out.println("超过七天的水果，请勿食用!");
        } else if (days > 3) {
            rate = 0.5;
        } else {
            rate = 1;
        }

        double discountPrice = fruit.getPrice() * fruit.getWeight() * rate;
        System.out.println("水果价格：" + discountPrice);
    }

    @Override
    public void visit(Wine wine) {
        System.out.println("酒类：" + wine.getName() + "无折扣");
        System.out.println("原价售卖：" + wine.getPrice());
    }
}
