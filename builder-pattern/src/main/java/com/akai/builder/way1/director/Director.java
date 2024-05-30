package com.akai.builder.way1.director;

import com.akai.builder.way1.builder.Builder;
import com.akai.builder.way1.product.Bike;

public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public Bike construct() {
        builder.buildFrame();
        builder.buildSeat();
        return builder.createBike();
    }
}
