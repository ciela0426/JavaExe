package ch16.lambda01.ch09.sec07.exam01;

public class Car {
	// field에 Tire 객체 대입
	private Tire tire1 = new Tire();
	
	// field에 익명 자식 객체 대입
	private Tire tire2 = new Tire() {
		@Override
		public void roll() {
			System.out.println("익명 자식 Tire 객체 1이 굴러갑니다.");
		}
	};
	
	// method(field 이용)
	public void run1() {
		tire1.roll();
		tire2.roll();
	}
	
	// method(local 변수 이용)
	public void run2 () {
		// local 변수에 익명 자식 객체 대입
		Tire tire = new Tire() {
			@Override
			public void roll() {
				System.out.println("익명 자식 Tire 객체 2가 굴러갑니다.");
			}
		};
		tire.roll();
	}
	
	// method(매개 변수 이용)
	public void run3 (Tire tire) {
		tire.roll();
	}
}
