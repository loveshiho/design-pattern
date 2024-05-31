package com.akai.adapter.duixiang;

public class Client {
    public static void main(String[] args) {
        Computer computer = new Computer();
        /*String read = computer.read(new SDCardImpl());*/
        String read = computer.read(new SDAdapterTF(new TFCardImpl()));
        System.out.println(read);
        computer.write(new SDAdapterTF(new TFCardImpl()), "computer write data");
    }
}
