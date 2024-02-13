package ch15.thread02;


class OwnName {
	private String ownName;

	public String getOwnName() {
		return ownName;
	}

	public void setOwnName(String ownName) {
		this.ownName = ownName;
	}
	
}

/*
 * ShowNameThread은 이미 OwnName을 상속받았으므로 Thread의 상속을 받을 수 없다.
 * 이 때는 Runnable을 상속받는다.
 */
class ShowOwnNameThread extends OwnName implements Runnable {

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

public class ImplementsRunnable {
	public static void main(String[] args) {
		// thread 2개가 vm에 할당되어 준비하고 있는 상태
		ShowOwnNameThread t1 = new ShowOwnNameThread();
		ShowOwnNameThread t2 = new ShowOwnNameThread();
		
		// thread를 동작(run()을 호출)
		System.out.println("t1 스레드 객체 동작");
		t1.start();
		System.out.println("t2 스레드 객체 동작");
		t2.start();
		
		System.out.println("main 스레드 종료");
	}
}
