package ch09.resolve14.printerType;

import ch09.resolve14.Printer;

public class LaserPrinter extends Printer {
	
    private int tonerLevel;			// 토너 잔량

    public LaserPrinter(String modelName, String manufacturer, String interfaceType, int numOfPrints, int remainingPaper, int tonerRemaining) {
        super(modelName, manufacturer, interfaceType, numOfPrints, remainingPaper);
        this.tonerLevel = tonerRemaining;
    }

    @Override
    public void print() {
        if (tonerLevel > 0) {
            super.print();
            System.out.println("토너 잔량 : " + --tonerLevel);
        } else {
            System.out.println("토너가 다 소진되었습니다.");
        }
    }
}