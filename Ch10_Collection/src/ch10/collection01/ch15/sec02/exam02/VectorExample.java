package ch10.collection01.ch15.sec02.exam02;

import java.util.List;
import java.util.Vector;

/*
 * ArrayList와 동일
 * 
 * 멀티스레드 환경에서 2개 이상의 스레드가 동시접근할 때 안전하다.
 * 1개 스레드일 때는 ArrayList보다 약간의 성능 저하가 있다.(동기화 처리 때문에)
 */
public class VectorExample {
	public static void main(String[] args) {
		// Vector 컬렉션 생성
		List<Board> list = new Vector<>();

		// 작업 thread object 생성
		Thread threadA = new Thread() {
			@Override
			public void run() {
				// 객체 1000개 추가
				for (int i = 1; i <= 1000; i++) {
					list.add(new Board("제목" + i, "내용" + i, "글쓴이" + i));
				}
			}
		};

		// 작업 thread object 생성
		Thread threadB = new Thread() {
			@Override
			public void run() {
				// 객체 1000개 추가
				for (int i = 1001; i <= 2000; i++) {
					list.add(new Board("제목" + i, "내용" + i, "글쓴이" + i));
				}
			}
		};

		// 작업 Thread 실행
		threadA.start();
		threadB.start();

		// 작업 Thread들이 모두 종료될 떄까지 메인 Thread를 기다리게 함
		try {
			threadA.join();
			threadB.join();
		} catch (Exception e) {

		}

		// 저장된 총 객체 수 얻기
		int size = list.size();
		System.out.println("총 객체 수 : " + size);
		System.out.println();
	}
}
