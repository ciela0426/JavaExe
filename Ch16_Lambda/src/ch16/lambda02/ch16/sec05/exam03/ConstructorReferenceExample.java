package ch16.lambda02.ch16.sec05.exam03;

public class ConstructorReferenceExample {
	public static void main(String[] args) {
		Person person = new Person();
		
		// Member class의 param 1개 생성자 method 전달
		Member m1 = person.getMember1(Member :: new);
		System.out.println(m1);
		System.out.println();

		// Member class의 param 2개 생성자 method 전달
		Member m2 = person.getMember2(Member :: new);
		System.out.println(m2);
	}
}
