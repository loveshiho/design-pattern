package com.akai.composite.raw;

public class Leaf extends Component{
    /*叶子节点中不能包含子节点*/
    @Override
    public void add(Component component) {

    }

    @Override
    public void remove(Component component) {

    }

    @Override
    public Component getChild(int i) {
        return null;
    }

    @Override
    public void operation() {

    }
}
