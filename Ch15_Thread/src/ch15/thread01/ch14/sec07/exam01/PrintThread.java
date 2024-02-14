package ch15.thread01.ch14.sec07.exam01;

public class PrintThread extends Thread {
	private boolean stop;
	
	public void setStop(boolean stop) {
		this.stop = stop;
	}
	
	/*
	 * [ Thread를 안전하게 종료하는 방법 ]
	 * 1. 계속 동작해야하는 스레드에서 while문을 종종 사용 
	 * 		-> 이 스레드를 종료하기 위해서는 아래처럼 boolean stop을 사용 
	 * 		-> stop이 true일 때 while문은 더 이상 반복되지 않고 종료
	 * 
	 */
	@Override
	public void run () {
		while (!stop) {
			System.out.println("실행 중");
		}
		System.out.println("리소스 정리");
		System.out.println("실행 종료");
	}
}
