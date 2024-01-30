package ch08.class08;

public class FruitSeller {
	private int numOfApples;				// 사과개수
	private int salePrice;				// 판매금액
	final int APPLE_PRICE = 1000;		// 사과가격(상수) 
										// final을 사용하면 바뀌지 않는 값인 상수가 됨 / 상수는 대체로 대문자로 작성
	
	public FruitSeller(int numOfApple) {
		this.numOfApples = numOfApple; // this 를 붙이지 않으면 지역변수가 먼저 선택됨
	}
	public int saleApple(int money) {
		int num = money/APPLE_PRICE;
		numOfApples -= num;
		salePrice += money;
		return num;
	}
	public void showSaleResult() {
		System.out.println("*** 과일 판매자의 현재 상황 ***");
		System.out.println("남은 사과 : " + numOfApples);
		System.out.println("판매 수익 : " + salePrice);
	}
}
