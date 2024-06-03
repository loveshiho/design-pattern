package com.akai.template.raw;

public class Client {
    public static void main(String[] args) {
        AbstractClassTemplate classTemplate = new ConcreteClassA();
        classTemplate.run("x");
    }
}
