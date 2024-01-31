package ch08.class09.resolve3;

public class MartInventory {
	private int numOfPears;				// 배의 개수
	private int salePrice;				// 판매 금액
	final int PEAR_PRICE = 2500;		// 배 가격(상수) 
										// final을 사용하면 바뀌지 않는 값인 상수가 됨 / 상수는 대체로 대문자로 작성
	
	public MartInventory(int numOfPears) {
		this.numOfPears = numOfPears; // this 를 붙이지 않으면 지역변수가 먼저 선택됨
	}
	public int salePear(int money) {
		int num = money/PEAR_PRICE;
		numOfPears -= num;
		salePrice += money;
		return num;
	}
	public void showSaleResult() {
		System.out.println("*** 마트의 현재 상황 ***");
		System.out.println("남은 배 : " + numOfPears);
		System.out.println("판매 수익 : " + salePrice);
	}
}
