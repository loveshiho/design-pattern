package com.akai.decorator.instance;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class EncryptionDataDecorator extends DataLoaderDecorator {

    public EncryptionDataDecorator(DataLoader dataLoader) {
        super(dataLoader);
    }

    @Override
    public String read() {
        return decode(super.read());
    }

    private String decode(String data) {
        Base64.Decoder decoder = Base64.getDecoder();
        byte[] decode = decoder.decode(data.getBytes(StandardCharsets.UTF_8));
        /*String的构造函数*/
        String res = new String(decode);
        return res;
    }

    @Override
    public void write(String data) {
        super.write(encode(data));
    }

    private String encode(String data) {
        Base64.Encoder encoder = Base64.getEncoder();
        String res = encoder.encodeToString(data.getBytes(StandardCharsets.UTF_8));
        return res;
    }
}
