package com.akai.mediator.instance;

public class MediatorStructure extends Mediator{
    // 中介知晓房主和租房者的信息
    private HouseOwner houseOwner;
    private Tenant tenant;

    public HouseOwner getHouseOwner() {
        return houseOwner;
    }

    public void setHouseOwner(HouseOwner houseOwner) {
        this.houseOwner = houseOwner;
    }

    public Tenant getTenant() {
        return tenant;
    }

    public void setTenant(Tenant tenant) {
        this.tenant = tenant;
    }

    @Override
    public void contact(String message, Person person) {
        // 如果是房主联系
        // 如果是房主，则租房者获得信息
        if (person == houseOwner) {
            tenant.getMessage(message);
        } else {    // 如果是租房者则获取房主信息
            houseOwner.getMsg(message);
        }
    }
}
