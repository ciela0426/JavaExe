package ch08.class09.resolve1;

/*
 * 1.FruitMain클래스에		
	현재는 buyer.buyApple(seller, 2000); 처럼 프로그래밍되어
	있습니다.
	아래처럼 seller를 중심으로 수정하세요.
	seller.saleApple(buyer, 2000);
 */
public class FruitMain {
	public static void main(String[] args) {
		FruitSeller seller = new FruitSeller(20); // 사과 20 개
		FruitBuyer buyer = new FruitBuyer(10000); // 구매자 잔액 10000원

		// 판매자가 구매자로부터 2000원의 금액을 받아 사과를 판매했을 떄
		seller.saleApple(buyer, 2000);
		
		seller.showSaleResult();
		buyer.showBuyResult();
	}
}
