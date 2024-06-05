package com.akai.mediator.raw;

public class ConcreteColleagueB extends Colleague{

    public ConcreteColleagueB(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void exec(String key) {
        System.out.println("在组件 B中，通过中介者执行");
        getMediator().apply(key);
    }
}
