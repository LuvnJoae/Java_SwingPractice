package cn.luvnjoae.jdialog;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * JDialog 在 JFrame中用法
 */
public class demo1 extends JDialog {
    public demo1(JFrame jFrame) {
        /**
         * @param  父窗体对象
         * @param  对话框标题
         * @param  是否阻塞父窗体（无法点击上一级窗口）
         */
        super(jFrame, "对话框标题" , true);

        /**
         * 设置 对话框 窗体的 属性
         */
        this.setBounds(100, 100 , 100, 100); // 设置 对话框 坐标和大小

        Container contentPane = this.getContentPane(); // 获取窗体容器
        contentPane.add(new JLabel("这是一个对话框"));

    }

    public static void main(String[] args) {
        /**
         * 创建父窗体 JFrame窗体
         *      设置相应窗体属性
         */
        JFrame jFrame = new JFrame("父窗体");
        jFrame.setBounds(50, 50, 300, 300);
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);

        /**
         * 获取窗体 容器对象，并通过容器对象，添加 按钮 组件
         */
        Container contentPane = jFrame.getContentPane();
        JButton jButton = new JButton("弹出对话框");
        contentPane.setLayout(new FlowLayout()); // 流式布局（没有这个，按钮会自动填充整个窗体）
        contentPane.add(jButton);  // 向容器中添加 按钮 组件

        /**
         * 给按钮添加一个监听事件 ，即触发动作
         */
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                demo1 demo1 = new demo1(jFrame);
                demo1.setVisible(true); // 在这里设置 对话框窗体可见性
            }
        });

        /**
         * 注意这里，一般setVisible都是放在该窗体的最后的
         *      代码是顺序执行的，因为如果放在前面，后面添加的组件可能会显示不出。
         *
         *      如果setVisible 放在前面，那么可以通过
         *      contentPane.validate() 与 setContentPane(contentPane)方法
         *      刷新该容器，实现组件的显示。
         */
        jFrame.setVisible(true); // 设置窗体可见性。

    }
}
