package ch08.class09.resolve2;

import java.util.Scanner;

public class RestaurantOrder {
	Scanner sc = new Scanner(System.in);

	// function
	public void orderFood() {
		System.out.println("1: 짜장면\n2: 짬뽕\n3: 탕수육\n4: 유산슬\n5: 유린기\n\n메뉴를 골라주세요. >>");
		int sel = sc.nextInt();

		switch (sel) {
		case Menu.JAJANGMYEON:
			System.out.println("짜장면이 나왔습니다.");
			break;
		case Menu.JJAMBBONG:
			System.out.println("짬뽕이 나왔습니다.");
			break;
		case Menu.TANGSUYUK:
			System.out.println("탕수육이 나왔습니다.");
			break;
		case Menu.YUSANSEUL:
			System.out.println("유산슬이 나왔습니다.");
			break;
		case Menu.YULINKI:
			System.out.println("유린기가 나왔습니다.");
			break;
		default:
			System.out.println("해당 메뉴 번호가 없습니다.");
		}

		sc.close();
	}
}
