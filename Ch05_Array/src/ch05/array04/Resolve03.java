package ch05.array04;

import java.util.Scanner;

// 3. 7명의 학생의 학점을 입력받고 총점과 평균을 출력하세요
public class Resolve03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] scores = new int[7];
		
		for (int i = 0; i < scores.length; i++) {
			System.out.printf("%s번째 학생의 학점을 입력하세요.\n", i + 1);
			scores[i] = sc.nextInt();
		}
		
		int total = 0;
		double avg = 0.;
		
		for (int i = 0; i < scores.length; i++) {
			total += scores[i];
		}
		
		avg = total/7;
		
		System.out.println("총점: " + total + "점");
		System.out.println("평균: " + avg + "점");
//		System.out.printf("평균: %.2f점\n", avg);
		
		sc.close();
	}
}
