package com.akai.responsibility.instance.real;

import com.akai.responsibility.instance.raw.AuthInfo;

import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class AuthLink {
    protected AuthLink next;
    protected SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    protected String levelUserId;      // 审核人ID
    protected String levelUserName;   // 审核人姓名

    public AuthLink(String levelUserId, String levelUserName) {
        this.levelUserId = levelUserId;
        this.levelUserName = levelUserName;
    }

    // 获取下一个处理类
    public AuthLink getNext() {
        return next;
    }

    // 责任链中添加处理类
    public AuthLink appendNext(AuthLink next) {
        this.next = next;
        return this;
    }

    // 抽象审核方法
    public abstract AuthInfo doAuth(String uId, String orderId, Date authDate);
}
