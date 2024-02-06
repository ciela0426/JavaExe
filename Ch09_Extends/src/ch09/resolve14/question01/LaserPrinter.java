package ch09.resolve14.question01;

public class LaserPrinter extends Printer {
	
	protected double tonerRemainders;

	public LaserPrinter(String modelName, String manufacturer, P_INTERFACE pInterface, int printCount,
			int paperRemains, double tonerRemainders) {
		super(modelName, manufacturer, pInterface, printCount, paperRemains);
		this.tonerRemainders = tonerRemainders;
	}

	@Override
	public void print() {
		super.print();					// 종이 1장 사용
		this.printCount++;
		this.tonerRemainders *= 0.99;
		System.out.println("빠르게 출력된다.");
		System.out.println("품질이 매우 양호하다.");
	}

	@Override
	public String toString() {
		return "LaserPrinter [tonerRemainders=" + tonerRemainders + ", modelName=" + modelName + ", manufacturer="
				+ manufacturer + ", pInterface=" + pInterface + ", printCount=" + printCount + ", paperRemains="
				+ paperRemains + "]";
	}

}
