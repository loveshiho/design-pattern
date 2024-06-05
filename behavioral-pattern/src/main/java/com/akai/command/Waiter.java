package com.akai.command;

import java.util.ArrayList;
import java.util.List;

// 服务员：invoker
public class Waiter {
    // 服务员有多种指令，上菜的、收拾桌子的
    // 这样便实现了解耦合，让指令发出者同指令接收者解耦合
    // 指令发出者面向指令调用，耦合指令接口，去耦合抽象，而不是耦合具体，然后由具体的指令实现去传达指令给指令接收者
    // 将指令本身和接收者封装成一个对象
    private List<Command> commands;

    public Waiter() {
        commands = new ArrayList<>();
    }

    public Waiter(List<Command> commands) {
        this.commands = commands;
    }

    public void setCommand(Command command) {
        commands.add(command);
    }

    // 发出指令
    public void orderUp() {
        System.out.println("服务员: 叮咚，有新的订单，请厨师开始制作");
        for (Command command : commands) {
            if (command != null) {
                command.execute();
            }
        }
    }
}
