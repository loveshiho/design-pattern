package com.akai.observer.instance.real;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*事件处理类*/
public class EventManager {

    public enum EventType {
        MQ, Message
    }

    /*监听器集合，使用 map集合表示，key使用枚举类型*/
    private Map<Enum<EventType>, List<EventListener>> listeners = new HashMap<>();

    /*提高程序扩展性*/
    public EventManager(Enum<EventType>... operations) {
        for (Enum<EventType> operation : operations) {
            listeners.put(operation, new ArrayList<>());
        }
    }

    /**
     * 订阅
     *
     * @param eventType 事件类型
     * @param listener  监听
     */
    public void subscribe(Enum<EventType> eventType, EventListener listener) {
        List<EventListener> users = listeners.get(eventType);
        users.add(listener);
    }

    /**
     * 取消订阅
     *
     * @param eventType 事件类型
     * @param listener  监听
     */
    public void unsubscribe(Enum<EventType> eventType, EventListener listener) {
        List<EventListener> users = listeners.get(eventType);
        users.remove(listener);
    }

    /**
     * 通知
     *
     * @param eventType 事件类型
     * @param result    结果
     */
    public void notify(Enum<EventType> eventType, LotteryResult result) {
        List<EventListener> users = listeners.get(eventType);
        for (EventListener listener : users) {
            listener.doEvent(result);
        }
    }
}
