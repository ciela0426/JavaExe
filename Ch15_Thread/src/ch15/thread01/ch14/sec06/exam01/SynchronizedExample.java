package ch15.thread01.ch14.sec06.exam01;

public class SynchronizedExample {
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		
		User1Thread user1Thread = new User1Thread();
		user1Thread.setCalculator(calculator);
		user1Thread.start();

		User2Thread User2Thread = new User2Thread();
		User2Thread.setCalculator(calculator);
		User2Thread.start();
	}
}
