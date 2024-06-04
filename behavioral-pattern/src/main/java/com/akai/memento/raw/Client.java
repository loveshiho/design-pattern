package com.akai.memento.raw;

public class Client {
    public static void main(String[] args) {
        // 创建发起人对象
        Originator haha = new Originator("1", "haha", "110");
        System.out.println(haha);
        // 创建负责人对象，并保存备忘录对象
        Caretaker caretaker = new Caretaker();
        caretaker.setMemento(haha.createMemento());
        // 修改
        haha.setId("200");
        System.out.println(haha);
        // 从负责人对象中获取备忘录对象，实现撤销
        haha.restoreMemento(caretaker.getMemento());
        System.out.println(haha);
        /*
        Originator{state='原始对象', id='1', name='haha', phone='110'}
        Originator{state='原始对象', id='200', name='haha', phone='110'}
        Originator{state='备份对象', id='1', name='haha', phone='110'}
        */
    }
}
