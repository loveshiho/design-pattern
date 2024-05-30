package com.akai.prototype.water;

public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        ConcretePrototype c1 = new ConcretePrototype();
        Person person = new Person("shiho");
        c1.setPerson(person);
        ConcretePrototype c2 = c1.clone();
        System.out.println(c1.getPerson().hashCode());
        System.out.println(c2.getPerson().hashCode());
        System.out.println("-----------");
        c2.getPerson().setName("conan");
        System.out.println(person.getName());
    }
}
