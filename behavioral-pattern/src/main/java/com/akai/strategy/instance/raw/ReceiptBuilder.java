package com.akai.strategy.instance.raw;

import java.util.ArrayList;
import java.util.List;

public class ReceiptBuilder {
    public static List<Receipt> genReceiptList() {
        List<Receipt> list = new ArrayList<>();
        list.add(new Receipt("MT1101回执", "MT1011"));
        list.add(new Receipt("MT2101回执", "MT2101"));
        list.add(new Receipt("MT4101回执", "MT4101"));
        list.add(new Receipt("MT8104回执", "MT8104"));
        return list;
    }
}
