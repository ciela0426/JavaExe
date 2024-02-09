package ch13.sec02.exam01;

// 제네릭 타입
public class Product<K, M> {				// type parameter로 K와 M정의
	
	// field , type parameter를 field type으로 사용
	private K kind;
	private M model;
	
	// method, type parameter를 return type과 매개변수 타입으로 사용
	public K getKind() { return this.kind; }
	public M getModel() { return this.model; }
	public void setKind(K kind) { this.kind = kind; }
	public void setModel(M model) { this.model = model; }
}
