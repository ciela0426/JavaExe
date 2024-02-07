package ch10.collection01.ch15.sec03.exam02;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
	public static void main(String[] args) {
		// HashSet 컬렉션 생성
		Set<Member> set = new HashSet<Member>();
		
		Member mem0 = new Member("홍길동", 30);
		Member mem1 = new Member("홍길동", 30);
		
		System.out.println(mem0.hashCode());
		System.out.println(mem1.hashCode());
		
		// Member 객체 저장
		set.add(mem0); // 인스턴스는 다르지만 동등 객체이므로 객체 1개만 저장
		set.add(mem1);			// 내부에서 hashCode() => equals() 비교 후 같다고 판단됨
		
		// 저장된 객체 수 출력
		System.out.println("총 객체 수 : " + set.size());
		
		set.add(new Member("임꺽정", 30));
	}
}
