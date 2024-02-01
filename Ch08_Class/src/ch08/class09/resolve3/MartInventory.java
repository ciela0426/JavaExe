package ch08.class09.resolve3;

public class MartInventory {
	private int numOfPears;				// 배의 재고
	private int salePrice;				// 판매 수익
	final int PEAR_PRICE = 2500;		// 배 가격(상수) 
										// final을 사용하면 바뀌지 않는 값인 상수가 됨 / 상수는 대체로 대문자로 작성
	
	/**
	 * 판매자 배의 개수 초기세팅
	 * 
	 * @param numOfPears = 배의 재고
	 */
	public MartInventory(int numOfPears) {
		this.numOfPears = numOfPears;
	}

	/**
	 * 판매자 사과 판매 시 사용함(판매자가 필요한 값 = 남은 사과 개수, 판매 수익)
	 * 
	 * @param money = 구매자가 지불한 값
	 */
	public int salePear(int money) {
		int num = money/PEAR_PRICE; // 판매한 배의 개수 = 구매자가 지불한 값/배 가격
		
		numOfPears -= num; // 남은 배 개수
		salePrice += money; // 판매 수익
		
		return num;
	}
	
	/**
	 * 판매 결과(배의 재고, 판매 수익)을 보여줌
	 */
	public void showSaleResult() {
		System.out.println("*** 마트의 현재 상황 ***");
		System.out.println("남은 배 : " + numOfPears);
		System.out.println("판매 수익 : " + salePrice);
	}
}
