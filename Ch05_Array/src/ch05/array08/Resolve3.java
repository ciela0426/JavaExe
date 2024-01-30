package ch05.array08;

import java.util.Arrays;
import java.util.Collections;

/*
 * 정수 배열 5개를 할당하고
 *System.out.println(Arrays.toString(numArr));
 *로 배열을 출력했을 때 거꾸로 출력되도록
 *배열의 값을 거꾸로 저장하세요.
 */
public class Resolve3 {
	public static void main(String[] args) {
		Integer[] numArr = {23,5,63,17,73};
		
//		Arrays.sort(numArr);
//		정렬하라는 말 없었으므로....!
//        Arrays.sort(numArr, Collections.reverseOrder());
		/*
		 * numArr.length/2 까지하면 앞과 뒤의 값 모두 접근
		 * 만약 numArr.length로 하면 다시 원래대로 돌아
		 */
		for (int i = 0; i < numArr.length/2; i++) { // 나누기 2를 하지 않으면 값이 원래대로 돌아가므로!
			int fIdx = i;						// 교체할 앞의 값 위치
			int lIdx = numArr.length - 1 - i;	// 교체할 뒤의 값 위치
			int pre = numArr[fIdx];				// 앞의 값
			int suf = numArr[lIdx];				// 뒤의 값
			
			numArr[fIdx] = suf;					// 뒤의 값을 앞의 위치에 저장
			numArr[lIdx] = pre;					// 앞의 값을 뒤의 위치에 저장
			
			System.out.println(Arrays.toString(numArr));
		}
		
		System.out.println("처리 후 : " + Arrays.toString(numArr));
	}
}
