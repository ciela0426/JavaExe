package ch10.collection01.ch15.sec02.exam03;

import java.math.BigInteger;

public class PerformanceEx {
	public static void main(String[] args) {
		
		BigInteger result = new BigInteger("1");
		BigInteger sum = new BigInteger("0");		
		BigInteger two = new BigInteger("2");		
		
		long cnt = 0;
//		long result = 1;
//		long sum = 0;
		
		for (int i = 0; i < 128; i++) {
			result = BigInteger.valueOf(1);
//			result = 1;
			for (int j = 0; j < cnt; j++) {
				result = result.multiply(BigInteger.TWO);
//				result *= 2;
			}
			System.out.println("result = " + result);
			sum = sum.add(result);
//			sum += result;
			System.out.println("sum = " + sum);
			cnt++;
		}
		
		System.out.println("트리 최대 128 검색할 수 있는 최대 수는 " + sum + "입니다.");
	}
}
