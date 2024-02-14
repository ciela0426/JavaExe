package ch16.lambda03.funcinter01;

public class TestMyNumber {
	public static void main(String[] args) {
		/* lambda식은 중간의 형식을 배제하고 결과에 집중하는 방식
		 * 아래의 max는 interface의 변수
		 * (x, y) -> (x >= y) ? x : y를 max에 전달하면
		 * 컴파일러는 자동으로 MyNumber를 상속받은 익명의 클래스를 선언
		 * 익명 클래스의 객체를 생성해 max에 전달
		 * 
		 * 그리고 MyNumber의 유일한 추상 메서드 getMax의 내용을 
		 * (x, y) -> (x >= y) ? x : y로 구성해준다.
		 * 
		 * max.getMax(10, 20)를 호출하면
		 * x = 10, y = 20이 전달됨
		 * */
		MyNumber max = (x, y) -> (x >= y) ? x : y;
		System.out.println(max.getMax(10, 20));
	}
}
