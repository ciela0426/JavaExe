package ch10.collection02.linkedlist03;

public abstract class Employee {
	protected String empno; // 사번
	protected String name; // 이름

	public Employee(String empno, String name) {
		this.empno = empno;
		this.name = name;
	}

	public void showEmployeeInfo() {
		System.out.println("--------------------------");
		System.out.println("empno : " + empno);
		System.out.println("name : " + name);
	}

	public abstract double getMonthPay(); // 추상 Method

	public String getEmpno() {
		return empno;
	}

	public void setEmpno(String empno) {
		this.empno = empno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
