package ch10.collection01.ch15.sec05.exam03;

import java.util.TreeSet;

public class ComparableExample {
	public static void main(String[] args) {
		// TreeSet 컬렉션 생성
		TreeSet<Person> treeSet = new TreeSet<Person>();
		
		// 객체 저장
		treeSet.add(new Person("홍길동", 45));
		treeSet.add(new Person("감자바", 25));
		treeSet.add(new Person("박지원", 31));
		treeSet.add(new Person("임꺽정", 46));
		treeSet.add(new Person("장길산", 81));
		treeSet.add(new Person("일지매", 34));
		treeSet.add(new Person("차돌바위", 37));
		treeSet.add(new Person("머털이", 64));
		treeSet.add(new Person("머털도사", 26));
		treeSet.add(new Person("둘리", 1));
		treeSet.add(new Person("스머프", 38));
		treeSet.add(new Person("미키마우스", 92));
		
		// 객체를 하나씩 가져오기
		for(Person person : treeSet) {
			System.out.println(person.name + " : " + person.age);
		}
	}
}
