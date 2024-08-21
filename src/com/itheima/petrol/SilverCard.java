package com.itheima.petrol;

public class SilverCard extends Card {
    public SilverCard()
    {
        super();
    }
    public SilverCard(int carId, int cardId, String name, String phoneNumber, double cardFound)
    {
        super(carId, cardId, name, phoneNumber, cardFound);
    }
    //使用银卡可享受九折优惠
    public double useCard(int found) {
        double cardFound=getCardFound();
        cardFound=cardFound-found*0.9;
        System.out.println("已优惠"+(found-found*0.9)+"元");
        return cardFound;
    }


}
