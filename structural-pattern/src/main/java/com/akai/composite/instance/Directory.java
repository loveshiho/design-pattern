package com.akai.composite.instance;

import java.util.ArrayList;
import java.util.List;

public class Directory extends Entry {

    private String name;
    private List<Entry> list = new ArrayList<>();

    public Directory(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
        int size = 0;
        for (Entry entry : list) {
            size += entry.getSize();
        }
        return size;
    }

    @Override
    public Entry add(Entry entry) {
        list.add(entry);
        return this;
    }

    @Override
    public void printList(String prefix) {
        System.out.println(prefix + "/" + this);
        for (Entry entry : list) {
            entry.printList(prefix + "/" + name);
        }
    }
}
