package ch08.class09.resolve3;

public class Mart {
	public static void main(String[] args) {
		MartInventory inventory = new MartInventory(10);
		MartBuyer buyer = new MartBuyer(5000);
		
		buyer.buyPear(inventory, 5000);
		
		inventory.showSaleResult();
		buyer.showBuyResult();
	}
}
