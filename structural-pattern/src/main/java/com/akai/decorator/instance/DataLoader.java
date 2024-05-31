package com.akai.decorator.instance;
// 抽象的文件读取接口 DataLoader
/*抽象构件*/
public interface DataLoader {
    String read();
    void write(String data);
}
