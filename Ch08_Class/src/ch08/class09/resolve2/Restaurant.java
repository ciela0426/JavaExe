package ch08.class09.resolve2;

public class Restaurant {
	public static void main(String[] args) {
		// Restaurant 관련 Class 선언 + reset variable value
		RestaurantOrder restaurant = new RestaurantOrder();
		RestaurantCustomer customer = new RestaurantCustomer(5000);
		
		customer.orderFood();
		
		restaurant.showSaleResult();
		customer.showBuyResult();
	}
}
