package ch10.collection02.linkedlist01;

import java.util.LinkedList;
import java.util.Scanner;

public class EmployeeManager {

	private Scanner sc = new Scanner(System.in);

	LinkedList<Employee> employeeList = new LinkedList<>();

	private int viewMenu() {
		System.out.println("[ 사원 선택 ]");
		System.out.println("1. 정규직");
		System.out.println("2. 임시직");
		System.out.println("3. 일용직");
		System.out.println("4. 전체정보보기");
		System.out.println("5. 정규직 보기");
		System.out.println("6. 임시직 보기");
		System.out.println("7. 일용직 보기");
		System.out.println("8. 종료");
		System.out.println("번호 입력 >> ");
		int sel = sc.nextInt();
		return sel;
	}

	private RegularEmployee createRegularEmployee() {
		System.out.println("사번 >> ");
		String empno = sc.next();
		System.out.println("이름 >> ");
		String name = sc.next();
		System.out.println("연봉 >> ");
		int yearSalary = sc.nextInt();
		System.out.println("보너스 >> ");
		int bonus = sc.nextInt();
		
		RegularEmployee emp = new RegularEmployee(empno, name, yearSalary, bonus);
		
		employeeList.add(emp);
		return emp;
	}

	private TempEmployee createTempEmployee() {
		System.out.println("사번 >> ");
		String empno = sc.next();
		System.out.println("이름 >> ");
		String name = sc.next();
		System.out.println("연봉 >> ");
		int yearSalary = sc.nextInt();
		System.out.println("계약 기간 >> ");
		int hireYear = sc.nextInt();
		
		TempEmployee emp = new TempEmployee(empno, name, yearSalary, hireYear);
		
		employeeList.add(emp);
		return emp;
	}

	private PartTimeEmployee createPartTimeEmployee() {
		System.out.println("사번 >> ");
		String empno = sc.next();
		System.out.println("이름 >> ");
		String name = sc.next();
		System.out.println("일급 >> ");
		int dailyPay = sc.nextInt();
		System.out.println("일한 일수 >> ");
		int workDay = sc.nextInt();
		
		PartTimeEmployee emp = new PartTimeEmployee(empno, name, dailyPay, workDay);
		
		employeeList.add(emp);
		return emp;
	}

	private void viewAllEmployeeInfo() {
		for (int i = 0; i < employeeList.size(); i++) {
	        employeeList.get(i).showEmployeeInfo();
		}
	}

	private void viewRegEmployeeInfo() {
	    for (int i = 0; i < employeeList.size(); i++) {
	        Employee emp = employeeList.get(i);
	        if (emp instanceof RegularEmployee)
	            emp.showEmployeeInfo();
	    }
	}

	private void viewTempEmployeeInfo() {
		for(int i = 0; i < employeeList.size() ;i++) {
			Employee emp = employeeList.get(i);
			if(emp instanceof TempEmployee)
				emp.showEmployeeInfo();
		}
	}

	private void viewPartEmployeeInfo() {
		for(int i = 0; i < employeeList.size(); i++) {
			Employee emp = employeeList.get(i);
			if(emp instanceof PartTimeEmployee)
				emp.showEmployeeInfo();
		}
	}

	public void run() {
		boolean isRun = true;

		while (isRun) {
			int selNum = viewMenu();
			switch (selNum) {
			case EmpMenu.REG_EMP: // 정규직
				createRegularEmployee();
				break;
			case EmpMenu.TEMP_EMP: // 임시직
				createTempEmployee();
				break;
			case EmpMenu.PART_EMP: // 일용직
				createPartTimeEmployee();
				break;
			case EmpMenu.ALL_INFO: // 전체정보보기
				viewAllEmployeeInfo();
				break;
			case EmpMenu.REG_INFO: // 정규직 보기
				viewRegEmployeeInfo();
				break;
			case EmpMenu.TEMP_INFO: // 임시직 보기
				viewTempEmployeeInfo();
				break;
			case EmpMenu.PART_INFO: // 일용직 보기
				viewPartEmployeeInfo();
				break;
			case EmpMenu.EXIT: // 프로그램 종료 -> isRun = false
				isRun = false;
				break;
			default:
				System.out.println("해당 항목이 존재하지 않습니다.");
				break;
			}
		}
		System.out.println("Program Exit...");
	}
}
