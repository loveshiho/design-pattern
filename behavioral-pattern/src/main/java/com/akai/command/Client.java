package com.akai.command;

import java.util.HashMap;
import java.util.Map;

public class Client {
    public static void main(String[] args) {
        Order order = new Order();
        order.setDiningTable(10);
        Map<String, Integer> menu = new HashMap<>();
        menu.put("西红柿鸡蛋", 4);
        menu.put("炒面", 2);
        menu.put("蒸蛋", 3);
        order.setFoodMenu(menu);
        // 创建接收者
        Chef chef = new Chef();
        // 将订单和接收者封装成命令对象
        OrderCommand command = new OrderCommand(chef, order);
        // 创建调用者
        Waiter waiter = new Waiter();
        waiter.setCommand(command);
        // 上菜
        waiter.orderUp();
    }
}
