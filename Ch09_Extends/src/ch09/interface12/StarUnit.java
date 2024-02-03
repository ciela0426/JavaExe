package ch09.interface12;

/*
 * Interface == 추상 class
 * 모든 method가 추상 method
 * 
 * 1) 상속을 전제로 함
 * 2) 부모의 interface variable에 자식 object를 저장할 수 있다.
 * 3) 다형성(Polymophism)의 의미(묶어서 관리가 쉽고, 각 variable은 저장object에 따라 각각 개성있게 동작)
 * 4) class와 class를 연결
 * 5) 유연한 설계
 * 6) Design Pattern
 * 7) Literal constant -> 의미있는 문자열 constant(상수)
 */
public interface StarUnit {
	public void walk();
	public void attack();
	public void die();
}
