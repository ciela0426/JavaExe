package ch05.array08;

import java.util.Arrays;

// 1. 정수 배열 5개를 할당하고
//Arrays.sort를 활용해서 최소값과 최대값을 얻으세요 
public class Resolve1 {
	public static void main(String[] args) {
		int[] arrayInt = {35, 73, 3, 24, 87};
		
		Arrays.sort(arrayInt);
		
//		System.out.println(Arrays.toString(arrayInt));
		
		System.out.println("최소값 : " + arrayInt[0]);
		System.out.println("최대값 : " + arrayInt[arrayInt.length - 1]);
	}
}
