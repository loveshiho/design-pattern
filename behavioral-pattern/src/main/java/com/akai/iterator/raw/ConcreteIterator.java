package com.akai.iterator.raw;

import java.util.List;

public class ConcreteIterator<E> implements Iterator<E> {

    private int cursor;
    // 容器
    private List<E> list;

    public ConcreteIterator(List<E> list) {
        cursor = 0;
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        return cursor < list.size();
    }

    @Override
    public void next() {
        cursor++;
    }

    @Override
    public E currentItem() {
        if (!(cursor < list.size())) {
            throw new IndexOutOfBoundsException();
        }
        return list.get(cursor);
    }
}
