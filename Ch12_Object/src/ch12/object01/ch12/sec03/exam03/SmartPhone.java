package ch12.object01.ch12.sec03.exam03;

public class SmartPhone {
	private String company;
	private String os;
	
	public SmartPhone(String company, String os) {
		this.company = company;
		this.os = os;
	}
	
	//	tostr 치고 control + cmc + spacebar 하면 toString() 자동완성 

	/*
	 * Object의 toString() method를 재정의해서 제조사와 운영체제가 결합된 문자열을 리턴하도록 함
	 */
	@Override
	public String toString() {
		return company + ", " + os;
	}
}
