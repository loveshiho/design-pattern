package com.akai.decorator.instance;

public class Client {
    public static void main(String[] args) {
        String info = "hello shiho~";
        DataLoaderDecorator decorator = new EncryptionDataDecorator(new BaseFileDataLoader("instance.txt"));
        decorator.write(info);

        String data = decorator.read();
        System.out.println(data);
    }
}
