package com.akai.adapter.lei;

public class Client {
    public static void main(String[] args) {
        Computer computer = new Computer();
        /*String read = computer.read(new SDCardImpl());*/
        String read = computer.read(new SDAdapterTF());
        System.out.println(read);
        computer.write(new SDAdapterTF(), "computer write data");
    }
}
