package ch13.sec03.exam01;

public class Box<T> {
	// field
	private T t;
	
	// Getter Method
	public T get() {
		return t;
	}
	
	// Setter Method
	public void set(T t) {
		this.t = t;
	}
}
