package com.anught.tank;

public class Main {
	public static void main(String[] args) {
		TankFrame f = new TankFrame();

		new Thread(() -> {
			while (true) {
				f.repaint();
				try {
					Thread.sleep(50);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}).start();
		;

	}
}
