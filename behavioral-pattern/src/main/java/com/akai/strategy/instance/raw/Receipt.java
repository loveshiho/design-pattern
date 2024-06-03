package com.akai.strategy.instance.raw;

public class Receipt {
    private String msg;
    private String type;

    public Receipt(String msg, String type) {
        this.msg = msg;
        this.type = type;
    }

    public Receipt() {
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
