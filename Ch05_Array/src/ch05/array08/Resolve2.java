package ch05.array08;

import java.util.Arrays;

//2. 정수 배열 5개를 할당하고
//   Arrays.sort를 사용하지 않고 최소값과 최대값을 얻으세요
public class Resolve2 {
	public static void main(String[] args) {
		int[] arrayInt = {35, 73, 3, 24, 87};
		
		Arrays.sort(arrayInt);
		
		int min = arrayInt[0];
		int max = arrayInt[0];
		
		for (int i = 1; i < arrayInt.length; i++) {
			if (arrayInt[i] < min) {
				min = arrayInt[i];
			} else if (arrayInt[i] > max) {
				max = arrayInt[i];
			}
		}
		
		System.out.println("최소값 : " + min);
		System.out.println("최대값 : " + max);
	}
}
