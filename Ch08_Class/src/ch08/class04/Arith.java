package ch08.class04;

/*
 * 객체가 최초 생성될 때 비로소 method가 메모리에 올라간다.
 * 객체가 있어야 사용 가능
 * 
 * 객체의 variable 값에 따라 영향을 받는 method는 일반 method로 만든다. 
 */
public class Arith {
	public int add(int num0, int num1) {
		return num0 + num1;
	}
	public int sub(int num0, int num1) {
		return num0 - num1;
	}
	public int mul(int num0, int num1) {
		return num0 * num1;
	}
	public int div(int num0, int num1) {
		return num0 / num1;
	}
}
