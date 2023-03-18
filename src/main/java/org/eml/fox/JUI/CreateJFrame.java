package org.eml.fox.JUI;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class CreateJFrame {

    /**
     * 创建UI
     * @author xiaoxing
     * @param width
     * @param height
     */
    //TODO 创建UI
    public static void main(int width,int height) {
        //初始化
        JFrame jframe = new JFrame();

        JLabel jlabel = new JLabel();

        //List list = new ArrayList();

        //设置窗口是否可见
        jframe.setVisible(true);
        jlabel.setVisible(true);
        //设置窗口颜色
        jframe.setBackground(Color.white);
        //设置窗口大小
        jframe.setSize(width,height);
        //设置窗口图标
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Image icon = toolkit.getImage("org.eml.fox.util.images.Icon.jpg");
        jframe.setIconImage(icon);
        //设置窗口名字
        jframe.setTitle("魔影我的世界启动器");
    }
}
