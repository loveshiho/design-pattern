package com.akai.responsibility.instance.raw;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Client {
    public static void main(String[] args) throws Exception {
        AuthController authController = new AuthController();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = sdf.parse("2022-11-12 00:00:00");
        AuthInfo info = authController.doAuth("shiho", "11", date);
        System.out.println(info);
        /*模拟审批操作*/
        AuthService.auth("1001", "11");
        AuthService.auth("1002", "11");
        AuthService.auth("1003", "11");
        AuthInfo info2 = authController.doAuth("conan", "11", date);
        System.out.println(info2);

        /*
        AuthInfo{code='500', info='单号：11 状态：等待三级审批负责人审批 '}
        进入审批流程，审批人ID：1001
        审批完成
        进入审批流程，审批人ID：1002
        审批完成
        进入审批流程，审批人ID：1003
        审批完成
        AuthInfo{code='200', info='单号：11 申请人：conan 状态：审批完成 '}
        */
    }
}
