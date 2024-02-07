package ch11.string01;

public class StringHashCode {
	public static void main(String[] args) {
		String str0 = "Hello, Java";
		String str1 = "Hello, Java";
		String str2 = new String("Hello, Java");
		
		System.out.println(str0);
		System.out.println(str1);
		System.out.println(str2);
		
		/* 
		 * String의 hashCode()는 일반객체와 다르다.
		 * 
		 * 일반객체 : 주소의 hash화
		 * String : 문자의 내용을 정수로 변환
		 * 
		 * 문자열 내용이 같으면 동일한 hashCode()를 리턴한다. (객체의 공간이 다른지 여부와 관계없이)
		 */
		System.out.println(str0.hashCode());
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
	}
}
