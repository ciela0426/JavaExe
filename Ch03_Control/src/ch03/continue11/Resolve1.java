package ch03.continue11;

// for 문을 이용해 1부터 100까지의 정수 중 3의 배수의 총합을 출력하는 코드를 작성
public class Resolve1 {
	public static void main(String[] args) {
		int num = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0) {
				num += i; 
			}
		}
		System.out.println(num);
	}
}
