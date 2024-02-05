package ch09.resolve14.printerType;

import ch09.resolve14.Printer;

public class InkjetPrinter extends Printer {
	
    private int inkLevel;			// 잉크 잔량

    public InkjetPrinter(String modelName, String manufacturer, String interfaceType, int numOfPrints, int remainingPaper, int inkLevel) {
        super(modelName, manufacturer, interfaceType, numOfPrints, remainingPaper);
        this.inkLevel = inkLevel;
    }

    @Override
    public void print() {
        if (inkLevel > 0) {
            super.print();
            System.out.println("잉크 잔량 : " + --inkLevel);
        } else {
            System.out.println("잉크가 다 소진되었습니다.");
        }
    }
}
