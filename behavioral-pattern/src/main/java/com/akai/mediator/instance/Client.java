package com.akai.mediator.instance;

public class Client {
    public static void main(String[] args) {
        // 中介
        MediatorStructure mediator = new MediatorStructure();
        // 房主
        HouseOwner owner = new HouseOwner("张三", mediator);
        Tenant tenant = new Tenant("李四", mediator);
        mediator.setHouseOwner(owner);
        mediator.setTenant(tenant);
        tenant.contact("两室一厅，房租4000");
        owner.contact("一室一厅，1000便宜租了");
    }
}
