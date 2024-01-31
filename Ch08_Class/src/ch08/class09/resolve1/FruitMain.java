package ch08.class09.resolve1;

public class FruitMain {
	public static void main(String[] args) {
		FruitSeller seller = new FruitSeller(20); // 사과 20 개
		FruitBuyer buyer = new FruitBuyer(10000); // 구매자 잔액 10000원

		// 판매자가 구매자로부터 2000원의 금액을 받아 사과를 판매함
		seller.saleApple(buyer, 2000);
		
		seller.showSaleResult();
		buyer.showBuyResult();
	}
}
