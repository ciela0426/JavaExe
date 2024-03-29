package ch08.class01;

import java.util.Scanner;

/*
 * class는 영역이 확실하다 (class의 캡슐화)
 * class = 멤버 변수 (field) + 멤버 함수 (method)
 * 
 * field = valuable 변수 = 명사 
 * method = function 함수 = 동사
 * 
 * [class의 대상]
 * 큰 개념의 명사 (일반적인 class)
 * 동사들의 집합(Controller, Business layer)
 * field 들의 집합(Vo(묶어놓았다), Dto(꾸러미를 전달한다))
 */
public class Restaurant {
	// field
	private String[] foods = {"냉면", "떡볶이", "쌀국수", "칼국수", "순대", "튀김", "라면" };
	
	private int selectNum;
	private Scanner sc = new Scanner(System.in);
	
	// Method
	public void viewMenu() {
		for (int i = 0; i < foods.length; i++) {
			System.out.println(i + 1 + " . " + foods[i]);
		}
	}
	public void selectFood() {
		while(true) {

			System.out.println("어떤 음식을 선택하시겠습니까? >> ");
			selectNum = sc.nextInt();
			
			if (selectNum > foods.length) {
				System.out.println("잘못선택하셨습니다.\n");
			} else {
				break;
			}
		}
	}
	public void deliveryFood() {
		String food = foods[selectNum - 1];
		System.out.println(food + "이 나왔습니다.\n맛있게 드세요 ^^");
	}
	public void keyboardEnd() {
		sc.close();
	}
 	
}

