package cn.luvnjoae.jframe;

import javax.swing.*;
import java.awt.*;

/**
 * 通过创建JFrame对象，实现 框架窗口
 */
public class demo1 {
    public static void main(String[] args) {
        JFrame jF = new JFrame("窗体标题"); // 设置窗体对象， 并给出窗体标题
        jF.setVisible(true); // 设置窗体可见

        /**
         * 关闭规则（窗体通用）
         * setDefaultCloseOperation（） 当点击关闭按钮时的发生事件
         *      JFrame.EXIT_ON_CLOSE： 隐藏窗体，并停止程序
         *      JFrame.DO_NOTHING_ON_CLOSE:  无任何操作
         *      JFrame.HIDE_ON_CLOSE:  隐藏窗体，但不停止程序 (默认）
         *      JFrame.DISPOSE_ON_CLOSE:  释放窗体资源
         */
        jF.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        /**
         * 设置窗体的 坐标、 大小， 单位： 像素
         */
        jF.setSize(300, 200); //单独设置 窗体大小
        jF.setLocation(200, 200); //单独设置 坐标
        jF.setBounds(200, 200, 300, 200); // 同时设置窗体的坐标和大小

        jF.setResizable(false); // 设置窗体是否可以改变大小

        int x = jF.getX(); // 获取窗体的横坐标
        int y = jF.getY(); // 获取窗体的纵坐标

        /**
         * 窗体容器 与 容器内部的组件
         *      JFrame不是一个容器，只是一个窗体框架。
         *      对于JFrame，以及JDialog等等，想要添加组件，就需要先获取这个窗体的容器对象Container对象
         *      即： getContentPane对象。
         */
        Container contentPane = jF.getContentPane(); // 获取窗体容器对象
        contentPane.setBackground(Color.white); // 设置容器背景颜色

        JLabel label = new JLabel("这是一个窗体"); // 创建 jlabel对象
        contentPane.add(label); // 将jlabel添加到 容器中
//        contentPane.remove(label); // 从容器中移除 label

        contentPane.validate(); // 验证容器中的组件（相当于刷新），一般在add或remove后
//        jf.setContentPane(contentPane); // 重新载入容器（相当于刷新）（和上一个类似）

    }
}
