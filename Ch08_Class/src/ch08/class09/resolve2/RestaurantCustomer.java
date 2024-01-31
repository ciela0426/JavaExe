package ch08.class09.resolve2;

public class RestaurantCustomer {

	private int money;
//	private int numOfPears;
	
	public RestaurantCustomer(int money) {
		this.money = money;
	}
	public void orderFood() {
	}
	public void showBuyResult() {
//		System.out.println("*** 방문객의 현재 상황 ***");
		System.out.println("손님 잔액 : " + money);
//		System.out.println("배의 개수 : " + numOfPears);
	}
}
