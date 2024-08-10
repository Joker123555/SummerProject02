package com.itheima.test4;

import java.util.Scanner;

public class PhoneTest {
    public static void main(String[] args) {
        Phone[] arr = new Phone[3];
        int count = 0;
        //用键盘录入获取手机数据
        for (int i = 0; i < arr.length; i++) {
            Phone p = new Phone();
            Scanner sc = new Scanner(System.in);
            //获取手机的品牌
            System.out.println("请输入手机的品牌");
            String brand = sc.next();
            p.setBrand(brand);
            //获取手机的价格
            System.out.println("请输入手机的价格");
            int price = sc.nextInt();
            count=count+price;
            p.setPrice(price);
            //获取手机的颜色
            System.out.println("请输入手机的颜色");
            String color = sc.next();
            p.setColor(color);
            //存入数组中
            arr[i] = p;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].getBrand()+", "+arr[i].getPrice()+", "+arr[i].getColor());
        }
        int avg=count/arr.length;
        System.out.println("三部手机的平均价格为："+avg);
    }
}
