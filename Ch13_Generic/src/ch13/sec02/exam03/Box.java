package ch13.sec02.exam03;

public class Box<T> {
	public T content;
	
	public boolean compare(Box<T> other) {
		boolean result = content.equals(other.content);				// Object의 equals() method로 content 필드 값 비교
		return result;
	}
}
