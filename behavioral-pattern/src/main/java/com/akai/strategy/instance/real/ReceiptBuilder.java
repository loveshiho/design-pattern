package com.akai.strategy.instance.real;

import com.akai.strategy.instance.raw.Receipt;

import java.util.ArrayList;
import java.util.List;

public class ReceiptBuilder {
    public static List<Receipt> genReceiptList() {
        List<Receipt> list = new ArrayList<>();
        list.add(new Receipt("MT1101回执", "MT1011"));
        list.add(new Receipt("MT2101回执", "MT2101"));
        return list;
    }
}
