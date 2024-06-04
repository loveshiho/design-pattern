package com.akai.memento.instance;

import java.util.ArrayList;
import java.util.List;

/*表示玩家的状态*/
public class Memento {
    public int money;  // 玩家的金币
    public ArrayList<String> fruits;    // 玩家的水果

    public Memento(int money) {
        this.money = money;
        fruits = new ArrayList<>();
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public List<String> getFruits() {
        // 引用数据类型
        return (List<String>) fruits.clone();
    }

    public void setFruits(ArrayList<String> fruits) {
        this.fruits = fruits;
    }

    // 添加水果
    public void addFruit(String fruit) {
        fruits.add(fruit);
    }

    @Override
    public String toString() {
        return "Memento{" +
                "money=" + money +
                ", fruits=" + fruits +
                '}';
    }
}
