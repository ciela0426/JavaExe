package ch10.collection01.ch15.sec03.exam02;

/*
 * Member 객체의 내용(이름, 나이)으로 객체를 비교하기 위해
 * Object로부터 상속받은 hashCode()와 equals()를 overriding해 객체 내의 필드 내용으로 비교한다.
 * 
 * overriding하지 않으면 각 객체의 해시값과 주소를 가지고 비교한다.
 * 
 * 그러므로 주소록같은 데이터를 저장할 때는 아래처럼 하는 것이 필요하다.
 */
public class Member {
	public String name;
	public int age;

	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// hashcode 재정의 / name과 age값이 같으면 동일한 hashCode가 return됨
	@Override
	public int hashCode() {
		// return super.hashCode(); 		// default 16진수 해시값 
		return name.hashCode() + age;
	}

	// equals 재정의
	@Override
	public boolean equals(Object obj) {
		// Member target = null;
		// if(obj istanceof Member)
		//		target = (Member)obj;
		if (obj instanceof Member target) {
			// name과 age값이 같으면 true가 return됨
			return target.name.equals(name) && (target.age == age);
		} else {
			return false;
		}
	}
}
