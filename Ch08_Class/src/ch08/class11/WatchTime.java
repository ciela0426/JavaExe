package ch08.class11;

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
		System.out.println("this : " + this); // this = 객체를 의미하는 참조변수 
		this.hour = hour;
		this.min = min;
		this.sec = sec;
		this.isNum = true;
	}
//	public WatchTime (String strHour, String strMin, String strSec) {
//		System.out.println("this : " + this);
//		this.strHour = strHour;
//		this.strMin = strMin;
//		this.strSec = strSec;
//		this.isNum = false;
//	}
	
	// public void viewTime(WatchTime this)
	public void viewTime() { //지역 변수에 똑같은 변수가 없으면 굳이 this를 쓰지 않아도 됨
//		if (isNum) {
			System.out.printf("[%02d:%02d:%02d]\n", hour, min, sec);
//		} else {
//			System.out.printf("- %s %s %s -\n", strHour, strMin, strSec);
//		}
	}
	// main 은 public 안에 꼭 넣어야 함 + public이 한 파일에 두 개일 수 없음
	public static void main(String[] args) {
		WatchTime wtNum = new WatchTime(12, 13, 33);
		System.out.println("wtNum : " + wtNum);
		System.out.printf("wtNum : %x\n", wtNum.hashCode()); // 물리적인 위치를 찾기 위한 참조값
		wtNum.viewTime();		// viewTime(wtNum);

		WatchTime wtNum1 = new WatchTime(13, 23, 53);
		System.out.println("wtNum1 : " + wtNum1);
		System.out.printf("wtNum1 : %x\n", wtNum1.hashCode());
		wtNum1.viewTime();		// viewTime(wtNum1);
		
//		WatchTime stStr = new WatchTime("열두시", "이십분", "오십초");
//		System.out.println("stStr : " + stStr);
//		System.out.printf("stStr : %x\n", stStr.hashCode());
//		stStr.viewTime();
	}
}