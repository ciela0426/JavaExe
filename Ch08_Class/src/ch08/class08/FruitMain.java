package ch08.class08;

/*
 * <class와 class간의 상호작용>
 * 요구사항 : "과일구매자는 과일판매자에게 사과 2개를 구매했다."
 * 			이것을 객체지향 프로그램으로 묘사하라
 * 1) 명사/동사 분류법
 * 		명사 : class(상위 개념)
 * 			  field(하위 개념)
 * 		동사 : Method
 * 			  연관성있는 역할의 메서드가 많으면 class로 묶는다.
 * 
 * 2) MVC(역할 기반 분류 - View Model Controller Pattern)
 * 		Model : Database, 제어(Dao)
 * 		View : 화면, 입출력
 * 		Controller : 중간 연결, Business Layer, 통신
 * 
 * 		Vo : field를 묶어놓은 개념
 * 		Dto : MVC간에 메세지를 주고 받을 떄 묶어서 전달하자
 */
/*
 * class : 설계도
 * object : 설계도로 만들어진 실체(object, instance)
 */
public class FruitMain {
	public static void main(String[] args) {
		FruitSeller seller = new FruitSeller(20);
		FruitBuyer buyer = new FruitBuyer(10000);
		
		seller.showSaleResult();
		buyer.showBuyResult();
		
		buyer.buyApple(seller, 2000);
		
		seller.showSaleResult();
		buyer.showBuyResult();
	}
}
