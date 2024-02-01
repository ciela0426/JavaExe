package ch09.resolve07;

import java.util.Arrays;
import java.util.Scanner;


/*
1. 클래스 Add
   클래스 Sub
   클래스 Mul
   클래스 Div을 만드세요
   이들은 다음 필드와 메서드를 가집니다
   int타입의 a, b 필드 : 연산하고자 하는 값
   void setValue(int _a, int _b) : 연산값을 전달받아 필드에 저장
   int calculate() : 해당 클래스의 목적에 맞는 연산을 실행하고 결과를 리턴합니다

2. 밑변과 높이 정보를 저장할 수 있는 Triangle클래스를 정의합니다
   생성과 동시에 초기화가 가능한 생성자도 정의합니다
   밑변과 높이 정보를 변경시킬 수 있는 메소드를 정의합니다
   삼각형의 넓이를 계산해서 반환하는 메소드도 정의합니다
   객체를 만들어서 사용해보세요
   
3. 다음 두 개의 static메소드를 가진 ArrayUtility클래스를 만들어보고 사용해보세요
  static double[] intToDouble(int[] source);	// int배열을 double배열로 변환
  static int[] doubleToInt(double[] source);	// double배열을 int배열로 변환

4. 다음 두 개의 static 가진 ArrayUtility2클래스를 만들어보고 사용하세요
  static int[] concat(int[] s1, int[] s2);	// s1과 s2를 연결한 새로운 배열 리턴
  static int[] remove(int[] s1, int[] s2);	// s1에서 s2배열의 숫자를 모두 삭제한 새로운 배열 리턴
  
5. 다음 클래스를 정의하세요
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

public class QuestionClass {


	public static void printMenu() {
	//menuStr에 문제를 복사한다
	String menuStr = 
			"1. 클래스 Add\n"
			+ "   클래스 Sub\n"
			+ "   클래스 Mul\n"
			+ "   클래스 Div을 만드세요\n"
			+ "   이들은 다음 필드와 메서드를 가집니다\n"
			+ "   int타입의 a, b 필드 : 연산하고자 하는 값\n"
			+ "   void setValue(int _a, int _b) : 연산값을 전달받아 필드에 저장\n"
			+ "   int calculate() : 해당 클래스의 목적에 맞는 연산을 실행하고 결과를 리턴합니다\n"
			+ "\n"
			+ "2. 밑변과 높이 정보를 저장할 수 있는 Triangle클래스를 정의합니다\n"
			+ "   생성과 동시에 초기화가 가능한 생성자도 정의합니다\n"
			+ "   밑변과 높이 정보를 변경시킬 수 있는 메소드를 정의합니다\n"
			+ "   삼각형의 넓이를 계산해서 반환하는 메소드도 정의합니다\n"
			+ "   객체를 만들어서 사용해보세요\n"
			+ "   \n"
			+ "3. 다음 두 개의 static메소드를 가진 ArrayUtility클래스를 만들어보고 사용해보세요\n"
			+ "  static double[] intToDouble(int[] source);	// int배열을 double배열로 변환\n"
			+ "  static int[] doubleToInt(double[] source);	// double배열을 int배열로 변환\n"
			+ "\n"
			+ "4. 다음 두 개의 static 가진 ArrayUtility2클래스를 만들어보고 사용하세요\n"
			+ "  static int[] concat(int[] s1, int[] s2);	// s1과 s2를 연결한 새로운 배열 리턴\n"
			+ "  static int[] remove(int[] s1, int[] s2);	// s1에서 s2배열의 숫자를 모두 삭제한 새로운 배열 리턴\n"
			+ "  \n"
			+ "5. 다음 클래스를 정의하세요\n"
			+ "   1) 어린아이가 가지고 있는 구슬 개수 정보를 담을 수 있다\n"
			+ "   2) 놀이를 통한 구슬의 주고받음을 표현하는 메소드가 존재한다\n"
			+ "   3) 어린이의 현재 구슬 개수를 출력하는 메소드가 존재한다.\n"
			+ " \n"
			+ "   main에서는 객체를 이렇게 만듭니다\n"
			+ "     어린이1의 보유자산 -> 구슬 15개\n"
			+ "     어린이2의 보유자산 -> 구슬 9개\n"
			+ "     1차 놀이에서 어린이1은 어린이2의 구슬 2개를 획득한다\n"
			+ "     2차 놀이에서 어린이2는 어린이 1의 구슬 7개를 획득한다\n"
			+ "     마지막으로 각각의 어린이가 보유하고 있는 구슬의 수를 출력한다\n"
			+ "     프로그램을 종료한다."
			+ "";
	
	System.out.println("\n\n\n------------------------------------");
	System.out.println(menuStr);
}

// 문제 번호를 선택하는 메서드
// sc 매개변수는 입력을 받기 위한 Scanner 객체를 전달받는 변수
public static int getSelectMenu(Scanner sc) {		
	
	System.out.print("\n\n 메뉴 선택 >> ");
	
	// 문자열 번호 -> 정수로 변환
	String strNum = sc.next();
	int num = Integer.parseInt(strNum);
	
	return num;
}

// 1번 문제에 대한 풀이
public static void answer1(Scanner sc) {
	Add add = new Add();
	Sub sub = new Sub();
	Mul mul = new Mul();
	Div div = new Div();
	
	add.setValue(4, 6);
	sub.setValue(6, 4);
	mul.setValue(3, 7);
	div.setValue(4, 3);
	
	System.out.printf("add : %d\n", add.caculate());
	System.out.printf("sub : %d\n", sub.caculate());
	System.out.printf("mul : %d\n", mul.caculate());
	System.out.printf("div : %d\n", div.caculate());
}

// 2번 문제에 대한 풀이
public static void answer2(Scanner sc) {
	Triangle triangle = new Triangle(3, 4);
	System.out.printf("삼각형의 넓이 : %d\n\n", triangle.caculate());
}

// 3번 문제에 대한 풀이
public static void answer3(Scanner sc) {
	int[] intArr = {1, 2, 3, 4, 5}; // 정수 배열 선언
    double[] doubleArr = ArrayUtility.intToDouble(intArr); // 바꾼 실수 배열을 넣을 곳

    System.out.printf("기존 정수 배열 : %s\n", Arrays.toString(intArr));
    System.out.printf("바뀐 실수 배열 : %s\n\n", Arrays.toString(doubleArr));

    double[] doubleArr2 = {1.5, 2.5, 3.5, 4.5, 5.5}; // 실수 배열 선언
    int[] intArr2 = ArrayUtility.doubleToInt(doubleArr2); // 바꾼 정수 배열을 넣을 곳
    
    System.out.printf("기존 실수 배열 : %s\n", Arrays.toString(doubleArr2));
    System.out.printf("바뀐 정수 배열 : %s\n", Arrays.toString(intArr2));
}

// 4번 문제에 대한 풀이
public static void answer4(Scanner sc) {

}

// 5번 문제에 대한 풀이
public static void answer5(Scanner sc) {
	// Child 1, Child 2 생성 및 구슬 개수 초기세팅 
    Child child1 = new Child(15);
    Child child2 = new Child(9);

    // 현재 가진 구슬 개수
    System.out.println("아이 1 현재 가진 구슬 개수 : " + child1.getMarbles());
    System.out.println("아이 2 현재 가진 구슬 개수 : " + child2.getMarbles());

    // 아이1이 2에게 구슬 2개 얻음
    child1.playWith(child2, 2);
    // 아이2가 1에게 구슬 7개 얻음
    child2.playWith(child1, 7);
    System.out.println("아이 1 게임 후 가진 구슬 개수 : " + child1.getMarbles());
    System.out.println("아이 2 게임 후 가진 구슬 개수 : " + child2.getMarbles());
}

// 전체의 시작인 main 메서드
public static void main(String[] args) {
	
	/*Scanner를 생성/close()를 반복하면 Error가 발생하므로
	 * 객체를 1번 생성해놓고 메서드의 매개변수로 전달해서 사용하도록 한다
	 */
	Scanner sc = new Scanner(System.in);
	
	// isRun이 true면 반복이 계속되고, false면 반복문 탈출
	boolean isRun = true;
	
	while(isRun) {
		printMenu();			        // 메뉴 보여주기
		int selNum = getSelectMenu(sc); // 번호 선택하기
		
		switch(selNum) {
		case 1:
			answer1(sc);				// 1번문제해답
			break;
		case 2:
			answer2(sc);				// 2번문제해답
			break;
		case 3:
			answer3(sc);				// 3번문제해답
			break;
		case 4:
			answer4(sc);				// 4번문제해답
			break;
		case 5:
			answer5(sc);				// 5번문제해답
			break;
		case 6:
			isRun = false;				// 6번 탈출
			break;
		default:
			System.out.println("번호를 잘 못 입력했습니다.");
			break;
		}			
	}

	System.out.println("Program End~");
	
	// 키보드 입력을 받는 스트림 종료
	sc.close();
}
}





