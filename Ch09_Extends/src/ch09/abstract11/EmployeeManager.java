package ch09.abstract11;

import java.util.Arrays;
import java.util.Scanner;

public class EmployeeManager {
	private final int EMP_NUM = 100; // 100명 사원이 최대
	// Employee의 자식객체들을 저장
	private Employee[] empArr = new Employee[EMP_NUM];
	private int numOfEmp = 0; // 저장된 사원객체 수, 다음 사원이 저장 될 index
	private Scanner sc = new Scanner(System.in);

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
		return emp;
	}

	private boolean saveEmployee(Employee emp) {
		boolean isSave = true;

		if (this.numOfEmp < EMP_NUM) { // 저장공간이 꽉 차면 저장 실패함
			this.empArr[this.numOfEmp] = emp;
			this.numOfEmp++;
			isSave = true;
		} else {
			isSave = false;
		}

		return isSave;
	}

	private void viewAllEmployeeInfo() {
		for (int i = 0; i < this.numOfEmp; i++) {
			this.empArr[i].showEmployeeInfo();
		}
	}

	private void viewRegEmployeeInfo() {
		for(int i=0;i<this.numOfEmp;i++) {
			Employee emp = this.empArr[i];
			if(emp instanceof RegularEmployee)
				this.empArr[i].showEmployeeInfo();
		}
	}

	private void viewTempEmployeeInfo() {
		for(int i=0;i<this.numOfEmp;i++) {
			Employee emp = this.empArr[i];
			if(emp instanceof TempEmployee)
				this.empArr[i].showEmployeeInfo();
		}
	}

	private void viewPartEmployeeInfo() {
		for(int i=0;i<this.numOfEmp;i++) {
			Employee emp = this.empArr[i];
			if(emp instanceof PartTimeEmployee)
				this.empArr[i].showEmployeeInfo();
		}
	}

	public void run() {
		boolean isRun = true;

		while (isRun) {
			int selNum = viewMenu();
			Employee emp = null;
			switch (selNum) {
			case EmpMenu.REG_EMP: // 정규직
				emp = createRegularEmployee();
				break;
			case EmpMenu.TEMP_EMP: // 임시직
				emp = createTempEmployee();
				break;
			case EmpMenu.PART_EMP: // 일용직
				emp = createPartTimeEmployee();
				break;
			case EmpMenu.ALL_INFO: // 전체정보보기
				emp = null;
				viewAllEmployeeInfo();
				break;
			case EmpMenu.REG_INFO: // 정규직 보기
				emp = null;
				viewRegEmployeeInfo();
				break;
			case EmpMenu.TEMP_INFO: // 임시직 보기
				emp = null;
				viewTempEmployeeInfo();
				break;
			case EmpMenu.PART_INFO: // 일용직 보기
				emp = null;
				viewPartEmployeeInfo();
				break;
			case EmpMenu.EXIT: // 프로그램 종료 -> isRun = false
				emp = null;
				isRun = false;
				break;
			default:
				emp = null;
				System.out.println("해당 항목이 존재하지 않습니다.");
				break;
			}
			// emp 객체가 존재한다면
			if (emp != null) {
				boolean isSave = saveEmployee(emp);
				if (!isSave) {
					System.out.println("더 이상 저장 공간이 없습니다.");
				}
			}
		}
		System.out.println("Program Exit...");
	}
}
