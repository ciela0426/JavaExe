package ch15.thread01.ch14.sec05.exam03;

public class WorkThread extends Thread {
	//	field
	public boolean work = true;
	
	// 생성자
	public WorkThread(String name) {
		setName(name);
	}
	
	/*
	 * Thread의 제어권한을 넘기는 방법
	 * 1. Thread.sleep(10); - 일정시간(10ms)동안 현재 스레드는 스케쥴링에서 제외하겠다.(나는 멈추겠다)
	 * 2. Thread.yield(); - 현재 스레드는 스케쥴링에서 제외하고 즉시 넘기겠다. 즉, 다른 스레드에 실행을 넘기겠다.
	 */
	
	// method
	public void run() {
		while (true) {
			if (work) {
				System.out.println(getName() + "작업 처리");
			} else {
				// CPU의 사용권한(스케쥴링)을 다른 스레드에 넘긴다.
				Thread.yield();
			}
		}
	}
}
