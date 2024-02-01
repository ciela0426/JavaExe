package ch08.class09.resolve3;

public class MartMain {
	public static void main(String[] args) {
		MartInventory inventory = new MartInventory(10); // 재고 10개
		MartBuyer buyer = new MartBuyer(5000); // 구매자 잔액 5000
		
		// 구매자가 5000원을 지불하고 배를 삼
		buyer.buyPear(inventory, 5000);
		
		inventory.showSaleResult();
		buyer.showBuyResult();
	}
}
