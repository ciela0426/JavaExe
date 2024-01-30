package ch08.class07;

import java.util.Scanner;

public class Restaurant {
	// field
	private String[] foods;
	
	private int selectNum;
	private Scanner sc;
	private String name;
	
	/*
	 * 생성자 함수(method)
	 * 1) class 이름과 동일
	 * 2) return 형이 없다.
	 * 3) 객체 생성되면 자동으로 먼저 호출된다.
	 * 4) 객체의 자동 초기화 작업
	 * 5) field variable의 초기화 작업
	 */
	/*
	 * this는 객체 자신을 의미하며
	 * 객체 자신의 field를 가리킬 때 사용된다.
	 */
	public Restaurant (Scanner sc, String name, String[] foods) {
		this.sc = sc;
		this.name = name;
		this.foods = foods;
		// 객체가 생성되고 자동으로 처리해야 하는 작업을 코딩
		System.out.println(name +"(을)를 청소한다~");
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
		}
	}
	public void deliveryFood() {
		System.out.println("---[" + name + "]---");
		String food = foods[selectNum - 1];
		System.out.println(food + "(이)가 나왔습니다.\n맛있게 드세요 ^^\n\n");
	}
 	
}

