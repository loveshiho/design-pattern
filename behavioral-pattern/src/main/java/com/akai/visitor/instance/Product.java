package com.akai.visitor.instance;

import java.time.LocalDate;

public abstract class Product {
    private String name;  // 商品名
    private LocalDate producedDate;  // 生产日期
    private double price;  // 单品价格

    public Product(String name, LocalDate producedDate, double price) {
        this.name = name;
        this.producedDate = producedDate;
        this.price = price;
    }

    public Product() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getProducedDate() {
        return producedDate;
    }

    public void setProducedDate(LocalDate producedDate) {
        this.producedDate = producedDate;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
