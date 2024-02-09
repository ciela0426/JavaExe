package ch10.collection02.linkedlist03;

/**
 * 일용직 사원
 */
public class PartTimeEmployee extends Employee {

	protected int dailyPay; // 일급
	protected int workDay; // 일한 일수

	public PartTimeEmployee(String empno, String name, int dailyPay, int workDay) {
		super(empno, name);
		this.dailyPay = dailyPay;
		this.workDay = workDay;
	}

	public int getDailyPay() {
		return dailyPay;
	}

	public void setDailyPay(int dailyPay) {
		this.dailyPay = dailyPay;
	}

	public int getWorkDay() {
		return workDay;
	}

	public void setWorkDay(int workDay) {
		this.workDay = workDay;
	}

	@Override
	public double getMonthPay() {
		double mPay = dailyPay * workDay;
		return mPay;
	}

	@Override
	public void showEmployeeInfo() {
		super.showEmployeeInfo();
		System.out.println("dailyPay : " + dailyPay);
		System.out.println("workDay : " + workDay);
		System.out.printf("monthPay : %.2f\n", getMonthPay());
	}
}
