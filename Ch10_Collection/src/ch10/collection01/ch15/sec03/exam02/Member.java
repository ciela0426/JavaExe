package ch10.collection01.ch15.sec03.exam02;

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
		return name.hashCode() + age;
	}
	
	// equals 재정의
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Member target) {
			// name과 age값이 같으면 true가 return됨
			return target.name.equals(name) && (target.age == age);
		} else {
			return false;
		}
	}
}
