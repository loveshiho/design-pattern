package com.akai.singleton.demo4;

public class Singleton04 {
    private Singleton04() {
        if (SingletonHandler.instance != null) throw new RuntimeException("fucking fucked");
    }
    private static class SingletonHandler {
        private static Singleton04 instance = new Singleton04();
    }

    public static Singleton04 getInstance() {
        return SingletonHandler.instance;
    }
}
