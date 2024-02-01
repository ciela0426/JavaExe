package ch09.resolve07;

/*
 * 5. 다음 클래스를 정의하세요
   1) 어린아이가 가지고 있는 구슬 개수 정보를 담을 수 있다
   2) 놀이를 통한 구슬의 주고받음을 표현하는 메소드가 존재한다
   3) 어린이의 현재 구슬 개수를 출력하는 메소드가 존재한다.
 
   main에서는 객체를 이렇게 만듭니다
     어린이1의 보유자산 -> 구슬 15개
     어린이2의 보유자산 -> 구슬 9개
     1차 놀이에서 어린이1은 어린이2의 구슬 2개를 획득한다
     2차 놀이에서 어린이2는 어린이 1의 구슬 7개를 획득한다
     마지막으로 각각의 어린이가 보유하고 있는 구슬의 수를 출력한다
     프로그램을 종료한다.
 */
public class Child {
	private int marbles;

    // 아이가 가진 구슬 수 초기화
    public Child(int marbles) {
        this.marbles = marbles;
    }

    // 구슬 주고받기 Method 
    public void playWith(Child otherChild, int marblesToGive) {
        // 아이가 다른 아이에게 구슬 줌
        this.marbles -= marblesToGive;
        otherChild.receiveMarbles(marblesToGive);
    }

    // 구슬을 받았을 때 Method
    private void receiveMarbles(int marblesToReceive) {
        this.marbles += marblesToReceive;
    }

    // 현재 구슬 수 get Method
    public int getMarbles() {
        return marbles;
    }
}
