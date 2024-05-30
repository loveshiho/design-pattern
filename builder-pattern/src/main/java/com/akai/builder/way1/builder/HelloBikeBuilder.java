package com.akai.builder.way1.builder;

import com.akai.builder.way1.product.Bike;

public class HelloBikeBuilder extends Builder{
    @Override
    public void buildFrame() {
        System.out.println("制作h车架");
        mbike.setFrame("橡胶车架");
    }

    @Override
    public void buildSeat() {
        System.out.println("制作h车座");
        mbike.setSeat("金属车座");
    }

    @Override
    public Bike createBike() {
        return mbike;
    }
}
