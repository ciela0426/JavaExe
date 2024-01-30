package ch08.class03;
/*
 * Static method는 객체를 만들지 않아도 바로 사용 가능
 */
public class ArithEx {
	public static void main(String[] args) {
		int a = 10, b = 5;
		int result = 0;
		result = Arith.add(a, b);
		System.out.println(result);
		result = Arith.sub(a, b);
		System.out.println(result);
		result = Arith.mul(a, b);
		System.out.println(result);
		result = Arith.div(a, b);
		System.out.println(result);
	}
}
