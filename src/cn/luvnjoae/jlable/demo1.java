package cn.luvnjoae.jlable;

import javax.swing.*;
import java.awt.*;

public class demo1 extends JFrame {
    public demo1() {
        /**
         * JFrame的窗体属性
         */
        this.setBounds(200, 200, 300,300);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle("标签的使用");
        this.setVisible(true);

        Container contentPane = this.getContentPane(); // 获取容器对象
        contentPane.setLayout(new FlowLayout()); // 流式布局

        JLabel jLabel = new JLabel("这是一个标签");
//        jLabel.setText("更改标签内容"); // 更改内容
//        System.out.println(jLabel.getText()); // 获取JLable内容\
        jLabel.setFont(new Font("楷体", Font.BOLD, 15));

        contentPane.add(jLabel); // 添加组件进容器

        this.setContentPane(contentPane); // 刷新容器
    }

    public static void main(String[] args) {
        new demo1();
    }
}
