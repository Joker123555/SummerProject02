package com.itheima.test3;

import java.util.Scanner;

public class CarTest {
    public static void main(String[] args) {
        //用数组存储3部汽车对象
        Car c1 = new Car();
        Car c2 = new Car();
        Car c3 = new Car();
        Car[] arr = new Car[3];
        //将对象放到数组中
        arr[0] = c1;
        arr[1] = c2;
        arr[2] = c3;
        //键盘录入汽车对象的数据
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入汽车的数据：");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("请输入汽车的品牌：");
            String st1 = sc.next();
            arr[i].setBrand(st1);
            System.out.println("请输入汽车的价格：");
            int str2 = sc.nextInt();
            arr[i].setPrice(str2);
            System.out.println("请输入汽车的颜色：");
            String str3 = sc.next();
            arr[i].setColor(str3);
        }
        for (int i = 0; i < arr.length; i++) {

            System.out.println(arr[i].getBrand()+","+arr[i].getColor()+","+arr[i].getPrice());
        }



    }
}
