package ch08.class09.resolve1;

public class FruitSeller {
	private int numOfApples;			// 사과재고
	private int salePrice;				// 판매수익
	final int APPLE_PRICE = 1000;		// 사과가격(상수) 
										// final을 사용하면 바뀌지 않는 값인 상수가 됨 / 상수는 대체로 대문자로 작성
	
	public FruitSeller(int numOfApple) {
		this.numOfApples = numOfApple; // this 를 붙이지 않으면 지역변수가 먼저 선택됨
	}
	
	// 판매자가 구매자로부터 금액을 받아 사과를 판매함
	public void saleApple(FruitBuyer buyer, int money) {
		// 구매자로부터 얼마 받았는지 받음
		// 사과를 몇 개 샀는지 + 나의 수익을 알아야함
		int num = money/APPLE_PRICE; // 판매한 사과 개수
		
		numOfApples -= num; // 남은 사과의 개수
		salePrice += money; // 판매 수익 
		
		buyer.buyApple(num, money);
	}
	
	public void showSaleResult() {
		System.out.println("*** 과일 판매자의 현재 상황 ***");
		System.out.println("남은 사과 : " + numOfApples);
		System.out.println("판매 수익 : " + salePrice);
	}
}
