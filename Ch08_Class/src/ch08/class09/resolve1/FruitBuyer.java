package ch08.class09.resolve1;

public class FruitBuyer {
	private int money;				// 잔액
	private int numOfApples;		// 가진 사과 개수
	
	public FruitBuyer(int money) {
		this.money = money;
		this.numOfApples = 0;
	}
	
	// 사과 개수, 잔액
	public void buyApple(int numOfApples, int money) {
		this.numOfApples += numOfApples;
		this.money -= money;
	}
	
	public void showBuyResult() {
		System.out.println("*** 과일 구매자의 현재 상황 ***");
		System.out.println("현재 잔액 : " + money);
		System.out.println("사과 개수 : " + numOfApples);
	}
}
