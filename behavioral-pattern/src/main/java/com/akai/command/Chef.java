package com.akai.command;

/*厨师类 -> Receiver角色*/
public class Chef {
    public void makeFood(String foodName, int num) {
        System.out.println(num + "份，" + foodName);
    }
}
