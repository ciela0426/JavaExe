package ch13.sec01;

/*
 * Box<String> box1 = new Box<>();
 * Box<Integer> box2 = new Box<>();
 * 
 * 위처럼 코드를 작성하면 아래처럼 클래스를 자동으로 2개로 컴파일러한다.
 * class Box_String {
 * 	public String content;
 * }
 * class Box_Integer {
 * 	public Integer content;
 * }
 */
public class GenericExample {
	public static void main(String[] args) {
		/*
		 * Box를 생성할 때 타입 파라미터T 대신 String으로 대체
		 */
		// Box<String> box1 = new Box<String>();
		Box<String> box1 = new Box<>();
		box1.content = "안녕하세요.";				// Boxing : Heap -> Stack
		String str = box1.content;				// Unboxing : Stack -> Heap
		System.out.println(str);

		/*
		 * Box를 생성할 때 타입 파라미터T 대신 Integer로 대체
		 */
		// Box<Integer> box2 = new Box<Integer>();
		Box<Integer> box2 = new Box<>();
		box2.content = 100;						// Boxing : Heap -> Stack
		int value = box2.content;				// Unboxing : Stack -> Heap
		System.out.println(value);
	}
}
