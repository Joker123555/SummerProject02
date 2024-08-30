package com.itheima.demo;

public class SmartHome {
    //设置为单例类
    private static SmartHome smartHome = new SmartHome();

    private SmartHome() {}

    public static SmartHome getInstance() {
        return smartHome;
    }

    public void control(JD jd) {
        //用三目运算符判断一下状态是开还是关
        System.out.println(jd.getName() + "的状态：" +(jd.isStatus()?"开":"关"));
        System.out.println("开始您的操作：");
        jd.press();//按下开关
        System.out.println(jd.getName() + "的状态：" + (jd.isStatus()?"开":"关"));
    }

    public void printAllStatus(JD[] jds) {
        for (int i=0; i<jds.length; i++) {
            //生成的页面要方便阅读
            System.out.println((i+1)+"."+jds[i].getName() + "的状态：" + (jds[i].isStatus()?"开":"关"));
        }
    }
}
