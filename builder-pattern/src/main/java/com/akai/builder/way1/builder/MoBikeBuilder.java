package com.akai.builder.way1.builder;

import com.akai.builder.way1.product.Bike;

public class MoBikeBuilder extends Builder{
    @Override
    public void buildFrame() {
        System.out.println("制作m车架");
        mbike.setFrame("铝合金车架");
    }

    @Override
    public void buildSeat() {
        System.out.println("制作m车座");
        mbike.setSeat("真皮车座");
    }

    @Override
    public Bike createBike() {
        return mbike;
    }
}
