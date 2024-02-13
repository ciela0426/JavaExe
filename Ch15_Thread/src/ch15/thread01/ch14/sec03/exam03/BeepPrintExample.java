package ch15.thread01.ch14.sec03.exam03;

import java.awt.Toolkit;

public class BeepPrintExample {
	// 
	public static void main(String[] args) {
		// main thread (주인)가 work thread (알바)를 고용
		Thread thread = new Thread() {
			
			// 알바생이 해야할 일
			@Override
			public void run() {
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				for (int i = 0; i < 5; i++) {
					toolkit.beep();
					try {Thread.sleep(500);} catch (Exception e) {}
				}
			}
		};
		
		// worker thread(알바) 일 시작
		thread.start();
		
		for (int i = 0; i < 5; i++) {
			System.out.println("띵");
			try {Thread.sleep(500);} catch (Exception e) {}
		}
	}
}
