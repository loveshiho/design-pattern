package com.akai.composite.instance;

/*抽象根结点*/
public abstract class Entry {
    public abstract String getName();   /*获取文件名*/

    public abstract int getSize();      /*获取文件大小*/

    // 添加文件夹或文件
    public abstract Entry add(Entry entry);

    // 显示指定目录下的所有信息
    public abstract void printList(String prefix);

    @Override
    public String toString() {
        return getName() + "(" + getSize() + ")";
    }
}
