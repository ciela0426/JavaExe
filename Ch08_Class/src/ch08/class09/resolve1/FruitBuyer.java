package ch08.class09.resolve1;

public class FruitBuyer {
	private int money;				// 잔액
	private int numOfApples;		// 가진 사과 개수

	/**
	 * 구매자 잔액 초기세팅
	 * @param money = 잔액
	 */
	public FruitBuyer(int money) {
		this.money = money;
	}
	
	/**
	 * 구매자가 사과 구매 시 사용하는 함수(구매자가 필요한 값 = 가진 사과 개수, 잔액)
	 * 
	 * @param numOfApples = 구매한 사과 개수
	 * @param money = 지불한 값
	 */
	public void buyApple(int numOfApples, int money) {
		this.numOfApples += numOfApples;
		this.money -= money;
	}
	
	/**
	 * 구매 결과(잔액, 사과 개수)를 보여줌
	 */
	public void showBuyResult() {
		System.out.println("*** 과일 구매자의 현재 상황 ***");
		System.out.println("현재 잔액 : " + money);
		System.out.println("사과 개수 : " + numOfApples);
	}
}
