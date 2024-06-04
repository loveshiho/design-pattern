package com.akai.memento.instance;

public class Client {
    public static void main(String[] args) throws Exception{
        Player player = new Player(100);
        // 创建备忘录对象
        Memento memento = player.createMemento();

        for (int i = 0; i < 100; i++) {
            System.out.println(i + "th");
            // 显示当前状态
            System.out.println("当前状态: " + player);
            // 开启游戏
            player.yacht();
            System.out.println("所持有的金钱为: " + player.getMoney() + " 元");
            // 决定如何操作Memento
            if (player.getMoney() > memento.getMoney()) {
                System.out.println("赚到金币，保存当前状态，继续游戏");
                memento = player.createMemento();   // 更新快照
            } else if (player.getMoney() < memento.getMoney() / 2) {
                System.out.println("所持金币不多了，将游戏恢复到初始状态");
                player.restore(memento);
            }
            Thread.sleep(1000);
            System.out.println();
        }
    }
}
