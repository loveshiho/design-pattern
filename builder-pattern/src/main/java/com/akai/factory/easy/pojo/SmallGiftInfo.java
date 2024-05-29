package com.akai.factory.easy.pojo;

public class SmallGiftInfo {
    private String userName;              // 用户姓名
    private String userPhone;             // 用户手机
    private String orderId;               // 订单ID
    private String relAddress;            // 收货地址

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getRelAddress() {
        return relAddress;
    }

    public void setRelAddress(String relAddress) {
        this.relAddress = relAddress;
    }

    public SmallGiftInfo() {
    }

    public SmallGiftInfo(String userName, String userPhone, String orderId, String relAddress) {
        this.userName = userName;
        this.userPhone = userPhone;
        this.orderId = orderId;
        this.relAddress = relAddress;
    }

    @Override
    public String toString() {
        return "SmallGiftInfo{" +
                "userName='" + userName + '\'' +
                ", userPhone='" + userPhone + '\'' +
                ", orderId='" + orderId + '\'' +
                ", relAddress='" + relAddress + '\'' +
                '}';
    }
}
