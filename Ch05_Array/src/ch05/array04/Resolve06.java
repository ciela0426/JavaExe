package ch05.array04;

import java.util.Scanner;

//6. 5명의 학생의 이름과 점수를 입력받고
//   해당학생의 이름과 학점이 A, B, C, D, F로 출력되도록 하세요
//  A : 90이상, B : 80이상, C : 70이상, D : 60이상, F : 60미만
public class Resolve06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] names = new String[5];
		int[] scores = new int[5];
		
		for (int i = 0; i < 5; i++) {
			System.out.printf("%s번째 학생의 이름을 입력하세요. >> ", i + 1);
			names[i] = sc.next();

			System.out.printf("%s번째 학생의 점수를 입력하세요. >> ", i + 1);
			scores[i] = sc.nextInt();	
		}
		
		
		String result = "";
		
		for (int i = 0; i < 5; i++) {
			String grade = "";
			if (scores[i] >= 90) {
				grade = "A";
			} else if (scores[i] >= 80) {
				grade = "B";
			} else if (scores[i] >= 70) {
				grade = "C";
			} else if (scores[i] >= 60) {
				grade = "D";
			} else {
				grade = "F";
			}
			
			System.out.print(names[i] + "의 학점은 " + grade + "입니다.\n");
		}
		
		sc.close();
	}
}
