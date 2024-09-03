package com.itheima;

public class stringDemo1 {
    public static void main(String[] args) {
        //目标：生成随机验证码
        String code = getCode(6);
        System.out.println(code);
        System.out.println(getCode(7));
    }
    //验证码中包含大写字母、小写字母、数字，随机生成
    public static String getCode(int n){
        String code = "";
        //可以用String来实现
        String data = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        for (int i = 0; i < n; i++) {
            int index = (int)(Math.random()*data.length());
            //获取字符
            char ch = data.charAt(index);
            //拼接字符串
            code += ch;
        }
        return code;

    }
}
