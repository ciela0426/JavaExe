package ch05.array04;

//4. int배열을 10개 생성하세요.
//int배열에 3의 배수를 차례대로 저장하세요.
//그리고 거꾸로 출력하세요.
public class Resolve04 {
	public static void main(String[] args) {
		int[] num = new int[10];
		
		
		for (int i = 0; i < num.length; i++) {
			if (i % 3 == 0) {
				num[i] += i + 1; 
			}
		}
		
		System.out.println(num[2]);

//		for (int i = num.length; i > 0; i--) {
//			if (i == 1) {
//				System.out.print(num[i - 1]);
//			} else {
//				System.out.print(num[i - 1] + ", ");
//			}
//		}
	}
}
