package ch08.class09.resolve2;

public class Restaurant {
	public static void main(String[] args) {
		RestaurantSeller restaurant = new RestaurantSeller();
		RestaurantCustomer customer = new RestaurantCustomer(5000);
		
		customer.orderFood();
		
		restaurant.showSaleResult();
		customer.showBuyResult();
	}
}
