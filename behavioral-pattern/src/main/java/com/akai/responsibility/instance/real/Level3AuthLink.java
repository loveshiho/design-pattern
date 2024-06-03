package com.akai.responsibility.instance.real;

import com.akai.responsibility.instance.raw.AuthInfo;

import java.util.Date;

public class Level3AuthLink extends AuthLink {

    private Date beginDate = f.parse("2020-11-01 00:00:00");
    private Date endDate = f.parse("2020-11-10 23:59:59");

    public Level3AuthLink(String levelUserId, String levelUserName) throws Exception {
        super(levelUserId, levelUserName);
    }

    @Override
    public AuthInfo doAuth(String uId, String orderId, Date authDate) {
        Date date = AuthService.getAuthInfo(levelUserId, orderId);
        if (date == null) {
            return new AuthInfo("500", "单号：" + orderId, " 状态：待三级审批负责人 " + levelUserName);
        }
        if (getNext() == null) {
            return new AuthInfo("200", "单号：" + orderId, " 状态：三级审核完成 " + levelUserName);
        }
        return getNext().doAuth(uId, orderId, authDate);
    }
}
