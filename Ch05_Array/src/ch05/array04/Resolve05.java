package ch05.array04;

import java.util.Scanner;

//5. int배열을 10개 생성하세요.
// 사용자로부터 10개의 값을 입력받고
// 순서대로 출력하고  총합을 구하세요
public class Resolve05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = new int[10];
		int result = 0;
		
		for(int i = 0; i < num.length; i++) {
			System.out.printf("%s번 값을 입력하세요. >> ", i + 1);
			num[i] = sc.nextInt();
		}
		
		for(int i = 0; i < num.length; i++) {
			result += num[i];
			if (i + 1 == num.length) {
				System.out.print(num[i]);
			} else {
				System.out.print(num[i] + ", ");
			}
		}
		
		System.out.println("\n\n총 합 : " + result);
		
		sc.close();
	}
}
