package ch09.resolve14;

import ch09.resolve14.tabletOrder.TabletTester;
import ch09.resolve14.tabletType.*;

/*
 * 2. ITablet 인터페이스를 만드세요.
   아래 메서드를 멤버로 추가하세요.
   void movie();
   void music();
   void readBook();
   
   ITablet를 상속받은 삼성, 소니, LG는 Tablet을 구현클래스로 만들고
   OEM을 의뢰한 비트캠프는 TabletTester를 생성합니다.
   이 클래스들이 완성되면 TabletMain에서 테스트를 진행하세요.
 */
public class TabletMain {
	public static void main(String[] args) throws InterruptedException {
		TabletTester tabletTester = new TabletTester();
		ITablet[] tabletArr = new ITablet[] { new Samsung(), new Sony(), new LG() };
		int[] score = new int[tabletArr.length];
		for (int i = 0; i < tabletArr.length; i++) {
			tabletTester.setTablet(tabletArr[i]);
			
			score[i] += tabletTester.movieTest();
			System.out.printf("---movie 테스트 점수는 %d입니다.\n", score[i]);
			score[i] += tabletTester.musicTest();
			System.out.printf("---music 점수는 %d입니다.\n", score[i]);
			score[i] += tabletTester.readBookTest();
			System.out.printf("---read book 점수는 %d입니다.\n", score[i]);
			System.out.println("----------------------------------------------");
		}
		
		// 가장 큰 점수를 받은 값과 index 찾기
		int max = score[0];
		int maxIdx = 0;
		for (int i = 0; i < score.length; i++) {
			if(max < score[i]) { 
				max = score[i];
				maxIdx = i;
			}
		}
		
		System.out.printf("가장 높은 점수를 받은 타블렛은 %d번째고 점수는 %d입니다.\n", maxIdx+1, max);
		System.out.println(tabletArr[maxIdx].getClass().getName());
	}
}
