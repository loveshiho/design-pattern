package com.akai.factory._abstract.factory;

import com.akai.factory._abstract.product.Freezer;
import com.akai.factory._abstract.product.TV;

/*抽象工厂：在一个抽象工厂中可以声明多个工厂方法，用于创建不同类型产品*/
public interface AppliancesFactory {
    TV createTV();
    Freezer createFreezer();
}
