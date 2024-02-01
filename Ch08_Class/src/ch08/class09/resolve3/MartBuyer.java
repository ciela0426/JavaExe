package ch08.class09.resolve3;

public class MartBuyer {
	
	private int money;					// 판매자 소지금
	private int numOfPears;				// 배의 개수
	
	/**
	 * 구매자 초기 세팅
	 * @param money = 판매자 소지금
	 */
	public MartBuyer(int money) {
		this.money = money;
	}
	
	/**
	 * 구매자 배 구매 시 사용(구매자가 필요한 값 = 구매한 배의 개수, 잔액)
	 * @param seller = seller의 class 사용을 위해 넘겨받음
	 * @param money = 구매자가 지불한 값
	 */
	public void buyPear(MartInventory seller, int money) {
		this.numOfPears += seller.salePear(money);
		this.money -= money;
	}

	/**
	 * 구매 결과(잔액, 배의 개수)를 보여줌
	 */
	public void showBuyResult() {
		System.out.println("*** 구매자의 현재 상황 ***");
		System.out.println("현재 잔액 : " + money);
		System.out.println("배의 개수 : " + numOfPears);
	}
}
