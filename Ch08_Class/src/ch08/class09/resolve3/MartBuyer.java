package ch08.class09.resolve3;

public class MartBuyer {

	private int money;
	private int numOfPears;
	
	public MartBuyer(int money) {
		this.money = money;
		this.numOfPears = 0;
	}
	public void buyPear(MartInventory seller, int money) {
		this.numOfPears +=seller.salePear(money);
		this.money -= money;
	}
	public void showBuyResult() {
		System.out.println("*** 구매자의 현재 상황 ***");
		System.out.println("현재 잔액 : " + money);
		System.out.println("배의 개수 : " + numOfPears);
	}
}
