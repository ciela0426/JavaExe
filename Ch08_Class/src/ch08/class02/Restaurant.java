package ch08.class02;

import java.util.Scanner;

public class Restaurant {
	// field
	public Scanner sc;
	public String name;
	private String[] foods = {"냉면", "떡볶이", "쌀국수", "칼국수", "순대", "튀김", "라면" };
	
	private int selectNum;
	
	// Method
	public void viewMenu() {
		System.out.println("---[" + name + "]---");
		for (int i = 0; i < foods.length; i++) {
			System.out.println(i + 1 + " . " + foods[i]);
		}
	}
	public void selectFood() {
		while(true) {
			System.out.println("---[" + name + "]---");
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
		System.out.println("---[" + name + "]---");
		String food = foods[selectNum - 1];
		System.out.println(food + "이 나왔습니다.\n맛있게 드세요 ^^");
	}
 	
}

