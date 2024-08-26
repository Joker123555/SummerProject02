package com.itheima.petrolPlus;

public class Silver extends Card{
    public Silver()
    {
        super();
    }

    public Silver(String cardId, String name, String phoneNumber, double cardFound)
    {
        super(cardId, name, phoneNumber, cardFound);
    }

    @Override
    public void useCard(int money) {
        //银卡消费打9折
        System.out.println("您本次消费金额为：" + money);
        System.out.println("您优惠后的消费金额为：" + money* 0.9);
        //判断余额是否充足
        if (getMoney() < money* 0.9)
        {
            System.out.println("您的余额不足，请充值！");
            return;
        }
        //银卡消费后余额减少
        setMoney(getMoney() - money* 0.9);
        System.out.println("您当前余额为：" + getMoney());
    }
}
