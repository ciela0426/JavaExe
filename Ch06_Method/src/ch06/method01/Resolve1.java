package ch06.method01;

import java.util.Scanner;

// 1. 2개의 정수를 입력받고 큰 값을 반환하는 메서드와
//작은 값을 반환하는 메서드를 작성하고 사용하세요
public class Resolve1 {
	
	public static int big(int num0, int num1) {
		if (num0 > num1) {
			return num0;
		} else {
			return num1;
		}
	}
	
	public static int small(int num0, int num1) {
		if (num0 > num1) {
			return num1;
		} else {
			return num0;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num0, num1;
		
		System.out.println("첫번째 정수를 입력하시오. >> ");
		num0 = sc.nextInt();
		
		System.out.println("두번째 정수를 입력하시오. >> ");
		num1 = sc.nextInt();
		
		int result1 = big(num0, num1);
		System.out.println("큰 값 : " + result1);
		
		int result2 = small(num0, num1);
		System.out.println("작은 값 : " + result2);
		
		sc.close();
	}
}
