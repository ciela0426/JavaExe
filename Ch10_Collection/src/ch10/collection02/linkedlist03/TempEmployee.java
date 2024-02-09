package ch10.collection02.linkedlist03;

/**
 * 임시직 사원
 */
public class TempEmployee extends Employee {

	protected int yearSalary; // 연봉
	protected int hireYear; // 계약기간

	public TempEmployee(String empno, String name, int yearSalary, int hireYear) {
		super(empno, name);
		this.yearSalary = yearSalary;
		this.hireYear = hireYear;
	}

	public int getYearSalary() {
		return yearSalary;
	}

	public void setYearSalary(int yearSalary) {
		this.yearSalary = yearSalary;
	}

	public int getHireYear() {
		return hireYear;
	}

	public void setHireYear(int hireYear) {
		this.hireYear = hireYear;
	}

	@Override
	public double getMonthPay() {
		double mPay = (double) yearSalary / 12;
		return mPay;
	}

	@Override
	public void showEmployeeInfo() {
		super.showEmployeeInfo();
		System.out.println("yearSalary : " + yearSalary);
		System.out.println("hireYear : " + hireYear);
		System.out.printf("monthPay : %.2f\n", getMonthPay());
	}
}
