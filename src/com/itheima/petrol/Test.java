package com.itheima.petrol;

import java.util.Objects;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //创建卡
        System.out.println("欢迎使用油卡系统");
        System.out.println("录入");
        Card card = new Card();
        card.setCardId(1);
        System.out.println("请输入姓名:");
        String s = sc.next();
        card.setName(s);
        //充值
        System.out.println("请输入充值金额:");
        card.setCardFound(sc.nextDouble());
        System.out.println("欢迎" + card.getName() + "使用");
        //开始消费
        System.out.println("请输入消费金额:");
        int found = sc.nextInt();
        if (card.getCardFound() >= 5000) {
            System.out.println("您的卡为金卡");
            GoldCard gold = new GoldCard();
            gold.useCard(found);
            gold.printTicket(found);
        } else if (card.getCardFound() >= 2000 && card.getCardFound() < 5000) {
            System.out.println("您的卡为银卡");
            SilverCard silver = new SilverCard();
            silver.useCard(found);
        }
    }
}

