package ch15.thread01.ch14.sec08;

public class DaemonExample {
	public static void main(String[] args) {
		AutoSaveThread autoSaveThread = new AutoSaveThread();
		
		/*
		 * C / C++은 원래 데몬 스레드
		 * C# / Java는 위의 속성을 없애기 위한 별도의 동기화 작업이 필요
		 * 불편함으로 인해 별개로 동작하도록 만듬
		 * 아래처럼 setDeamon(true)일 때 종속되게 만듬
		 * 
		 * Deamon thread(종속 thread)
		 * 부모 스레드가 종료되는 자식도 함꼐 종료
		 * 
		 * 일반적으로는 자식 스레드는 부모 스레드와 별개로 동작
		 */
		autoSaveThread.setDaemon(true); // true로 하면 부모가 죽을 떄 같이 죽음
		autoSaveThread.start();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			
		}
		
		System.out.println("메인 스레드 종료");
	}
}
