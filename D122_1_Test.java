package com.bjpowernode.java_learning;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;

public class D122_1_Test {
	public static void main(String[] args) {
		final Frame f = new Frame("Flowlayout");//创建一个名为Flowlayout的窗体
		//设置窗体中的布局管理器为Flowlayout,所有组件左对齐，水平间距为20，垂直间距为30
		f.setLayout(new FlowLayout(FlowLayout.LEFT,20,30));
		f.setSize(220,300);              //设置窗体大小
		f.setLocation(300,200);          //设置窗体显示位置
		f.add(new Button("第一个按钮"));    //把“第一个按钮”添加到f窗体
		f.add(new Button("第二个按钮"));
		f.add(new Button("第三个按钮"));
		f.add(new Button("第四个按钮"));
		f.add(new Button("第五个按钮"));
		f.add(new Button("第六个按钮"));
		f.setVisible(true);
		
	}

}
