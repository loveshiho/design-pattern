package com.akai.decorator.raw;

public class ConcreteComponent extends Component{
    @Override
    public void operation() {
        /*实现基础功能*/
        /*复杂功能通过装饰类进行拓展*/
        System.out.println("operation");
    }
}
