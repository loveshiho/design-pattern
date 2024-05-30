package com.akai.builder.way1.builder;

import com.akai.builder.way1.product.Bike;

public abstract class Builder {
    protected Bike mbike = new Bike();

    public abstract void buildFrame();
    public abstract void buildSeat();
    public abstract Bike createBike();
}
