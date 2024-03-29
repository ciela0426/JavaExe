package ch10.collection01.ch15.sec03.exam03;

import java.util.*;

public class HashSetExample {
	
	public static void printAll(Iterator<String> iterator) {
		while(iterator.hasNext()) {
			// 객체를 하나 가져오기
			String element = iterator.next();
			System.out.println(element);
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		// HashSet 컬렉션 생성
		Set<String> set = new HashSet<String>();
		
		// 객체 추가
		set.add("Java");
		set.add("JDBC");
		set.add("JSP");
		set.add("Spring");
		
		/*
		 * 다른 collection들도 Iterator interface를 상속받아 구현함
		 * Iterator는 데이터의 처음부터 끝까지 계속 가져오는데 사용된다.
		 * 
		 * 알고리즘이 다른 컬렉션을 Iterator라는 1가지 방식으로 가져올 수 있게 하므로 효율적임
		 */

//		List<String> list = new LinkedList<String>();
//		
//		list.add("홍길동");
//		list.add("임꺽정");
//		list.add("장길산");
//		list.add("일지매");
//		list.add("차돌바위");
//		list.add("머털이");

		// 객체를 하나씩 가져와서 처리
//		printAll(set.iterator());
//		printAll(list.iterator());
		
		Iterator<String> iterator = set.iterator();
		
		while(iterator.hasNext()) {
			// 객체를 하나 가져오기
			String element = iterator.next();
			System.out.println(element);
			if (element.equals("JSP")) {
				// 가져온 객체를 컬렉션에서 제거
				iterator.remove();
			}
		}
		System.out.println();
		
		// 객체 제거
		set.remove("JDBC");
		
		// 객체를 하나씩 가져와서 처리
		for(String element : set) {
			System.out.println(element);
		}
	}
}
