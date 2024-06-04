package com.akai.memento.instance;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Player {
    private int money;
    private List<String> fruits = new ArrayList<>();
    private static String[] fruitsName = {    // 表示水果种类的数组
            "苹果", "葡萄", "香蕉", "橘子"
    };
    private Random random = new Random();   // 随机数对象

    public Player(int money) {
        this.money = money;
    }

    // 获取金币
    public int getMoney() {
        return money;
    }

    // 获取水果
    public String getFruit() {
        String prefix = "";
        /*if (random.nextBoolean()) {
            prefix = "好吃的";
        }*/
        // 太混乱了，我们不用
        String f = fruitsName[random.nextInt(fruitsName.length)];
        return prefix + f;
    }

    // 掷骰子游戏
    public void yacht() {
        // [0~5] + 1
        int dice = random.nextInt(6) + 1;   // 掷骰子
        if (dice == 1) {
            money += 100;
            System.out.println("所持有的金钱增加了");
        } else if (dice == 2) {
            money /= 2;
            System.out.println("所持有的金钱减半");
        } else if (dice == 6) {
            String fruit = getFruit();
            System.out.println("获得了水果: " + fruit);
            fruits.add(fruit);
        } else {
            // 骰子结果为3、4、5
            System.out.println("无效数字，继续投掷");
        }
    }

    // 拍摄快照
    public Memento createMemento() {
        Memento memento = new Memento(money);
        for (String fruit : fruits) {
            memento.addFruit(fruit);
        }
        return memento;
    }

    // 恢复方法
    public void restore(Memento memento) {
        this.money = memento.money;
        this.fruits = memento.getFruits();
    }

    @Override
    public String toString() {
        return "Player{" +
                "money=" + money +
                ", fruits=" + fruits +
                '}';
    }
}