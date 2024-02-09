package ch13.sec03.exam01;

public class GenericExample {
	// Generic Method
	//     타입파라미터 리턴값자료형  매개변수
	public static <T> Box<T> boxing(T t) {					// 타입 파라미터 T정의
		Box<T> box = new Box<T>();
		box.set(t);
		return box;
	}
	
	public static void main(String[] args) {
		// call generic method
		Box<Integer> box1 = boxing(100);				// T를 Integer로 대체
		int intValue  = box1.get();
		System.out.println(intValue);

		// call generic method
		Box<String> box2 = boxing("홍길동");				// T를 String으로 대체
		String strValue = box2.get();
		System.out.println(strValue);
	}
}
