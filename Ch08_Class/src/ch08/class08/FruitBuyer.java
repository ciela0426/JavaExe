package ch08.class08;

public class FruitBuyer {
	private int money;
	private int numOfApples;
	
	public FruitBuyer(int money) {
		this.money = money;
		this.numOfApples = 0;
	}
	public void buyApple(FruitSeller seller, int money) {
		this.numOfApples += seller.saleApple(money);
		this.money -= money;
	}
	public void showBuyResult() {
		System.out.println("*** 과일 구매자의 현재 상황 ***");
		System.out.println("현재 잔액 : " + money);
		System.out.println("사과 개수 : " + numOfApples);
	}
}
