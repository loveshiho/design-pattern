package com.akai.prototype.water;

/*cloneable标识接口，表示当前类对象可复制*/
public class ConcretePrototype implements Cloneable{

    private Person person;

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public ConcretePrototype() {
        System.out.println("invoke");
    }

    @Override
    protected ConcretePrototype clone() throws CloneNotSupportedException {
        System.out.println("water clone");
        return (ConcretePrototype)super.clone();
    }

    public void show() {
        System.out.println(person);
    }
}
