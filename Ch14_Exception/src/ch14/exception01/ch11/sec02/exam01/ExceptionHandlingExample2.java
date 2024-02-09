package ch14.exception01.ch11.sec02.exam01;

public class ExceptionHandlingExample2 {
	public static void printLength(String data) {
		try {									// 1) 로직 실행 영역
			int result = data.length();					// data가 null일 경우 NullPointerException발생
			System.out.println("문자 수 : " + result);
		} catch (NullPointerException e) {		// 2) try에서 발생한 예외를 받아 처리하는 영역
			System.out.println(e.getMessage());			// 1 예외 정보를 얻는 3가지 방법
//			System.out.println(e.toString());			// 2
//			e.printStackTrace();						// 3
		} finally {								// 3) try든 catch든 마무리로 실행되어야 하는 영역
			System.out.println("[마무리 실행]\n");
		}
	}
	
	public static void main(String[] args) {
		System.out.println("[프로그램 시작]\n");
		printLength("ThisIsJava");
		printLength(null);							// 매개값을 null로 대입
		System.out.println("[프로그램 종료]");
	}
}
