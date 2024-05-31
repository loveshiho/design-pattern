package com.akai.adapter.lei;

public class TFCardImpl implements TFCard{
    @Override
    public String readTF() {
        String msg = "tf read";
        return msg;
    }

    @Override
    public void writeTF(String msg) {
        System.out.println("tf write: " + msg);
    }
}
