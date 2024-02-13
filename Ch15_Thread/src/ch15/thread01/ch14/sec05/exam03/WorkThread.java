package ch15.thread01.ch14.sec05.exam03;

public class WorkThread extends Thread {
	//	field
	public boolean work = true;
	
	// 생성자
	public WorkThread(String name) {
		setName(name);
	}
	
	// method
	public void run() {
		while (true) {
			if (work) {
				System.out.println(getName() + "작업 처리");
			} else {
				Thread.yield();
			}
		}
	}
}
