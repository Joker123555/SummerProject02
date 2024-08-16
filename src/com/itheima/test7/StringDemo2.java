package com.itheima.test7;

import java.util.Scanner;

public class StringDemo2 {
    public static void main(String[] args) {
        //输入字符串
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串：");
        String str = sc.nextLine();
        //计数器
        int bigCount=0;
        int smallCount=0;
        int numberCount=0;
        //遍历字符串
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(c>='a' && c<='z'){
                smallCount++;
            }else if(c>='A' && c<='Z'){
                bigCount++;
            }else if(c>='0' && c<='9'){
                numberCount++;
            }
        }
        System.out.println("大写字母的个数为："+bigCount);
        System.out.println("小写字母的个数为："+smallCount);
        System.out.println("数字的个数为："+numberCount);
    }
}
