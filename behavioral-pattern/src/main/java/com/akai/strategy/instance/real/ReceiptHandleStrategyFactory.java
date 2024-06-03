package com.akai.strategy.instance.real;

import com.akai.strategy.instance.raw.Receipt;

import java.util.HashMap;
import java.util.Map;

/*策略工厂*/
public class ReceiptHandleStrategyFactory {
    public ReceiptHandleStrategyFactory() {
    }

    /*把 if-else替换为 map集合，用字典的方式存储*/
    // 使用 Map集合存储策略信息，彻底消除if...else
    private static Map<String, ReceiptHandleStrategy> strategyMap;

    // 初始化具体策略，保存到 map集合
    public static void init() {
        strategyMap = new HashMap<>();
        /*Receipt中的 type不重要，重要的是：如何形成 type与业务逻辑之间的映射*/
        /*所以这里没有用到 Receipt中的 type属性，因为 map处理了这种映射关系，能够找到对应业务逻辑即可*/
        /*完全开闭原则：使用配置文件 + 反射的形式实现2*/
        strategyMap.put("MT1011", new Mt1011ReceiptHandleStrategy());
        strategyMap.put("MT2101", new Mt2101ReceiptHandleStrategy());
    }

    /*根据回执类型，获取对应的策略对象*/
    public static ReceiptHandleStrategy getStrategy(String type) {
        return strategyMap.get(type);
    }
}
