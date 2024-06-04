package com.akai.visitor.instance;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        // 德芙巧克力,生产日期2022-5-1，原价 10元
        Candy candy = new Candy("德芙巧克力", LocalDate.of(2022, 5, 1), 10.0);

        Visitor visitor = new DiscountVisitor(LocalDate.of(2022, 10, 11));
        visitor.visit(candy);
        System.out.println();
        /*List<Product> products = Arrays.asList(
                new Candy("大白兔", LocalDate.of(2022, 8, 1), 10.0),
                new Fruit("香蕉", LocalDate.of(2022, 8, 1), 10.0, 20.0),
                new Wine("波本", LocalDate.of(2022, 8, 1), 10.0)
        );*/

        /*for (Product product : products) {
            visitor.visit(product);
        }*/

        // 模拟添加多个商品
        List<Acceptable> products = Arrays.asList(
                new Candy("大白兔", LocalDate.of(2022, 8, 1), 10.0),
                new Fruit("香蕉", LocalDate.of(2022, 8, 1), 10.0, 20.0),
                new Wine("波本", LocalDate.of(2022, 8, 1), 10.0)
        );

        for (Acceptable product : products) {
            product.accept(visitor);
        }
        /*
        糖果：大白兔
        糖果打折后的价格为：9.˚0
        水果: 香蕉
        超过七天的水果，请勿食用!
        水果价格：0.0
        酒类：波本无折扣
        原价售卖：10.0
        */
    }
}
