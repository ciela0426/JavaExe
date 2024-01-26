package ch05.array02;

import java.util.Scanner;

public class NeedToArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// int 자료형으로 kor의 대표명을 가진 공간을 3개 만들어라
		// 배열은 메모리 내부에서 연속공간으로 할당된다.
		int[] kor = new int[3];

		/*
		 * kor[i] : i를 인덱스라고 지칭하고
		 * 			i는 0이 시작이고
		 * 			마지막 인덱스는 항상 배열 길이 -1과 같다.
		 */
		// 3명의 국어 점수 입력
		for (int i = 0; i < kor.length; i++) {
			System.out.printf("%s번째 학생 국어점수 입력 >> ", i + 1);
			kor[i] = sc.nextInt();
		}
		
		int total = 0;
		double avg = 0.;
		
		for (int i = 0; i < kor.length; i++) {
			total += kor[i];
		}
		avg = total/3;
		
		System.out.println("총점: " + total + "점");
		System.out.println("평균: " + avg + "점");
		System.out.printf("평균: %.2f점\n", avg);
		
		sc.close();
	}
}
