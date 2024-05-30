package com.akai.builder.way1;

import com.akai.builder.way1.builder.MoBikeBuilder;
import com.akai.builder.way1.director.Director;
import com.akai.builder.way1.product.Bike;

public class Client {
    public static void main(String[] args) {
        /*1 创建指挥者*/
        Director director = new Director(new MoBikeBuilder());
        /*2 建造自行车*/
        Bike bike = director.construct();
        System.out.println(bike);
    }
}
