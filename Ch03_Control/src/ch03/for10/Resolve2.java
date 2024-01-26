package ch03.for10;

import java.util.Scanner;

//2. 369게임을 작성합니다.
//   1~99까지의 정수를 입력받고
//   3,6,9중 하나가 있으면 "박수짝"을 출력하고
//   2개가 있으면 "박수짝짝"을 출력하세요
//   예를 들어 13은 "박수짝"
//   36인 경우는 "박수짝짝"을 출력하면 됩니다.
public class Resolve2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int input; // 입력받은 정수
		int count369 = 0; // 3,6,9가 몇 개 들어있는지

		// 1~99 사이의 수 입력받기
        do {
            System.out.print("1~99 사이의 정수를 입력하시오 : ");
            input = sc.nextInt();
        } while (input < 1 || input > 99);
        
        // input으로 들어온 값에 3,6,9가 포함되어 있는지 확인
        while (input > 0) {
            int digit = input % 10; // 입력받은 값을 10으로 나눴을 때 나머지

            if (digit == 3 || digit == 6 || digit == 9) {
            	count369++;
            } 

            input /= 10;
        }
        
        // count369가 1개면 박수짝 2개면 박수짝짝
        if (count369 == 1) {
        	System.out.println("박수짝");
        } else if (count369 == 2) {
        	System.out.println("박수짝짝");
        }
        
		sc.close();
	}
}
