package com.akai.flyweight.raw;

public class Client {
    public static void main(String[] args) {
        FlyweightFactory factory = new FlyweightFactory();
        Flyweight a1 = factory.getFlyweight("A");
        Flyweight a2 = factory.getFlyweight("A");
        System.out.println(a1 == a2);
        /*享元池中存在，直接复用，key: A
        享元池中存在，直接复用，key: A
        true*/
    }
}
