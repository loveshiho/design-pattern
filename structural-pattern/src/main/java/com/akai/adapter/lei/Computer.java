package com.akai.adapter.lei;

public class Computer {
    public String read(SDCard sdCard) {
        String read = sdCard.readSD();
        return read;
    }

    public void write(SDCard sdCard, String msg) {
        sdCard.writeSD(msg);
    }
}
