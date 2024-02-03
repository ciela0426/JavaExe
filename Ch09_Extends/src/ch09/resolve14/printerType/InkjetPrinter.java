package ch09.resolve14.printerType;

import ch09.resolve14.Printer;

public class InkjetPrinter extends Printer {
	
	protected int inkLevel;				// 잉크 잔량
	
	public InkjetPrinter(String model, String company, String interfaceType, int printNum, int remain, int inkLevel) {
		super(model, company, interfaceType, printNum, remain);
		this.inkLevel = inkLevel;
	}

//	@Override
//	public void print() throws InterruptedException {
//		System.out.println("InkjetPrinter - 인쇄 되었습니다.");
//	}
//
//	@Override
//	public void copy() throws InterruptedException {
//		System.out.println("InkjetPrinter - 복사 되었습니다.");
//	}
//
//	@Override
//	public void fax() throws InterruptedException {
//		System.out.println("InkjetPrinter - 팩스가 전송 되었습니다.");
//	}
}
