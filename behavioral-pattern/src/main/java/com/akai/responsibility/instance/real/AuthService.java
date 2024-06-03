package com.akai.responsibility.instance.real;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/*模拟审核服务*/
/*提供执行审核、查询审核结果服务*/
public class AuthService {
    // 审批信息 key: 审批人Id + 申请单Id, value: 审批时间
    private static Map<String, Date> authMap = new HashMap<String, Date>();

    /*审核流程*/
    /*审核业务方法*/
    public static void auth(String uId, String orderId) {
        System.out.println("进入审批流程，审批人ID：" + uId);
        authMap.put(uId + orderId, new Date());
        System.out.println("审批完成");
    }

    // 查询审核结果
    /*审批时间作为审批结果，能查到即完成审批*/
    public static Date getAuthInfo(String uId, String orderId) {
        return authMap.get(uId + orderId);
    }
}
