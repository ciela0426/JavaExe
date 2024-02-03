package ch09.resolve14;

import java.util.Scanner;

import ch09.abstract11.EmpMenu;
import ch09.abstract11.Employee;

public class Printer {
	private Scanner sc = new Scanner(System.in);

	protected String model; 				// 모델명
	protected String company; 				// 제조사
	protected String interfaceType; 		// 인터페이스 종류 (USB, paraller port)
	protected int printNum; 				// 인쇄 매수
	protected int remain; 					// 인쇄 종이 잔량
	
	public Printer(String model, String company, String interfaceType, int printNum, int remain) {
		this.model = model;
		this.company = company;
		this.interfaceType = interfaceType;
		this.printNum = printNum;
		this.remain = remain;
	}
	
	public Printer() {
		
	}

	private int viewMenu() {
		System.out.println("[ 프린터 선택 ]");
		System.out.println("1. 잉크젯");
		System.out.println("2. 레이저");
		System.out.println("3. 잉크젯 프린터 정보보기");
		System.out.println("4. 레이저 프린터 정보보기");
		System.out.println("5. 종료");
		System.out.println("번호 입력 >> ");
		int sel = sc.nextInt();
		return sel;
	}

	public void showPrinterInfo() {
		System.out.println("----------------------");
		System.out.printf("모델명 : %s\n제조사 : %s\n인터페이스 종류 : %s\n인쇄 매수 : %d\n인쇄 종이 잔량 : %d\n\n\n",
				model, company, interfaceType,printNum, remain);
	}
	
	public void run() {
		boolean isRun = true;

		while (isRun) {
			int selNum = viewMenu();
			switch (selNum) {
			case PrinterMenu.INKJET: // 잉크젯
				break;
			case PrinterMenu.LAZER: // 레이저
				break;
			case PrinterMenu.INKJET_INFO: // 잉크젯 정보보기
				showPrinterInfo();
				break;
			case PrinterMenu.LAZER_INFO: // 레이저 정보보기
				showPrinterInfo();
				break;
			case PrinterMenu.EXIT: // 프로그램 종료 -> isRun = false
				isRun = false;
				break;
			default:
				System.out.println("해당 항목이 존재하지 않습니다.");
				break;
			}
		}
		System.out.println("프린터를 종료합니다...");
	}
}
