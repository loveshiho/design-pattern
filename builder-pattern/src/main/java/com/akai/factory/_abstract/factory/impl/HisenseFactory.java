package com.akai.factory._abstract.factory.impl;

import com.akai.factory._abstract.factory.AppliancesFactory;
import com.akai.factory._abstract.product.Freezer;
import com.akai.factory._abstract.product.TV;
import com.akai.factory._abstract.product.impl.HisenseFreezer;
import com.akai.factory._abstract.product.impl.HisenseTV;

public class HisenseFactory implements AppliancesFactory {
    @Override
    public TV createTV() {
        return new HisenseTV();
    }

    @Override
    public Freezer createFreezer() {
        return new HisenseFreezer();
    }
}
