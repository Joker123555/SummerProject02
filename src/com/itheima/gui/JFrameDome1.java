package com.itheima.gui;

import javax.swing.*;
import java.awt.*;

public class JFrameDome1 {
    public static void main(String[] args) {
        //目标：入门GUI Swing 编程
        //创建一个窗口，窗口上有一个登录按钮
        JFrame jf = new JFrame("登录窗口");//窗口的标题
        //创建一个画布
        JPanel jp = new JPanel();//画布
        jf.add(jp);//将画布添加到窗口中

        JButton jb = new JButton("登录");//按钮
        jp.add(jb);//将按钮添加到窗口中
        jf.setSize(400,300);//设置窗口大小
        jf.setVisible(true);//显示窗口
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);//关闭窗口并且退出程序

    }
}
