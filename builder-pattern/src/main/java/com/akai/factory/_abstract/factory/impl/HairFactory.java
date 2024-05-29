package com.akai.factory._abstract.factory.impl;

import com.akai.factory._abstract.factory.AppliancesFactory;
import com.akai.factory._abstract.product.Freezer;
import com.akai.factory._abstract.product.TV;
import com.akai.factory._abstract.product.impl.HairFreezer;
import com.akai.factory._abstract.product.impl.HairTV;

public class HairFactory implements AppliancesFactory {
    @Override
    public TV createTV() {
        return new HairTV();
    }

    @Override
    public Freezer createFreezer() {
        return new HairFreezer();
    }
}
