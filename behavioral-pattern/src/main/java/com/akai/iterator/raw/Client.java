package com.akai.iterator.raw;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("haha");
        list.add("xixi");
        list.add("ll");
        Iterator<String> iterator = new ConcreteIterator<>(list);
        while (iterator.hasNext()) {
            System.out.println(iterator.currentItem());
            iterator.next();
        }
    }
}
