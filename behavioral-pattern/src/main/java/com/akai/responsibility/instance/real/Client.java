package com.akai.responsibility.instance.real;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Client {
    public static void main(String[] args) throws Exception {
        AuthLink authLink = new Level3AuthLink("1003", "cao").appendNext(new Level2AuthLink("1002", "shiho")).appendNext(new Level1AuthLink("1001", "haha"));
        SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date currentDate = f.parse("2020-11-18 23:49:46");
        System.out.println(authLink.doAuth("laoli", "11", currentDate));
        AuthService.auth("1003", "11");
        AuthService.auth("1002", "11");
        /*AuthService.auth("1001", "11");*/
        System.out.println(authLink.doAuth("laoli", "11", currentDate));
        /*
        AuthInfo{code='500', info='单号：11  状态：待三级审批负责人 cao '}
        进入审批流程，审批人ID：1003
        审批完成
        进入审批流程，审批人ID：1002
        审批完成
        AuthInfo{code='500', info='单号：11  状态：待一级审批负责人 haha '}
        */
    }
}
