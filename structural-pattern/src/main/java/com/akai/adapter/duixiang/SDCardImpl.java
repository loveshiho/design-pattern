package com.akai.adapter.duixiang;

/*SD卡实现类*/
public class SDCardImpl implements SDCard {
    @Override
    public String readSD() {
        String msg = "sd read";
        return msg;
    }

    @Override
    public void writeSD(String msg) {
        System.out.println("sd write msg: " + msg);
    }
}
