package ch13.sec04;

public class GenericExample {
	/*	Number거나 Number의 자식 객체만 T에 전달 가능	 */
	public static <T extends Number> boolean compare(T t1, T t2) {		// type parameter T를 대체할 타입을 Number로 제한
		System.out.println("compare(" + t1.getClass().getSimpleName() + ", " + t2.getClass().getSimpleName() + ")");
		
		double v1 = t1.doubleValue();			// Number타입의 doubleValue() method 호출
		double v2 = t2.doubleValue();			// Number타입의 doubleValue() method 호출
		
		return (v1 == v2);
	}
	
	public static void main(String[] args) {
		boolean result1 = compare(10, 20);		// T를 Integer 타입으로 대체
		System.out.println(result1);
		System.out.println();

		boolean result2 = compare(4.5, 4.5);	// T를 Double 타입으로 대체
		System.out.println(result2);
		
	}
}
