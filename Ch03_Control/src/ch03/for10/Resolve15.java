package ch03.for10;

import java.util.Scanner;

//15. 사용자로부터 정수를 입력받습니다.
//   입력 받은 값을 계속 더합니다
//   사용자가 0을 입력하면 합을 출력합니다
//   프로그램을 종료합니다.
public class Resolve15 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int result = 0;
		int num;
		
		do {
			System.out.println("수를 입력하세요.\n0을 입력하면 합을 출력합니다. >>");
			num = sc.nextInt();
			result += num;
		} while (num != 0);
		
		System.out.println("수의 합계는 " + result + "입니다.");
		
		sc.close();
	}
}
