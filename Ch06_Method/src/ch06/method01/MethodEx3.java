package ch06.method01;

import java.util.Scanner;

public class MethodEx3 {
	
	// main method 내의 계산하는 부분을 옮긴다. void는 return하지 않는 함수를 말함
	public static void calcArith(int num0, int num1, String op) {
		int result = 0;

		switch (op) {
		case "+":
			result = num0 + num1;
			break;
		case "-":
			result = num0 - num1;
			break;
		case "*":
			result = num0 * num1;
			break;
		case "/":
			result = num0 / num1;
			break;
		case "%":
			result = num0 % num1;
			break;
		default:
			System.out.println("연산이 불가능합니다.");
			break;
		}

		System.out.println("결과값은 " + result + "입니다.");
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 1) 처리하기 전에 입력받는 부분
		System.out.println("1번째 정수 입력 >> ");
		int num0 = sc.nextInt();
		System.out.println("2번째 정수 입력 >> ");
		int num1 = sc.nextInt();
		System.out.println("연산자 입력 + - * / %");
		String op = sc.next();
		
		// 2) 계산하는 부분
		calcArith(num0, num1, op);

		// 결과값 출력
		sc.close();
	}
}
