package ch09.extends04;

public class GrandFather {
	int handshomeScore;
		
	GrandFather() {
		System.out.println("GrandFather 생성자");
	}
	
	GrandFather(int score) {
		this.handshomeScore = score; // 이름이 달라 할 필요 없지만 공부를 위해 명시적으로 씀
		System.out.println("GrandFather 매개변수 생성자");
	}
	
	void handsome() {
		System.out.println("잘 생겼다~");
	}
}
