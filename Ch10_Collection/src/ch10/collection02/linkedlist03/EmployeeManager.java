package ch10.collection02.linkedlist03;

import java.util.Iterator;
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
		System.out.println("8. 직원 수정");
		System.out.println("9. 직원 삭제");
		System.out.println("10. 종료");
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

    private Employee searchEmployeeByNumber(String empno) {
        for (Employee emp : employeeList) {
            if (emp.getEmpno().equals(empno)) {
                return emp;
            }
        }
        return null; // 해당 번호의 직원이 없을 경우 null 반환
    }
    
 // 직원 번호로 직원 정보 편집
    private void editEmployeeByNumber(String empno) {
        Employee emp = searchEmployeeByNumber(empno);
        if (emp != null) {
            // 검색된 직원이 있을 경우 정보 편집
            System.out.println("새로운 정보를 입력하시오 (사번 : " + empno + ") :");
            if (emp instanceof RegularEmployee) {
                RegularEmployee regEmp = (RegularEmployee) emp;
                System.out.println("수정할 연봉 >> ");
                regEmp.setYearSalary(sc.nextInt());
                System.out.println("수정할 보너스 >> ");
                regEmp.setBonus(sc.nextInt());
            } else if (emp instanceof TempEmployee) {
                TempEmployee tempEmp = (TempEmployee) emp;
                System.out.println("수정할 연봉 >> ");
                tempEmp.setYearSalary(sc.nextInt());
                System.out.println("수정할 계약기간 >> ");
                tempEmp.setHireYear(sc.nextInt());
            } else if (emp instanceof PartTimeEmployee) {
                PartTimeEmployee partEmp = (PartTimeEmployee) emp;
                System.out.println("수정할 일급 >> ");
                partEmp.setDailyPay(sc.nextInt());
                System.out.println("수정한 일한 일수 >> ");
                partEmp.setWorkDay(sc.nextInt());
            }
            System.out.println("직원 정보가 성공적으로 업데이트 되었습니다.");
        } else {
            System.out.println("직원을 찾을 수 없습니다.");
        }
    }

    // 직원 번호로 직원 삭제
    private void deleteEmployeeByNumber(String empno) {
        Iterator<Employee> iterator = employeeList.iterator();
        while (iterator.hasNext()) {
            Employee emp = iterator.next();
            if (emp.getEmpno().equals(empno)) {
                iterator.remove();
                System.out.println("직원 " + empno + "이 삭제되었습니다.");
                return;
            }
        }
        System.out.println("직원을 찾을 수 없습니다.");
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
            case EmpMenu.EDIT_EMP:
                System.out.println("수정할 직원의 사번을 입력하시오 >> ");
                editEmployeeByNumber(sc.next());
                break;
            case EmpMenu.DELETE_EMP:
                System.out.println("삭제할 직원의 사번을 입력하시오 >> ");
                deleteEmployeeByNumber(sc.next());
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
