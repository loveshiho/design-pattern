package com.akai.composite.raw;

import java.util.ArrayList;
import java.util.List;

/*树枝节点
* 容器对象，既可以包含树枝节点也可以包含叶子节点
* */
public class Composite extends Component{

    /*定义集合属性，保存子节点数据*/
    private List<Component> list = new ArrayList<>();

    @Override
    public void add(Component component) {
        list.add(component);
    }

    @Override
    public void remove(Component component) {
        list.remove(component);
    }

    @Override
    public Component getChild(int i) {
        return list.get(i);
    }

    /*具体业务方法*/
    @Override
    public void operation() {
        /*递归调用其它节点中的operation方法*/
        for (Component component : list) {
            component.operation();
        }
    }
}
