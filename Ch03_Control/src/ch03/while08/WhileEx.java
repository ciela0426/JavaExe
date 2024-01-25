package ch03.while08;

public class WhileEx {
	public static void main(String[] args) {
		// while : 괄호 안의 조건을 충족하는 동안 계속 반복하라 
		int i = 0; // 초기식 (
		while(i<10) { // 조건(종료: 언제까지)
			i++; // 증감식(변화)
			System.out.print(i + ", ");
		}
	}
}
