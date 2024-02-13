package ch15.thread02;

/*
 * Thread 생성 요청하는 2가지 방법
 * 
 * vm 내부 thread의 리소스가 존재하고, 우리는 객체 참조 변수로 thread의 동작을 제어
 * 
 * 1) thread 클래스의 상속받는 클래스 구현
 * 2) Runnable 인터페이스의 상속받는 클래스 구현
 * ; java는 단일 상속이라서 이미 다른 클래스의 상속을 받은 클래스에서 스레드를 동작시키려면 thread 클래스를 더 이상 상속시킬 수 없다.
 * 		
 * 		이미 다른 클래스의 상속을 받은 클래스에서 thread를 동작시키기 위해 runnable 인터페이스를 상속받는 방법을 제시했다.
 * 
 * 모두 run() 에 thread가 해야할 일을 구현
 * 
 * start()를 호출하면 thread가 동작 시작
 */

class ShowNameThread extends Thread {

	@Override				// 사람이 봤을 떄 부모의 인터페이스가 물려준 인터페이스네 생각가능
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("안녕하세요 : " + this.getName() + "입니다.");
			
			try {
				sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(this.getName() +"스레드 종료");
	}
	
}

public class ExtendsThread {
	public static void main(String[] args) {
		// thread 2개가 vm에 할당되어 준비하고 있는 상태
		ShowNameThread t1 = new ShowNameThread();
		ShowNameThread t2 = new ShowNameThread();
		
		// thread를 동작(run()을 호출)
		System.out.println("t1 스레드 객체 동작");
		t1.start();
		System.out.println("t2 스레드 객체 동작");
		t2.start();
		
		System.out.println("main 스레드 종료");
	}
}
