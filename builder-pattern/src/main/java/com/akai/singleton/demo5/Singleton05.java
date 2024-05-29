package com.akai.singleton.demo5;

/*
* 阻止反射的破坏：在反射方法中不允许使用反射创建枚举对象
* 阻止序列化的破坏：列化的时候 Java仅仅是将枚举对象的 name属性输到结果中，反序列化的时候则是通过 Enum的 valueOf()方法来根据名字查找枚举对象
* */
public enum Singleton05 {
    INSTANCE;

    private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static Singleton05 getInstance() {
        return INSTANCE;
    }
}
