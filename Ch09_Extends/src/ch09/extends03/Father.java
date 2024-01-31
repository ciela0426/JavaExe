package ch09.extends03;

public class Father extends GrandFather { // Father는 GrandFather로부터 상속되었다.
	long money = 100000000000000000L;
	
	Father() {
		System.out.println("Father 생성자");
	}
	
	void wealth() {
		System.out.println("돈을 많이 벌었다ㅎ");
	}
}
