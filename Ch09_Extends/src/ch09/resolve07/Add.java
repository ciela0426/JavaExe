package ch09.resolve07;

public class Add {
	public int a;
	public int b;
	
	public void setValue(int _a, int _b) {
		this.a = _a;
		this.b = _b;
	}
	
	public int caculate() {
		int result = a + b;
		return result;
	}
}
