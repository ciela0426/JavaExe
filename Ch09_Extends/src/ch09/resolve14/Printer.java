package ch09.resolve14;

public class Printer {
	// 공통 field 생성
	private String modelName;				// 모델명
    private String manufacturer;			// 제조사
    private String interfaceType;			// 인터페이스 종류
    private int numOfPrints;				// 인쇄매수
    private int remainingPaper;				// 인쇄용지 잔량

    public Printer(String modelName, String manufacturer, String interfaceType, int numberOfPrints, int remainingPaper) {
        this.modelName = modelName;
        this.manufacturer = manufacturer;
        this.interfaceType = interfaceType;
        this.numOfPrints = numberOfPrints;
        this.remainingPaper = remainingPaper;
    }

    public void print() {
        if (remainingPaper > 0) {
            System.out.println("프린트 되었습니다.");
            remainingPaper--;
            numOfPrints++;
        } else {
            System.out.println("인쇄용지가 부족합니다.");
        }
    }
}