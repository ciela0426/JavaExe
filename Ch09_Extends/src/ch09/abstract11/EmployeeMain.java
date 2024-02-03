package ch09.abstract11;

public class EmployeeMain {
	public static void testInstanceOf () {
		EmployeeManager em = new EmployeeManager();
		em.run();
		
//		RegularEmployee regEmp  = new RegularEmployee("1111","dkkdkd", 1111, 11);
//		Employee emp = regEmp;
//		if (emp instanceof RegularEmployee) System.out.println("emp는 RegulaerEmployee의 객체이거나 자식 객체입니다.");
//		if (emp instanceof TempEmployee) System.out.println("emp는 TempEmployee의 객체이거나 자식 객체입니다.");
//		if (emp instanceof PartTimeEmployee) System.out.println("emp는 PartTimeEmployee의 객체이거나 자식 객체입니다.");
	}
	public static void main(String[] args) {
		testInstanceOf();
	}
}
