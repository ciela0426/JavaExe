package ch03.for10;

import java.util.Scanner;

//1. 돈의 액수를 입금하세요
//   입금한 돈을 오만원권, 만원권, 오천원권, 천원권, 500원동전, 100원동전, 50원동전, 10원동전, 1원동전 각 몇개로 변환되는지 출력하세요
//   출력 개수는 단위가 큰 것 순서로 계산합니다
//   예를 들어 78,670원이면 <오만원 1매, 만원 2매, 오천원 1매, 천원 3매, 500원 1개, 100원 1개, 50원 1개, 10원 2개> 입니다.
public class Resolve1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String result = "";
		
		while(true) {
			
			System.out.print("돈의 액수를 입금하세요. >> ");
			int money = sc.nextInt();
			
			if (money < 0)
				break;
			
			int fiftyThousandWon = money / 50000; // 50000원 몇 개인지
			money %= 50000; // 입력받은 값에서 50000원으로 나눈 나머지 값

	        int tenThousandWon = money / 10000; // 10000원 몇 개인지
	        money %= 10000; // 위의 50000원을 나눈 나머지 값에서 10000원으로 나눈 나머지 값

	        int fiveThousandWon = money / 5000;
	        money %= 5000;

	        int oneThousandWon = money / 1000;
	        money %= 1000;

	        int fiveHundredWon = money / 500;
	        money %= 500;

	        int oneHundredWon = money / 100;
	        money %= 100;

	        int fiftyWon = money / 50;
	        money %= 50;

	        int tenWon = money / 10;
	        money %= 10;

	        int oneWon = money;
	        
	        if (fiftyThousandWon != 0) {
	        	String text = String.format("오만 원 %s 매, ", fiftyThousandWon);
	        	result = result + text;
	        }
	        if (tenThousandWon != 0) {
	        	String text = String.format("만 원 %s 매, ", tenThousandWon);
	        	result = result + text;
	        }
	        if (fiveThousandWon != 0) {
	        	String text = String.format("오천 원 %s 매, ", fiveThousandWon);
	        	result = result + text;
	        }
	        if (oneThousandWon != 0) {
	        	String text = String.format("천 원 %s 매, ", oneThousandWon);
	        	result = result + text;
	        }
	        if (fiveHundredWon != 0) {
	        	String text = String.format("오백 원 %s 개, ", fiveHundredWon);
	        	result = result + text;
	        }
	        if (oneHundredWon != 0) {
	        	String text = String.format("백 원 %s 개, ", oneHundredWon);
	        	result = result + text;
	        }
	        if (fiftyWon != 0) {
	        	String text = String.format("오십 원 %s 개, ", fiftyWon);
	        	result = result + text;
	        }
	        if (tenWon != 0) {
	        	String text = String.format("십 원 %s 개, ", tenWon);
	        	result = result + text;
	        }
	        if (oneWon != 0) {
	        	String text = String.format("일 원 %s 개", oneWon);
	        	result = result + text;
	        }
	        
//	        System.out.println(
//	        		"오만 원 " + fiftyThousandWon + "매, " +
//	                "만 원 " + tenThousandWon + "매, " +
//	                "오천 원 " + fiveThousandWon + "매, " +
//	                "천 원 " + oneThousandWon + "매, " +
//	                "오백 원 " + fiveHundredWon + "개, " +
//	                "백 원 " + oneHundredWon + "개, " +
//	                "오십 원 " + fiftyWon + "개, " +
//	                "십 원 " + tenWon + "개, " +
//	                "일 원 " + oneWon + "개"
//	        		);
	        
	        System.out.println(result);
		}
		
		
		sc.close();
	}
}
