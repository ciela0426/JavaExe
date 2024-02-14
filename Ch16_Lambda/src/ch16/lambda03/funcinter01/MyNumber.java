package ch16.lambda03.funcinter01;

/*
 * 함수형 인터페이스는 추상 메서드 1개만 가능 -> 틀리면 오류남
 */
@FunctionalInterface					// 함수형 람다식을 위한 인터페이스다 명시
public interface MyNumber {
	int getMax(int num1, int num2);		
	//	int add(int num1, int num2);	 두 개 이상은 만들 수 없음
}
