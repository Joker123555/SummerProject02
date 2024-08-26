package com.itheima.petrolPlus;

public class Gold extends Card{
    public Gold()
    {
        super();
    }
    public Gold(String cardId, String name, String phoneNumber, double cardFound)
    {
        super(cardId, name, phoneNumber, cardFound);
    }
    @Override
    public void useCard(int money)
    {
        //金卡消费有8折
        System.out.println("您消费金额为：" +money);
        System.out.println("您优惠后的消费金额为："+money*0.8);
        //判断余额是否充足
        if(getMoney()<money*0.8)
        {
            System.out.println("您的余额不足，请充值");
            return;//干掉方法！
        }

        //金卡消费后，余额减少
        setMoney(getMoney()-money*0.8);
        System.out.println("您当前余额为："+getMoney());
        //金卡消费满200元送一张洗车券
        if(money*0.8>=200)
        {
            printTicket();
        }else {
            System.out.println("您消费未满200元，没有送洗车券");
        }
    }
    public void printTicket()
    {
        System.out.println("您消费满200元，送一张洗车券");
    }
}
