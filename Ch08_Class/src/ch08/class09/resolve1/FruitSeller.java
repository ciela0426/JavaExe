package ch08.class09.resolve1;

public class FruitSeller {
	private int numOfApples;			// 사과재고
	private int salePrice;				// 판매수익
	final int APPLE_PRICE = 1000;		// 사과가격(상수) 
										// final을 사용하면 바뀌지 않는 값인 상수가 됨 / 상수는 대체로 대문자로 작성
	
	/**
	 * 판매자 사과 개수 초기세팅
	 * 
	 * @param numOfApple = 사과재고 
	 */
	public FruitSeller(int numOfApple) {
		this.numOfApples = numOfApple; // this 를 붙이지 않으면 지역변수가 먼저 선택됨
	}

	/**
	 * 판매자 사과 판매 시 사용함(판매자가 필요한 값 = 남은 사과 개수, 판매 수익)
	 * 
	 * @param buyer = buyer의 class사용을 위해 넘겨받음
	 * @param money = 구매자가 지불한 값
	 */
	public void saleApple(FruitBuyer buyer, int money) {
		int num = money/APPLE_PRICE; // 판매한 사과 개수 = 구매자가 지불한 값/사과 가격
		
		numOfApples -= num; // 남은 사과 개수
		salePrice += money; // 판매 수익
		
		buyer.buyApple(num, money);
	}

	/**
	 * 판매 결과(사과 재고, 판매 수익)을 보여줌
	 */
	public void showSaleResult() {
		System.out.println("*** 과일 판매자의 현재 상황 ***");
		System.out.println("남은 사과 : " + numOfApples);
		System.out.println("판매 수익 : " + salePrice);
	}
}
