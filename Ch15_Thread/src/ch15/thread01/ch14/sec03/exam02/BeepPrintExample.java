package ch15.thread01.ch14.sec03.exam02;

import java.awt.Toolkit;

public class BeepPrintExample {
	public static void main(String[] args) {
		// Worker thread 생성 후 -> start() -> run() 실행
		Thread thread = new Thread(new Runnable() {
			@Override        				// 부모가 만든 method를 내가 다시 사용한다
			public void run() {
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				for (int i = 0; i < 5; i++) {
					toolkit.beep();
					try {
						Thread.sleep(500);
					} catch (Exception e) {
						
					}
				}
			}
		});
		
		thread.start();
		
		for (int i = 0; i < 5; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				
			}
		}
	}
}
