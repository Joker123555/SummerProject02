package com.itheima.petrol;



public class GoldCard extends Card {
    //办理金卡必须cardFound>=5000

    public GoldCard()
    {
        super();
    }

    public GoldCard(int carId, int cardId, String name, String phoneNumber, double cardFound)
    {
        super(carId, cardId, name, phoneNumber, cardFound);
    }

    //金卡支付享受八折优惠
    public double useCard(int found) {
        double cardFound=getCardFound();
        cardFound=cardFound-found*0.8;
        System.out.println("已优惠"+(found-found*0.8)+"元");
        return cardFound;
    }
    //金卡消费满200元可提供打印免费洗车票的服务
    public void printTicket(int found)
    {
        if(found>=200)
        {
            System.out.println("消费成功，请到前台领取洗车票");
        }
        else
        {
            System.out.println("未达到提供洗车服务的标准");
        }
    }
}
