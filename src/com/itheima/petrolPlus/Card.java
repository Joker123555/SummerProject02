package com.itheima.petrolPlus;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//lombok 自动生成getter setter toString和无参构造方法和有参
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Card {
    private String carId;//车牌号码
    private String name;
    private String phoneNumber;
    private double money;

    //消费金额
    public void useCard(int money) {
        this.money -= money;

    }

    //预存金额
    public void recharge(int money) {
        this.money += money;
    }

}
