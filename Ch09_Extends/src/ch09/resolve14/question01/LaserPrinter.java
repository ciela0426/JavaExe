package ch09.resolve14.question01;

public class LaserPrinter extends Printer {
	
	protected int tonerRemainders;

	public LaserPrinter(String modelName, String manufacturer, P_INTERFACE pInterface, int printCount,
			int paperRemains, int tonerRemainders) {
		super(modelName, manufacturer, pInterface, printCount, paperRemains);
		this.tonerRemainders = tonerRemainders;
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		super.print();					// 종이 1장 사용
		System.out.println("토너가 잘 분사되어 출력된다.");
		System.out.println("품질이 양호하다.");
	}

	@Override
	public String toString() {
		return "LaserPrinter [tonerRemainders=" + tonerRemainders + ", modelName=" + modelName + ", manufacturer="
				+ manufacturer + ", pInterface=" + pInterface + ", printCount=" + printCount + ", paperRemains="
				+ paperRemains + "]";
	}

}
