package ch08.class09.answer2;

import java.util.Scanner;

public class ChineseRestaurant {
	// field
	private String[] foods;
	
	private int selectNum;
	private Scanner sc;
	private String name;
	
	public ChineseRestaurant (Scanner sc, String name, String[] foods) {
		this.sc = sc;
		this.name = name;
		this.foods = foods;
		// 객체가 생성되고 자동으로 처리해야 하는 작업을 코딩
		System.out.println(name +"(을)를 청소한다~");
		System.out.println(name +"식당 재료를 준비한다~");
	}
	
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
			sc.nextLine();
			sc.nextLine();
		}
	}
	public void deliveryFood() {
		System.out.println("---[" + name + "]---");
		String food = foods[selectNum - 1];
		System.out.println(food + "(이)가 나왔습니다.\n맛있게 드세요 ^^\n\n");
	}
 	
}

