package com.itheima.singleinstance;

public class demo1 {
    //单例类：
    //1.私有化静态方法
    //2.私有化构造方法
    //3.私有化静态变量
    //4.提供共有的静态方法
    //5.提供共有的静态方法
    //饿汉式：线程安全，但浪费内存

    private static demo1 d = new demo1();

    private demo1() {

    }

    public static demo1 getInstance() {
        return d;
    }

    public void demo1() {
        System.out.println("单例类");
    }
}
