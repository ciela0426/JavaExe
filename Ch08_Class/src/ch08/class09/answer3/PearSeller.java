package ch08.class09.answer3;

public class PearSeller {
	private int numOfPears;				// 배개수
	private int salePrice;				// 판매금액
	final int PEAR_PRICE = 2500;		// 배가격(상수) 
	
	public PearSeller(int numOfPears) {
		this.numOfPears = numOfPears; // this 를 붙이지 않으면 지역변수가 먼저 선택됨
	}
	public int salePear(int money) {
		int num = money/PEAR_PRICE;
		numOfPears -= num;
		salePrice += money;
		return num;
	}
	public void showSaleResult() {
		System.out.println("*** 과일 판매자의 현재 상황 ***");
		System.out.println("남은 배 : " + numOfPears);
		System.out.println("판매 수익 : " + salePrice);
	}
}
