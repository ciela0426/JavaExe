package ch08.class06;

/*
 * class로 묶은 variable을 쉽게 접근하는 것을 허용하면
 * 프로그래밍의 오류를 만드는 중대한 원인이 될 수 있음.
 * 
 * 그래서 class 내부에서만 사용하는 개념(private)과
 * 밖에서도 접근하는 개념(public)이 등장.
 * 
 * [객체지향의 기본 원칙]
 * field valuable : private으로 해주는 관습이 있다. (외부 사용 불허)
 * method : public으로 해주는 관습이 있다. (외부 사용 전제)
 */
public class Human {
	private String name;
	private int age;
	private double score;

	// setter method
	public void setName(String _name) { // setter
		name = _name;
	}

	public void setAge(int _age) { // setter
		if (_age < 0)
			return;
		age = _age;
	}

	public void setScore(double _score) { // setter
		if (_score < 0)
			return;
		score = _score;
	}
	
	// getter method
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public double getScore() {
		return score;
	}
}
