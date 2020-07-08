package com.anught.tank;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TankFrame extends Frame {
	int x = 200;
	int y = 200;

	public TankFrame() {
		setSize(800, 800);
		setResizable(false);// 不能改变大小
		setTitle("TANK WAR");
		setVisible(true); // 设置可见
		this.addKeyListener(new MyKeyListener());
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

		g.fillRect(x, y, 50, 50);
	}

	class MyKeyListener extends KeyAdapter {

		@Override
		public void keyPressed(KeyEvent e) { // 键盘按下 会调用此方法
			// TODO Auto-generated method stub
			// super.keyPressed(e);
			System.out.println("press");
			x += 100;
			y += 100;

		}

		@Override
		public void keyReleased(KeyEvent e) { // 松开键盘 会调用此方法
			// TODO Auto-generated method stub
			// super.keyReleased(e);
			System.out.println("release");
		}

	}
}
