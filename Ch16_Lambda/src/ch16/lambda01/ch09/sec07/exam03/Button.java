package ch16.lambda01.ch09.sec07.exam03;

public class Button {
	// 정적 멤버 인터페이스
	public static interface ClickListener {
		// 추상 메소드
		void onClick();
	}
	
	// field
	private ClickListener clickListener;
	
	// method
	public void setClickListener(ClickListener clickListener) {
		this.clickListener = clickListener;
	}
	
	public void click() {
		this.clickListener.onClick();
	}
}
