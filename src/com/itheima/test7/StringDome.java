package com.itheima.test7;

import java.sql.SQLOutput;
import java.util.Scanner;

public class StringDome {
    public static void main(String[] args) {
        //给出正确的用户名和密码
        String rightUsername = "lijin";
        String rightPassword = "123";

       for(int i = 0;i < 3;) {
            //模拟用户登录
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入用户名：");
            String username = sc.next();
            System.out.println("请输入密码：");
            String password = sc.next();

            //判断登录信息是否正确
            //给3次机会
            if (username.equals(rightUsername) && password.equals(rightPassword)) {
                System.out.println("用户登陆成功");
                break;
            } else {
                if(i==2){
                    System.out.println("您的账户被锁定，请联系客服，电话：xxx-xxxxxx");
                }else {
                    System.out.println("用户名或密码输入错误，登陆失败,您还有"+(2-i)+"次机会");
                }
                i++;
            }
        }


    }
}
