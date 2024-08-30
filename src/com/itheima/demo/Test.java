package com.itheima.demo;

import javax.imageio.plugins.tiff.ExifTIFFTagSet;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        //目标：创建一个智能家居系统
        //1.家具有吊灯，电视，空调，冰箱
        //具体的功能，开和关
        //2.创建一个父类作为模板
        //3.创建对应的家具子类
        //4.将所有的家电对象放到数组中
        JD[] jds = new JD[4];
        jds[0] = new Lamp("LED灯", true);
        jds[1] = new TV("小米电视", false);
        jds[2] = new Air("美的空调", true);
        jds[3] = new Ref("海尔冰箱", false);

        //设计一个接口控制这些家电的开和关
        //5.创建智能控制系统对象，控制着些设备开和关
        //只需要一个对象，将SmartHome设置为单例类
        SmartHome smartHome=SmartHome.getInstance();
        //生成一个页面，让用户可供选择操作: a.将所有设备打印出来 b.让用户选择设备进行操作
        System.out.println("=======欢迎使用智能家居系统=======");
        //设计一个方法打印所有设备的开和关现状
        smartHome.printAllStatus(jds);
        //用一个死循环，让用户能持续操作

        while (true) {
            //让用户选择设备进行操作
            Scanner sc = new Scanner(System.in);
            System.out.println("请选择设备进行操作：");
            String choose = sc.next();
            //用switch语句进行选择
            switch (choose) {
                case "1":
                    smartHome.control(jds[0]);
                    break;
                case "2":
                    smartHome.control(jds[1]);
                    break;
                case "3":
                    smartHome.control(jds[2]);
                    break;
                case "4":
                    smartHome.control(jds[3]);
                    break;
                case "exit":
                    System.out.println("退出系统");
                    return;//结束方法
                default:
                    System.out.println("输入有误，请重新输入");


                    System.out.println("=======操作完毕=======");
            }
        }
        //控制电视机
//        smartHome.control(jds[0]);


    }
}
