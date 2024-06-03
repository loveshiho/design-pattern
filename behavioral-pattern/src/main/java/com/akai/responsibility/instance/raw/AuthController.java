package com.akai.responsibility.instance.raw;

import java.text.SimpleDateFormat;
import java.util.Date;

public class AuthController {
    // 申请人姓名，申请单ID，申请时间
    /*申请人可以是任意，主要是查看订单审批状态*/
    public AuthInfo doAuth(String name, String orderId, Date authDate) throws Exception {
        /*三级审批*/
        Date date = null;
        // 查询是否存在审核信息，查询条件: 审核人ID + 订单ID，返回 Map集合中的 Date
        date = AuthService.getAuthInfo("1003", orderId);
        // 如果为空，封装 AuthInfo信息 (待审核)返回
        if (date == null) {
            return new AuthInfo("500", "单号：" + orderId, "状态：等待三级审批负责人审批");
        }
        /*二级审核时间双十一之前， 11-01 ~ 11-10号的请求，所以要对传入的审核时间进行判断*/
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        if (authDate.after(simpleDateFormat.parse("2022-10-31 00:00:00")) && authDate.before(simpleDateFormat.parse("2022-11-10 00:00:00"))) {
            // 条件成立，查询二级审核的审核信息
            date = AuthService.getAuthInfo("1002", orderId);
            // 如果为空，封装 AuthInfo信息 (待审核)返回
            if (date == null) {
                return new AuthInfo("500", "单号：" + orderId, "状态：等待二级审批负责人审批");
            }
        }
        /*一级审核，审核范围是在 11-11日 ~ 11-31日*/
        if (authDate.after(simpleDateFormat.parse("2022-11-11 00:00:00")) && authDate.before(simpleDateFormat.parse("2022-11-31 00:00:00"))) {
            // 条件成立，查询二级审核的审核信息
            date = AuthService.getAuthInfo("1001", orderId);
            // 如果为空，封装 AuthInfo信息 (待审核)返回
            if (date == null) {
                return new AuthInfo("500", "单号：" + orderId, "状态：等待一级审批负责人审批");
            }
        }

        return new AuthInfo("200", "单号：" + orderId, "申请人：" + name, "状态：审批完成");
    }
}
