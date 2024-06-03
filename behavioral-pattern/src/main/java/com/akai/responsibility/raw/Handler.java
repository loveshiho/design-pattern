package com.akai.responsibility.raw;

/*抽象处理者类*/
public abstract class Handler {
    // 后续处理者的引用
    protected Handler successor = null;

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    public abstract void handle(String msg);
}
