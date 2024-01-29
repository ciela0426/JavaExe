package ch05.array08;

public class SwapEx {
	public static void main(String[] args) {
		// 2개 변수의 값을 바꾸려면
		// Python은 아래처럼 가능하다.
		/*
		a = 10;
		b = 20;
		a, b = b, a;
		*/
		
		int a = 100;
		int b = 200;
		a = b;
		b = a;
		
		System.out.printf("a=%d, b=%d\n", a, b); // a = 200, b = 200
		
		// Java에서는 변수를 하나 더 설정해서 바꿔야 함 
		int num0 = 10;
		int num1 = 20;
		int temp = 0;
		
		temp = num0;
		num0 = num1;
		num1 = temp;
		
		System.out.printf("num = %d, num1 = %d\n", num0, num1);
	}
}
