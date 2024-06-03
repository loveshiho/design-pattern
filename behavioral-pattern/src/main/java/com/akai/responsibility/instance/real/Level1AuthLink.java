package com.akai.responsibility.instance.real;

import com.akai.responsibility.instance.raw.AuthInfo;

import java.util.Date;

public class Level1AuthLink extends AuthLink {

    private Date beginDate = f.parse("2020-11-11 00:00:00");
    private Date endDate = f.parse("2020-11-31 23:59:59");

    public Level1AuthLink(String levelUserId, String levelUserName) throws Exception {
        super(levelUserId, levelUserName);
    }

    @Override
    public AuthInfo doAuth(String uId, String orderId, Date authDate) {
        Date date = AuthService.getAuthInfo(levelUserId, orderId);
        if (authDate.after(beginDate) && authDate.before(endDate)) {
            if (date == null) {
                return new AuthInfo("500", "单号：" + orderId, " 状态：待一级审批负责人 " + levelUserName);
            }
            if (getNext() == null) {
                return new AuthInfo("200", "单号：" + orderId, " 状态：一级审核完成 " + levelUserName);
            }
            return getNext().doAuth(uId, orderId, authDate);
        } else {
            return new AuthInfo("200", "单号：" + orderId, " 状态：一级审核完成 " + levelUserName);
        }
    }
}
