package com.akai.decorator.raw;
/*抽象装饰类*/
public class Decorator extends Component{
    // 维持一个对抽象构件对象的引用
    private Component component;

    // 注入一个抽象构件类型的对象
    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void operation() {
        // 调用原有业务方法(这里并没有真正实施装饰，而是提供了一个统一的接口，将装饰过程交给子类完成)
        component.operation();
    }
}
