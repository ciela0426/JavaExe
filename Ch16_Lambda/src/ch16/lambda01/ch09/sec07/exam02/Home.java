package ch16.lambda01.ch09.sec07.exam02;

public class Home {
	// field에 익명 구현 객체 대입
	private RemoteControl rc = new RemoteControl() {
		@Override
		public void turnOn() {
			System.out.println("TV를 켭니다.");
		}
		@Override
		public void turnOff() {
			System.out.println("TV를 끕니다.");
		}
	};
	
	// method(field 이용)
	public void use1 () {
		rc.turnOn();
		rc.turnOff();
	}
	
	// method(local 변수 이용)
	public void use2 () {
		//local 변수에 익명 구현 객체 대입
		RemoteControl rc = new RemoteControl() {
			@Override
			public void turnOn() {
				System.out.println("에어컨을 켭니다.");
			}
			@Override
			public void turnOff() {
				System.out.println("에어컨을 끕니다.");
			}
		};
		rc.turnOn();
		rc.turnOff();
	}
	
	// method(매개 변수 이용)
	public void use3 (RemoteControl rc) {
		rc.turnOn();
		rc.turnOff();
	}
}
