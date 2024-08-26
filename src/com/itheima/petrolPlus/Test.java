package com.itheima.petrolPlus;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        //创建金卡对象
        Gold gold = new Gold("豫LD9088", "张三", "12345678901", 5000);
        //金卡消费
        pay(gold);
        //创建银卡对象
        Silver silver = new Silver("豫L3V685", "李四", "185775676902", 2000);
        //银卡消费
        pay(silver);

    }

    //支付机，用一个方法来刷卡
    public static void pay(Card card) {
        System.out.println("请刷卡,请您输入当前的消费金额：");
        Scanner in = new Scanner(System.in);
        //输入消费金额
        int money = in.nextInt();
        card.useCard(money);

    }
}
