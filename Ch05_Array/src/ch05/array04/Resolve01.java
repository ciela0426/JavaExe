package ch05.array04;

//1. String 배열을 10명의 이름으로 초기화하고 순서대로 출력하세요
public class Resolve01 {
	public static void main(String[] args) {
		String[] names = { "이름1", "이름2", "이름3", "이름4", "이름5", "이름6", "이름7", "이름8", "이름9", "이름10" };

		for(int i = 0; i < names.length; i++) {
			if (i + 1 == names.length) {
				System.out.print(names[i]);
			} else {
				System.out.print(names[i] + ", ");
			}
		}

//		for (String name : names) {
//			System.out.print(name + ", ");
//		}
	}
}
