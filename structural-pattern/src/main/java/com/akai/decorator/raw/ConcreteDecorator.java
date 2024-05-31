package com.akai.decorator.raw;

public class ConcreteDecorator extends Decorator{

    public ConcreteDecorator(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        super.operation();
        addOperation();
    }

    public void addOperation() {
        System.out.println("addOperation");
    }
}
