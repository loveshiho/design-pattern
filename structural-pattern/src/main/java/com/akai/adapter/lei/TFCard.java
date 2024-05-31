package com.akai.adapter.lei;
/*TF卡接口*/
public interface TFCard {
    // 读取 TF卡方法
    String readTF();
    // 写入 TF卡功能
    void writeTF(String msg);
}
