package ch08.class09.answer3;

public class PearBuyer {
	private int money;
	private int numOfPears;
	
	public PearBuyer(int money) {
		this.money = money;
		this.numOfPears = 0;
	}
	public void buyPear(PearSeller seller, int money) {
		this.numOfPears += seller.salePear(money);
		this.money -= money;
	}
	public void showBuyResult() {
		System.out.println("*** 과일 구매자의 현재 상황 ***");
		System.out.println("현재 잔액 : " + money);
		System.out.println("배 개수 : " + numOfPears);
	}
}
