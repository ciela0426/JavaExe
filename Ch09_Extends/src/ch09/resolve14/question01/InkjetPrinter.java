package ch09.resolve14.question01;

public class InkjetPrinter extends Printer {
	
	protected int inkRemainders;

	public InkjetPrinter(String modelName, String manufacturer, P_INTERFACE pInterface, int printCount,
			int paperRemains, int inkRemainders) {
		super(modelName, manufacturer, pInterface, printCount, paperRemains);
		this.inkRemainders = inkRemainders;
	}

	@Override
	public void print() {
		super.print();					// 종이 1장 사용
		System.out.println("잉크가 잘 분사되어 출력된다.");
		System.out.println("품질이 양호하다.");
	}

	@Override
	public String toString() {
		return "InkjetPrinter [inkRemainders=" + inkRemainders + ", modelName=" + modelName + ", manufacturer="
				+ manufacturer + ", pInterface=" + pInterface + ", printCount=" + printCount + ", paperRemains="
				+ paperRemains + "]";
	}

}
