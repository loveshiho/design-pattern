package com.akai.factory.easy;

import com.akai.factory.easy.controller.DeliverController;
import com.akai.factory.easy.pojo.AwardInfo;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

public class TestEasy {
    DeliverController deliverController = new DeliverController();

    @Test
    void test1() {
        // 1 发放打折券优惠
        AwardInfo info = new AwardInfo();
        info.setUid("1001");
        info.setAwardType(1);
        info.setAwardNumber("DEL12345");

        deliverController.awardToUser(info);
    }

    @Test
    void test2() {
        /*优酷会员*/
        AwardInfo info = new AwardInfo();
        info.setUid("1002");
        info.setAwardType(2);
        info.setAwardNumber("DW12345");
        Map<String, String> map = new HashMap<>();
        map.put("phone", "13512341234");
        info.setExtMap(map);

        deliverController.awardToUser(info);
    }

    @Test
    void test3() {
        /*小礼品*/
        AwardInfo info = new AwardInfo();
        info.setUid("1003");
        info.setAwardType(3);
        info.setAwardNumber("SM12345");
        Map<String, String> map = new HashMap<>();
        map.put("username", "大远");
        map.put("phone", "13512341234");
        map.put("address", "北京天安门");
        info.setExtMap(map);

        deliverController.awardToUser(info);
    }
}
