package com.akai.visitor.instance;

/*访问者接口，根据入参不同调用对应的重载方法*/
public interface Visitor {
    /*重载方法*/
    void visit(Candy candy);
    void visit(Fruit fruit);
    void visit(Wine wine);
}
