package ch02.logicOperator07;

public class LogicOperator {

	public static void main(String[] args) {
		boolean logic;
		
		// And 연산
		logic = true && true;
		System.out.println("true && true => " + logic);
		
		logic = true && false;
		System.out.println("true && false => " + logic);
		
		// Or 연산
		logic = true || true;
		System.out.println("true || true => " + logic);
		
		logic = true || false;
		System.out.println("true || false => " + logic);

		// Xor 연산 -> 서로 같으면 0(false)으로, 서로 다르면 1(true)로 
		logic = true ^ true;
		System.out.println("true ^ true => " + logic);

		logic = false ^ false;
		System.out.println("false ^ false => " + logic);

		logic = true ^ false;
		System.out.println("true ^ false => " + logic);

		// Not 연산 
		logic = !false;
		System.out.println("!false => " + logic);

		logic = !true;
		System.out.println("!true => " + logic);
	}

}
