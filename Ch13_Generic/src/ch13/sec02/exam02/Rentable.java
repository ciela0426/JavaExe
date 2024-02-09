package ch13.sec02.exam02;

public interface Rentable<P> {			// 타입 파라미터 P정의
	P rent();							// 타입 파라미터 P를 리턴 타입으로 사용
}
