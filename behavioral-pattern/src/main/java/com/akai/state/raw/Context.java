package com.akai.state.raw;

/*上下文类*/
public class Context {
    /*状态对象的引用*/
    private State curState;

    public Context() {
    }

    public Context(State curState) {
        this.curState = curState;
    }

    public State getCurState() {
        return curState;
    }

    public void setCurState(State curState) {
        this.curState = curState;
    }

    @Override
    public String toString() {
        return "Context{" +
                "curState=" + curState +
                '}';
    }
}
