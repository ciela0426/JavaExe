package ch03.continue11;

import java.util.Scanner;

// while문과 Scanner의 nextLine() 메소드를 이용, 
// 다음 실행 결과와 같이 키보드로부터 입력된 데이터로 
// 예금, 출금, 조회, 종료 기능을 제공하는 코드를 작성해보세요.

// ---------------------------------
// 1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료
// ---------------------------------
// 선택> 1
// 예금액> 10000
public class Resolve3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = 0;
		int amount = 0;
		int balance = 0;
		
		while(true) {
			System.out.println(
					"다음 중 사용하고자 하는 서비스를 선택하시오.\n"
					+ "---------------------------------\n"
					+ "1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료\n"
					+ "---------------------------------"
					);
			num = sc.nextInt();
			
			if (num == 1) {
				System.out.println("\n예금액을 입력하시오.\n\n");
				amount = sc.nextInt();
				
				balance = balance + amount;
				
				System.out.printf("\n%d원 예금되었습니다.\n\n잔고 : %d원\n\n\n", amount, balance);
			} else if (num == 2) {
				System.out.printf("\n출금액을 입력하시오.\n\n잔고 : %d원\n\n\n", balance);				
				amount = sc.nextInt();
				
				balance = balance - amount;
				
				System.out.printf("\n%d원 출금되었습니다.\n\n잔고 : %d원\n\n\n", amount, balance);
			} else if (num == 3) {
				System.out.printf("\n잔고 : %d원\n\n\n", balance);
//				System.out.printf("\n잔고 : " + balance + "원\n\n\n");
			} else if (num == 4) {
				System.out.printf("\n종료되었습니다.\n\n");
				break;
			} else {
				System.out.printf("\n잘못입력하셨습니다.\n\n\n");
			}
		}
		
		sc.close();
	}
}
