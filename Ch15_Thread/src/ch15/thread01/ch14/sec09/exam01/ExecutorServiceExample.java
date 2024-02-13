package ch15.thread01.ch14.sec09.exam01;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceExample {
	public static void main(String[] args) {
		
		// thread풀 생성
		ExecutorService exevutorService = Executors.newFixedThreadPool(5);
		
		exevutorService.shutdownNow();
	}
}
