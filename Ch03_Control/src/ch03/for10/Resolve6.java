package ch03.for10;

// 6. do~while문을 이용해서 1부터 10까지 합을 출력하세요
public class Resolve6 {
	public static void main(String[] args) {
		int i = 1;
		int result = 0;
		do {
			result += i;
			i++;
		} while (i <= 10);
		System.out.println(result);
	}
}
