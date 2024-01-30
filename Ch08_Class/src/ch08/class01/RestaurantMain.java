package ch08.class01;

public class RestaurantMain {
	public static void main(String[] args) {
		Restaurant rest = new Restaurant();
		
		/*
		 * class 도 자료형 
		 * 우리가 직접 만든 사용자 정의 자료형
		 */
		// class 의 객체 (class의 variable) = new (heap에 할당) class의 생성자함수 호출
		rest.viewMenu();
		rest.selectFood();
		rest.deliveryFood();
		rest.keyboardEnd();
	}
}

