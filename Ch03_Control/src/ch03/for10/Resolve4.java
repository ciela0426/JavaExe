package ch03.for10;

// 4. do~while문을 이용해서 1부터 100까지 출력하세요
public class Resolve4 {
	public static void main(String[] args) {
		int i = 1;
		do {
			if (i == 100) System.out.print(i);
			else System.out.print(i + ", ");
			i++;
		} while (i <= 100);
	}
}
