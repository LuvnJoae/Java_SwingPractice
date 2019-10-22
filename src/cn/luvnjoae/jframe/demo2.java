package cn.luvnjoae.jframe;

import javax.swing.*;
import java.awt.*;

/**
 * 通过继承JFrame类，实现窗体
 */
public class demo2 extends JFrame {
    public demo2(){

        this.setVisible(true); // 设置窗体可见
        this.setTitle("窗体标题"); // 设置窗体标题

        /**
         * 关闭规则
         * setDefaultCloseOperation（） 当点击关闭按钮时的发生事件
         *      JFrame.EXIT_ON_CLOSE： 隐藏窗体，并停止程序
         *      JFrame.DO_NOTHING_ON_CLOSE:  无任何操作
         *      JFrame.HIDE_ON_CLOSE:  隐藏窗体，但不停止程序 (默认）
         *      JFrame.DISPOSE_ON_CLOSE:  释放窗体资源
         */
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        /**
         * 设置窗体的 坐标、 大小， 单位： 像素
         */
        this.setSize(300, 200); //单独设置 窗体大小
        this.setLocation(200, 200); //单独设置 坐标
        this.setBounds(200, 200, 300, 200); // 同时设置窗体的坐标和大小

        /**
         * 窗体容器 与 容器内部的组件
         */
        Container contentPane = this.getContentPane(); // 获取窗体容器
        contentPane.setBackground(Color.white); // 设置窗体容器背景颜色

        JLabel label = new JLabel("这是一个窗体"); // 创建 jlabel对象
        contentPane.add(label); // 将jlabel添加到 容器种
//        contentPane.remove(label); // 从容器种移除 label

        contentPane.validate(); // 验证容器中的组件（相当于刷新），一般在add或remove后
//        this.setContentPane(contentPane); // 重新载入容器（相当于刷新）（和上一个类似）

        this.setResizable(false); // 设置窗体是否可以改变大小

        int x = this.getX(); // 获取窗体的横坐标
        int y = this.getY(); // 获取窗体的纵坐标
    }

    public static void main(String[] args) {
        new demo2();
    }
}
