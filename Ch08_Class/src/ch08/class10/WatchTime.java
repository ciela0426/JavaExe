package ch08.class10;

/**
 * Method(함수)의 오버로딩(Overloading)
 * ; Java는 함수의 이름은 동일하지만 매개변수가 다른 함수를 여러 개 만들 수 있다.
 * 	 실행할 때 매개변수의 종류에 따라 함수를 구별할 수 있기 떄문에
 */
public class WatchTime {
	private int hour, min, sec;
	private String strHour, strMin, strSec;
	private boolean isNum = true;
	
	public WatchTime(int hour, int min, int sec) {
		this.hour = hour;
		this.min = min;
		this.sec = sec;
		this.isNum = true;
	}
	public WatchTime (String strHour, String strMin, String strSec) {
		this.strHour = strHour;
		this.strMin = strMin;
		this.strSec = strSec;
		this.isNum = false;
	}
	public void viewTime() {
		if (isNum) {
			System.out.printf("[%02d:%02d:%02d]\n", hour, min, sec);
		} else {
			System.out.printf("- %s %s %s -\n", strHour, strMin, strSec);
		}
	}
	// main 은 public 안에 꼭 넣어야 함 + public이 한 파일에 두 개일 수 없음
	public static void main(String[] args) {
		WatchTime wtNum = new WatchTime(12, 13, 33);
		wtNum.viewTime();
		
		WatchTime stStr = new WatchTime("열두시", "이십분", "오십초");
		stStr.viewTime();
	}
}