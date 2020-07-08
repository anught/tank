package com.anught.tank;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TankFrame extends Frame {
	public TankFrame() {
		setSize(800, 600);
		setResizable(false);// 不能改变大小
		setTitle("TANK WAR");
		setVisible(true); // 设置可见
		addWindowListener(new WindowAdapter() { // WindowAdapter 实现了 WindowListener 的接口
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				// super.windowClosing(e);
				System.exit(0);
			}
		});
	}
}
