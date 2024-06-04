package com.akai.visitor.instance;

import java.time.LocalDate;

public class Wine extends Product implements Acceptable {
    public Wine(String name, LocalDate producedDate, double price) {
        super(name, producedDate, price);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
