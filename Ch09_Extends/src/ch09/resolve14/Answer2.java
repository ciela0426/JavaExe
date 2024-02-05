package ch09.resolve14;

import java.util.Scanner;

public class Answer2 implements IQuestionAnswer {

	@Override
	public void question() {
		String question = "2. ITablet 인터페이스를 만드세요.\n"
				+ "   아래 메서드를 멤버로 추가하세요.\n"
				+ "   void movie();\n"
				+ "   void music();\n"
				+ "   void readBook();\n"
				+ "   \n"
				+ "   ITablet를 상속받은 삼성, 소니, LG는 Tablet을 구현클래스로 만들고\n"
				+ "   OEM을 의뢰한 비트캠프는 TabletTester를 생성합니다.\n"
				+ "   이 클래스들이 완성되면 TabletMain에서 테스트를 진행하세요.\r\n\r\n";
		System.out.println(question);
	}

	@Override
	public void answer(Scanner sc) {
		sc.nextLine();							// Enter 치기 전까지 멈춰 있음
		System.out.println("2번 문제 실행~");
		sc.nextLine();
	}

	@Override
	public boolean isRun() {
		return true;
	}

}
