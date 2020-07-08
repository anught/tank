package com.anught.tank;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class T {
	public static void main(String[] args) {
		Frame f = new Frame();// 窗口
		f.setSize(800, 600);
		f.setResizable(false);// 不能改变大小
		f.setTitle("TANK WAR");
		f.setVisible(true); // 设置可见
		f.addWindowListener(new WindowAdapter() { // WindowAdapter 实现了 WindowListener 的接口
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				// super.windowClosing(e);
				System.exit(0);
			}
		});

	}
}
