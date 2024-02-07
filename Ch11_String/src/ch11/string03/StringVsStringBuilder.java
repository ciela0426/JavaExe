package ch11.string03;

/*
 * String : immutable(불변)
 * StringBuilder : mutable(변함)
 * StringBuffer : mutable(변함), multi thread 동기화 처리
 */
public class StringVsStringBuilder {
	
	// method
	public static long getStringSpeed() {
		
		String str = "";
		long start = System.nanoTime();
		
		for (int i = 0; i < 26; i++)
			str += (char)('a' + i); 		// 형변환 안 하면 숫자로 계산해버림
		
		long end = System.nanoTime();
		
		System.out.println("String : \t" + str);
		
		return end-start;
	}
	
	public static long getStringBuilderSpeed() {
		
		StringBuilder strBuilder = new StringBuilder(26);
		long start = System.nanoTime();
		
		for (int i = 0; i < 26; i++)
			strBuilder.append((char)('a' + i)); 		// 형변환 안 하면 숫자로 계산해버림
		
		long end = System.nanoTime();
		
		System.out.println("strBuilder : \t" + strBuilder.toString());
		
		return end-start;
	}
	
	public static void main(String[] args) {
		long strNanoTime = getStringSpeed();
		long strBuilderNanoTime = getStringBuilderSpeed();
//		getStringSpeed();
//		getStringBuilderSpeed();
		System.out.println("String 시간 = " + strNanoTime);
		System.out.println("StringBuilder 시간 = " + strBuilderNanoTime);
	}
}
