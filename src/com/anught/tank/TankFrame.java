package com.anught.tank;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TankFrame extends Frame {
	int x = 200;
	int y = 200;

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

	@Override
	public void paint(Graphics g) {// 只要窗口动，此方法会重新调用
		x += 10;
		y += 10;

		g.fillRect(x, y, 50, 50);
		System.out.println("ddd");
	}
}
